/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_progra2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author JSantos
 */
public class Metodo implements Serializable{
    private String nombre;
    private String tipo;
    private ArrayList<Atributo>ListaAtributos=new ArrayList();
    private String Return;
    private String alcance;
    private static final long SerialVersionUID=7877L;

    public Metodo() {
    }

    public Metodo(String nombre, String tipo, String Return, String alcance) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.Return = Return;
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

    public ArrayList<Atributo> getListaAtributos() {
        return ListaAtributos;
    }

    public void setListaAtributos(ArrayList<Atributo> ListaAtributos) {
        this.ListaAtributos = ListaAtributos;
    }

    public String getReturn() {
        return Return;
    }

    public void setReturn(String Return) {
        this.Return = Return;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }
    public void setAtributo(Atributo a){
        ListaAtributos.add(a);
    }
    
}
