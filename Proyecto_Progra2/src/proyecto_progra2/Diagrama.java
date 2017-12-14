/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_progra2;

import java.io.Serializable;
import javax.swing.JTree;

/**
 *
 * @author JSantos
 */
public class Diagrama extends JTree implements Serializable{
    private Clase clase;
    private static final long SerialVersionUID=7856L;

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase=clase;
    }
    
    public String GenerarCodigo(){
        String Heredados = "";
        String Constructor="";
        String Constructor_l="";
        if (clase.getHerencia().size()>0) {
            Heredados+=":";
            for (int i = 0; i < clase.getHerencia().size(); i++) {
                if (i==clase.getHerencia().size()-1) {
                    Heredados+="Public "+clase.getHerencia().get(i).getNombre();
                }else{
                    Heredados+="Public "+clase.getHerencia().get(i).getNombre()+", ";
                }
            }
        }
        String Codigo="//-----------------------------Inicio de Clase----------------------------\n"
                + "#include<iostream>\n"
                + " #include <string> \n"
                + " using namespace std;\n"
                + "";
        String Public="\n public:\n";
        String Private="\n private:\n";
        String Protected="\n protected:\n";
        
        Codigo+="class "+clase.getNombre()+Heredados+"{";
        for (Atributo t : clase.getAtributos()) {
            if ("Public".equals(t.getAlcance())) {
                String Tipo=""+t.getTipo();
                Public+=Tipo.toLowerCase()+" "+t.getNombre()+";\n";
            }else if(t.getAlcance().equals("Private")){
                String Tipo=""+t.getTipo();
                Private+=Tipo.toLowerCase()+" "+t.getNombre()+";\n";
            }else if(t.getAlcance().equals("Protected")){
                String Tipo=""+t.getTipo();
                Protected+=Tipo.toLowerCase()+" "+t.getNombre()+";\n";
            }
        }
        for (Metodo t : clase.getMetodos()) {
            String Parametros="";
            for (int i = 0; i < t.getListaAtributos().size(); i++) {
                String Tipo=""+t.getListaAtributos().get(i).getTipo();
                if (i==t.getListaAtributos().size()-1) {
                    Parametros+=Tipo.toLowerCase()+" "+t.getListaAtributos().get(i).getNombre()+")\n;";
                }else{
                    Parametros+=Tipo.toLowerCase()+" "+t.getListaAtributos().get(i).getNombre()+", ";
                }
            }
            String Tipo=""+t.getReturn();
            if (t.getAlcance().equals("Public")) {
                Public+="//Metodo\n\n"+Tipo.toLowerCase()+" "+t.getNombre()+"("+Parametros;
            }else if(t.getAlcance().equals("Private")){
                Private+="//Metodo\n\n"+Tipo.toLowerCase()+" "+t.getNombre()+"("+Parametros;
            }else if(t.getAlcance().equals("Protected")){
                Protected+="//Metodo\n\n"+Tipo.toLowerCase()+" "+t.getNombre()+"("+Parametros;
            }
        }
        String Constructores="//Constructores: \n\n";
        Constructores+="//Simple\n"+
                clase.getNombre()+"();\n\n";
        Constructores+="//Sobrecargado\n";
        for (int i = 0; i < clase.getAtributos().size(); i++) {
            Constructor+=clase.getAtributos().get(i).getNombre()+"=variable_"+i+";\n";
            String Tipo=""+clase.getAtributos().get(i).getTipo();
            if (i==clase.getAtributos().size()-1) {
                Constructor_l+=Tipo.toLowerCase()+" variable_"+i;
            }else{
                Constructor_l+=Tipo.toLowerCase()+" variable_"+i+", ";
            }
        }
        Constructores+=clase.getNombre()+"("+Constructor_l+");\n"+
            Constructor+"\n\n";
        Constructores+="//Destructor\n ~"+clase.getNombre()+"();\n\n};\n";
        Codigo+= Public + Private + Protected + Constructores+"\n//----------------------------Fin de Clase----------------------------";
        return Codigo;
    }
    
}
