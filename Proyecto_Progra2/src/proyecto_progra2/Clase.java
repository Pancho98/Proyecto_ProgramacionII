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
 * @author Francisco Santos
 */
public class Clase implements Serializable{
    private String Nombre;
    private ArrayList<Atributo>atributos= new ArrayList();
    private ArrayList<Clase>herencia=new ArrayList<>();
    private ArrayList<Metodo>metodos=new ArrayList<>();
    private static final long SerialVersionUID=7777L;
    
    public Clase() {
    }

    public Clase(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<Clase> getHerencia() {
        return herencia;
    }

    public void setHerencia(ArrayList<Clase> herencia) {
        this.herencia = herencia;
    }

    public void AnadirHerencia(Clase c) {
        this.herencia.add(c);
    }
    
    public void AnadirAtributo(Atributo a) {
        this.atributos.add(a);
    }
    
    public void AnadirMetodo(Metodo m) {
        this.metodos.add(m);
    }
    
    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodo> metodos) {
        this.metodos = metodos;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
