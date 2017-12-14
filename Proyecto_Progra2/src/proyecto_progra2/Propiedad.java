/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_progra2;

/**
 *
 * @author JSantos
 */
public class Propiedad {
    Object valor;
    String nombre;
    Object tipo;
    String Alcance;
    private static final long SerialVersionUID=7877L;

    public Propiedad() {
    }

    public Propiedad(Object valor, String nombre, Object tipo, String Alcance) {
        this.valor = valor;
        this.nombre = nombre;
        this.tipo = tipo;
        this.Alcance = Alcance;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getTipo() {
        return tipo;
    }

    public void setTipo(Object tipo) {
        this.tipo = tipo;
    }

    public String getAlcance() {
        return Alcance;
    }

    public void setAlcance(String Alcance) {
        this.Alcance = Alcance;
    }

    @Override
    public String toString() {
        return "("+tipo+")"+nombre;
    }
    
    
    
}
