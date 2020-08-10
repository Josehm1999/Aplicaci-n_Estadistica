/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

    XSSFWorkbook wb1;
    XSSFSheet sh1;

    public ExcelDataConfig(String Path) {
        try {
            File src = new File(Path);
            FileInputStream fis = new FileInputStream(src);
            wb1 = new XSSFWorkbook(fis);
            sh1 = wb1.getSheetAt(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getValorCritico() throws Exception {
    }

    public long[][] getDataExcel() {
        long[][] matriz = new long[3][3];
        for (int n = 0; n < matriz.length; n++) { //Columnas
            for (int i = 0; i < matriz.length; i++) { //Filas
                matriz[n][i] = (long) sh1.getRow(i).getCell(n).getNumericCellValue();
            }
        }
        return matriz;
    }
}
