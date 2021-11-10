/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author eddie.hernandezusam
 */
public class referencia {
    
    private int id_referencia; 
private String nombre; 
private String apellido; 
private String dui; 
private int telefono; 
private String tiemp_de_conocer;

    public int getId_referencia() {
        return id_referencia;
    }

    public void setId_referencia(int id_referencia) {
        this.id_referencia = id_referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTiemp_de_conocer() {
        return tiemp_de_conocer;
    }

    public void setTiemp_de_conocer(String tiemp_de_conocer) {
        this.tiemp_de_conocer = tiemp_de_conocer;
    }


}
