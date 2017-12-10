/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_progra2;

import java.util.ArrayList;

/**
 *
 * @author Francisco Santos
 */
public class Clase {
    private String Nombre;
    ArrayList<Variables> variables = new ArrayList();

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

    public ArrayList<Variables> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<Variables> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
