package proyecto_progra2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author JSantos
 */
public class AdminDiagramas {
     private ArrayList <Diagrama> elementos=new ArrayList();
    private File archivo=null;

    public AdminDiagramas(String Path) {
      archivo = new File(Path);
    }

    public ArrayList<Diagrama> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Diagrama> elementos) {
        this.elementos = elementos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void AgregarElemento(Diagrama E){
        elementos.add(E);
    }
        public void EscribirArchivo() throws IOException{
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try{
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Diagrama Clase : elementos) {
               bw.writeObject(Clase);
            }
            bw.flush();
        }catch(Exception ex){
        }
        
        bw.close();

        fw.close();
    }
    
    
        public void CargarArchivo(){
        try{
            elementos=new ArrayList();
          Diagrama temp;
            if (archivo.exists()) {
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto =new ObjectInputStream(entrada);
                try{
                    while((temp=(Diagrama)objeto.readObject())!=null){
                        elementos.add(temp);
                    }
                }catch(EOFException e){
                    //SIEMPRE VA A TIRAR ERROR
                    //Encontro el final del archivo.
                }
                 objeto.close();//cierre del buffer
                 entrada.close();//cierre del canal , se abren inversamete a como se abren 
                 
            }//fin del if
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
