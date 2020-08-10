package Clases;
import java.util.ArrayList;
import lib.ExcelDataConfig;
public class Calculos extends Poblacion{
    private long[][] matriz;
    private double NroColumnas, NroFilas;
    ExcelDataConfig excel;
    public Calculos(String Ruta){
        excel = new ExcelDataConfig(Ruta);
        this.matriz = excel.getDataExcel();
        this.NroColumnas = matriz.length;
        this.NroFilas = matriz[0].length;
    }
    public Calculos(ArrayList DatosP1, ArrayList DatosP2){
        super(DatosP1,DatosP2);
    }  
    public long[][] getMatriz() {
        return matriz;
    }

    public double getNroColumna() {
        return NroColumnas;
    }
    public double getNroFilas() {
        return NroFilas;
    } 
    public double gradosLibertad() {
        double grado_libertad;
        grado_libertad = (getNroColumna() - 1) * (getNroFilas() - 1);
        return grado_libertad;
    }
}
