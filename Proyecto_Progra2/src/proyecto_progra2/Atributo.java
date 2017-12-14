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
    Object Valor;
     String Nombre;
    Object tipo;
   String Alcance;
 private static final long SerialVersionUID=262626L;
    public String getAlcance() {
        return Alcance;
    }


    public void setAlcance(String Alcance) {
        this.Alcance = Alcance;
    }

    public Atributo() {
        
    }
    
     public Atributo(String n) {
         Nombre=n;      
    }

    public Object getValor() {
        return Valor;
    }

    public void setValor(Object Valor) {
        this.Valor = Valor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Object getTipo() {
        return tipo;
    }

    public void setTipo(Object tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "("+tipo+')'+Nombre;
    }
    
    
}
