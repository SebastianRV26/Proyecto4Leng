/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author Sebas
 */
public class Project implements Serializable{
 
    private String nombreProyecto;
    private Image originalImage; 
    private Image outputImage; 

    public Project(String nombreProyecto, Image originalImage, Image outputImage) {
        this.nombreProyecto = nombreProyecto;
        this.originalImage = originalImage;
        this.outputImage = outputImage;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Image getOriginalImage() {
        return originalImage;
    }

    public void setOriginalImage(Image originalImage) {
        this.originalImage = originalImage;
    }

    public Image getOutputImage() {
        return outputImage;
    }

    public void setOutputImage(Image outputImage) {
        this.outputImage = outputImage;
    }
}
