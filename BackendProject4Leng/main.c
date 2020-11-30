#include <stdio.h>
#include <stdlib.h>
#include "string.h"
#include <SFML/Graphics.h>

/**
 * @author Sebastian Rojas Vargas.
 * Compilador: MinGW 32 bits.
 * Librerías externas:
 * SFML (v2.5.1) https://www.sfml-dev.org/download.php (GCC 7.3.0 MinGW (DW2) - 32-bit)
 * CSFML https://www.sfml-dev.org/download/csfml/ (GCC - 32-bit)
 */

/// Variables globales.
unsigned int width, height;
unsigned int sizeText;
char *size;
int flag = 0;

/**
 * Reajuste de dimensiones de la imagen a 1000x1000.
 */
sfImage* resize(sfImage *originalImage){
    sfImage *image = NULL;
    sfSprite *sprite = sfSprite_create();
    sfTexture *texture = sfTexture_createFromImage(originalImage, NULL);

    sfVector2f vectorRequired = {(float)(1000.0/width), (float)(1000.0/height)};
    sfSprite_setTexture(sprite, texture, sfTrue);
    sfSprite_setScale(sprite, vectorRequired);
    sfFloatRect newSize = sfSprite_getGlobalBounds(sprite);
    width = (int)newSize.width;
    height = (int)newSize.height;

    sfRenderTexture *renderTexture = sfRenderTexture_create(width, height, sfTrue);
    sfRenderTexture_drawSprite(renderTexture, sprite,NULL);
    const sfTexture *pTexture = sfRenderTexture_getTexture(renderTexture);
    image = sfTexture_copyToImage(pTexture);
    sfImage_flipVertically(image);
    return image;
}

/**
 * 1. Carga de imagenes en los formatos: JPG, BMP y PNG.
 *
 * Resolución mínima: 400x400.
 * Resolución máxima: 1000x1000.
 * Resize si pasa la resolución: 1000X1000.
 *
 * @param path: ruta, nombre y extención de la imagen
 * @return image (sfImage) imagen a utilizar.
 */
sfImage *loadImage(char *path){
    sfImage* image = NULL;
    image = sfImage_createFromFile(path);
    sfVector2u sizes = sfImage_getSize(image);

    width = sizes.x;
    height = sizes.y;

    int minSize = 400;
    int maxSize = 1000;
    printf("\nDimensiones de la imagen original: largo: %i, altura: %i", width, height);
    flag = 1;
    if (width < minSize || height < minSize){
        printf("\nImagen demaciado pequennia");
        flag = 0;
        return NULL;
    } else if (width > maxSize || height > maxSize) {
        printf("\nSe hizo un reajuse de dimensiones a %ix%i", maxSize, maxSize);
        return resize(image);
    }
    return image;
}

/**
 * 4. Almacenamiento de la imagen en memoria.
 *
 * @param image: imagen a guardar.
 * @param path: ruta, nombre y extención de la imagen a guarar.
 */
void saveImage(struct sfImage *image, char *path){
    if (image != NULL) {
        sfImage_saveToFile(image, path);
        printf("\nImagen guardada correctamente");
    }
}

/**
 * 2. Personalización del texto a mostrar en la imagen.
 *
 * @param sizeTextP 0 pequeño, 1 grande.
 * @param typeText 0 Arial, 1 Times New Roman, 2 Nirvana.
 */
char* setTypes(char *sizeTextP, char *typeText){
    if (flag == 0){
        return NULL;
    }
    //size = sizeTextP;
    size = (char*) malloc(1);
    strcpy(size, sizeTextP);
    if (strcmp(sizeTextP, "0") == 0){
        printf("\nUsted escogio letra pequenniaa");
        sizeText = height/15;
    } else if (strcmp(sizeTextP, "1") == 0){
        printf("\nUsted escogio letra grande");
        sizeText = height/10;
    }
    if (strcmp(typeText, "1") == 0){
        printf("\nUsted escogio Times New Roman");
        return "fonts\\times.ttf";
    } else if (strcmp(typeText, "2") == 0){
        printf("\nUsted escogio Nirvana");
        return "fonts\\NIRVANA.TTF";
    }
    printf("\nUsted escogio Arial");
    return "fonts\\arial.ttf";
}

/**
 * 3. Se establece el tamaño y fuente del texto ya seleccionados, se selecciona el color
 * y se posiciona el texto en la imagen.
 * Si el texto es muy largo se recorta.
 *
 * @param text1: texto que irá en la posición de arriba.
 * @param text2: texto que irá en la posición debajo.
 * @param image: imagen a utilizar,
 * @param typeFont: tipo de fuente de la letra (Arial, Times New Roman o Nirvana).
 * @param color: 0 blanco, 1 negro.
 * @return imageWithText: nueva imagen con el texto.
 */
sfImage *setText(char *text1, char *text2, struct sfImage *image, char *typeFont, int color){
    /// Si la imagen es demaciado pequeña no se utiliza.
    if (flag == 0){
        return NULL;
    }
    /// Se crean los objetos de tipo texto y se setean su contenido
    sfText* textoArriba = sfText_create();
    sfText* textoDebajo = sfText_create();
    sfText_setString(textoArriba, text1);
    sfText_setString(textoDebajo, text2);

    /// Se crea la textura del tamaño de la imagen
    sfTexture *texture = sfTexture_createFromImage(image, NULL); // textura
    sfSprite *sprite = sfSprite_create(); // sprite

    /// Color del texto por defecto: blanco, si es 1 se cambia a negro.
    if (color == 1) {
        sfText_setColor(textoArriba, sfBlack);
        sfText_setColor(textoDebajo, sfBlack);
    }
    /// Establecer la posición del textp
    sfVector2f position1 = {200, 10};
    unsigned int pos = height-(height/12);
    if (strcmp(size,"1") == 0){
        pos = height-(height/8);
    }
    sfVector2f position2 = {200, (float)pos};
    sfText_setPosition(textoArriba, position1);
    sfText_setPosition(textoDebajo, position2);

    /// Cambiar la textura de origen de un objeto
    sfSprite_setTexture(sprite, texture, sfTrue);

    /// Se establece el tipo de fuente a los textos.
    sfFont * font = sfFont_createFromFile(typeFont);
    sfText_setCharacterSize(textoArriba, sizeText);
    sfText_setFont(textoArriba, font);
    sfText_setCharacterSize(textoDebajo, sizeText);
    sfText_setFont(textoDebajo, font);

    /// Se crea un renderTexture del largo y ancho de la imagen.
    sfRenderTexture *renderTexture = sfRenderTexture_create(width, height, sfTrue);
    sfRenderTexture_drawSprite(renderTexture, sprite,NULL);
    sfRenderTexture_drawText(renderTexture, textoArriba,NULL);
    sfRenderTexture_drawText(renderTexture, textoDebajo,NULL);
    const sfTexture *pTexture = sfRenderTexture_getTexture(renderTexture);

    /// Se obtiene una nueva imagen con el texto.
    sfImage *imageWithText = sfTexture_copyToImage(pTexture);
    sfImage_flipVertically(imageWithText);
    return imageWithText;
}

const char *concatPathSaveImage(const char *imageName) {
    if(imageName != NULL){
        //createFolder();
        const char *path = "C:\\Users\\edubi\\OneDrive\\Pictures\\Postales\\";
        char *filename = (char *) malloc(strlen(path) + strlen(imageName) + 1);
        strcpy(filename, path);
        strcat(filename, imageName);
        return filename;
    }
    return NULL;
}

/**
 * Pruebas.
 *
 * @return 0.
 */
int main(int argc, char *argv[]) {
    printf("\n\n//////////////////////////////////////////////////////////////////");
    /// Paso 1
    char *ruta = argv[5];
    char *nameImageOutput = argv[6];
    //sfImage *image = loadImage(ruta);
    //sfImage *image = loadImage("C:\\Users\\Usuario\\Downloads\\okabe.jpg");
    sfImage *image = loadImage(ruta);
    /// Paso 2
    // sizeText and typeText
    char *typeFont = setTypes(argv[1], argv[2]);
    /// Paso 3
    // arriba, abajo
    image = setText(argv[3],argv[4], image, typeFont, 0);
    /// Paso 4
    saveImage(image, nameImageOutput);

    printf("Hola desde C %i",argc);
    return 0;
}
