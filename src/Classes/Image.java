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
public class Image implements Serializable{

    private String ruta;
    private String tipoArchivo; // Imagen PNG
    private double pesoMemoria; // 2.1 MB
    private String largo;
    private String altura;
    private String ultimaModificacion;

    public Image(String ruta, String tipoArchivo, double pesoMemoria, String largo, String altura, String ultimaModificacion) {
        this.ruta = ruta;
        this.tipoArchivo = tipoArchivo;
        this.pesoMemoria = pesoMemoria;
        this.largo = largo;
        this.altura = altura;
        this.ultimaModificacion = ultimaModificacion;
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

    public String getInfo() {
        String info = "";
        info += "Ruta " + ruta
                + "\nExtención " + tipoArchivo
                + "\nTamaño " + largo + "x" + altura
                + "\nTamaño en memoria " + pesoMemoria + " bytes"
                + "\nÚltima modificación: " + ultimaModificacion;

        return info;
    }

}
