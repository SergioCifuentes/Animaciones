/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaciones.Objetos;

/**
 *
 * @author sergio
 */
public class Imagen {
    private String id;
    private int duracion;
    private int indice;

    public Imagen(String id, int duracion, int indice) {
        this.id = id;
        this.duracion = duracion;
        this.indice = indice;
    }

    public String getId() {
        return id;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getIndice() {
        return indice;
    }
    
}
