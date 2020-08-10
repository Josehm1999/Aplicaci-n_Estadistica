
package Clases;

import java.util.ArrayList;

public class Poblacion {
    
    private ArrayList<String> DatosP1;
    private ArrayList<String> DatosP2;
    public Poblacion(ArrayList DatosP1, ArrayList DatosP2){
        this.DatosP1=DatosP1;
        this.DatosP2=DatosP2;
    }  
    public Poblacion(){
        
    }
    public ArrayList getDatosP1(){
        return DatosP1;
    }
    public ArrayList getDatosP2(){
        return DatosP2;
    }
}

