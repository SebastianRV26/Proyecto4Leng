/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Sebas
 */
public class Image {
    private String ruta;
    private String tipoArchivo; // Imagen PNG
    private double pesoMemoria; // 2.1 MB

    public Image(String ruta, String tipoArchivo, double pesoMemoria) {
        this.ruta = ruta;
        this.tipoArchivo = tipoArchivo;
        this.pesoMemoria = pesoMemoria;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public double getPesoMemoria() {
        return pesoMemoria;
    }

    public void setPesoMemoria(double pesoMemoria) {
        this.pesoMemoria = pesoMemoria;
    }
    
    
}
