package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     FileInputStream  fis = new FileInputStream("./testData/abc.xlsx");
     Workbook workbook= WorkbookFactory.create(fis);
     Sheet sheet= workbook.getSheet("Sheet1");
     Row row = sheet.getRow(2);
     Cell cell = row.getCell(0);
     String customerName2 = cell.getStringCellValue();
     System.out.println("The customer 2 name is:"+ customerName2);
    
    int customer2PhoneNo = (int)row.getCell(1).getNumericCellValue();
    System.out.println("The customer 2 phone no:"+ customer2PhoneNo);
   
    int  customer1PhoneNo =(int) sheet.getRow(1).getCell(1).getNumericCellValue();     
    System.out.println("The customer 1 phone no:"+ customer1PhoneNo);
    
    boolean customer1Status =sheet.getRow(1).getCell(2).getBooleanCellValue();
    if(customer1Status) {
    	System.out.println("customer is active");
    }
    else {
    	System.out.println("customer is inactive");
    	
    }
    	
    	
    	
    	
    	
    }
		


	}

}
