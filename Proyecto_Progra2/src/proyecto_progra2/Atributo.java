/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_progra2;

import java.io.Serializable;

/**
 *
 * @author JSantos
 */
public class Atributo implements Serializable{
    private String nombre;
    private String tipo;
    private String alcance;
    private static final long SerialVersionUID=7857L;

    public Atributo() {
    }

    public Atributo(String nombre, String tipo, String alcance) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.alcance = alcance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }
    
    
}
