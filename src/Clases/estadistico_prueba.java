package Clases;

import java.text.DecimalFormat;
import java.util.ArrayList;
import org.apache.commons.math3.stat.inference.TestUtils;

public class estadistico_prueba extends Calculos {

    DecimalFormat formato2 = new DecimalFormat("#.##");
    boolean PInd = TestUtils.chiSquareTest(getMatriz(), 0.05);
    long[][] matriz = getMatriz();
    double [] frecuenciaArray=new double[matriz.length];
    double EstadisticoPrueba = 0;
    public estadistico_prueba(String ruta) {
        super(ruta);
    }

    public String determinarEstadisticoP() {
        double sumaFila,
                sumaColumna,
                Total = 0, frecuencia_esperada;
        double[] arregloColumna = new double[matriz.length],
                arregloFila = new double[matriz.length];
        for (int f = 0; f < matriz.length; f++) { //Filas
            sumaFila = 0;
            sumaColumna = 0;
            for (int c = 0; c < matriz[f].length; c++) { //Columnas
                sumaFila += matriz[f][c];
                sumaColumna += matriz[c][f];
            }
            arregloColumna[f] = sumaColumna; //Arreglo de la suma de columnas
            arregloFila[f] = sumaFila;        //Arreglo de suma de filas
            Total += arregloColumna[f]; //Se puede utilizar el arreglo de filas como de columnas

        }
        for (int f = 0; f < matriz.length; f++) {
            frecuencia_esperada = 0;
            for (int c = 0; c < matriz[f].length; c++) {
                frecuencia_esperada = arregloColumna[f] * arregloFila[c] / Total; //Frecuencia esperada
                frecuenciaArray[f]=frecuencia_esperada;
                
                EstadisticoPrueba += (Math.pow((matriz[c][f] - (frecuencia_esperada)), 2)) / frecuencia_esperada; //Estadístico de prueba
            }
        }
        return formato2.format(EstadisticoPrueba);
    }

    public String Procedimiento() {
        String Proce ="";
        String Division="";
        String Base="";
        for (int f = 0; f < matriz.length; f++) {
            
            for (int c = 0; c < matriz[f].length; c++) {
                if(f==2 && c==2){
                Proce+=("("+String.valueOf(matriz[c][f])+" - "+formato2.format(frecuenciaArray[f])+")²\n");  
                Division+=" -----------     \n";
                
                }else{
                Proce+=("("+String.valueOf(matriz[c][f])+" - "+formato2.format(frecuenciaArray[f])+")² + ");   
                Division+=" -----------       ";
                }
          
          Base+="     "+formato2.format(frecuenciaArray[f])+"         ";
            }
          
        }
        Proce =Proce+Division+Base;
        return Proce;
        
    }

    public String conclusion(ArrayList DatosP1, ArrayList DatosP2) {
        Poblacion Po = new Poblacion(DatosP1, DatosP2);
        if (PInd) {
            return "Con los datos de estudio brindados, existe suficiente evidencia estadística"
                    + "\npara rechazar la hipotesis nula(Ho). Lo que significa que se puede afirmar "
                    + "\nque existe una relación entre " + Po.getDatosP1().get(0) + " y " + Po.getDatosP2().get(0);
        } else {
            return "Con los datos de estudio brindados, existe suficiente evidencia estadística"
                    + " para aceptar la hipotesis nula (Ho). Lo que significa que se puede afirmar "
                    + "\nque no hay relación entre " + Po.getDatosP1().get(0) + " y " + Po.getDatosP2().get(0);
        }

    }
}
