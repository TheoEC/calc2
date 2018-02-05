package Serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Windows
 */

public class Le_planilha {
    FileInputStream planilha;
    
    public Le_planilha() {
            try {
                File file = new File("planilha.xlsx");
                this.planilha = new FileInputStream(file);
                
                XSSFWorkbook arquivo_excel = new XSSFWorkbook(); //cria planilha com todas as abas
                XSSFSheet aba = arquivo_excel.getSheetAt(0);//pega a primeira ABA/planilha do arquivo
                
                Iterator<Row> rowiterator = aba.iterator(); //retorna todas as linhas da planilha
                
                while(rowiterator.hasNext()){   //enquanto houver linha para ser lida
                    Row row = rowiterator.next();   //recebe linhas da planilha
                    Iterator<Cell> cellIterator = row.iterator();   //pega as celulas da linha
                    
                    while(cellIterator.hasNext()){
                        Cell cell = cellIterator.next();    //cria uma celula
                        System.out.println(cell.getStringCellValue());
                    }
                }
            System.out.println("Grade lida com sucesso");    
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Le_planilha.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}

