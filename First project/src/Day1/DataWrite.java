package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {

    public void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite) throws IOException{

        //Create an object of File class to open xlsx file

        File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook guru99Workbook = null;

        //Find the file extension by splitting  file name in substring and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

        //If it is xlsx file then create object of XSSFWorkbook class

        guru99Workbook = new XSSFWorkbook(inputStream);

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of XSSFWorkbook class

            guru99Workbook = new HSSFWorkbook(inputStream);

        }    

    //Read excel sheet by sheet name    

    Sheet sheet = guru99Workbook.getSheet(sheetName);

    //Get the current count of rows in excel file

    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

    //Get the first row from the sheet

    Row row = sheet.getRow(0);

    //Create a new row and append it at last of sheet

    Row newRow = sheet.createRow(rowCount+1);

    //Create a loop over the cell of newly created Row

    for(int j = 0; j < row.getLastCellNum(); j++){

        //Fill data in row

        Cell cell = newRow.createCell(j);

        cell.setCellValue(dataToWrite[j]);

    }

    //Close input stream

    inputStream.close();

    //Create an object of FileOutputStream class to create write data in excel file

    FileOutputStream outputStream = new FileOutputStream(file);

    //write data in the excel file

    guru99Workbook.write(outputStream);

    //close output stream

    outputStream.close();
	
    }

    public static void main(String...strings) throws IOException{

        //Create an array with the data in the same order in which you expect to be filled in excel file

    	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.jotform.com/build/210364764713455#preview");
	   
	  String f_name = driver.findElement(By.id("first_4")).getTagName();
      String l_name = driver.findElement(By.id("last_4")).getTagName();
      String email = driver.findElement(By.id("input_10")).getTagName();
      String address_1 = driver.findElement(By.id("input_11_addr_line1")).getTagName();
      String address_2 = driver.findElement(By.id("input_11_addr_line2")).getTagName();
      String city = driver.findElement(By.id("input_11_city")).getTagName();
      String province = driver.findElement(By.id("input_11_state")).getTagName();
      String zip = driver.findElement(By.id("input_11_postal")).getTagName();
      String a_code = driver.findElement(By.id("input_6_area")).getTagName();
      String phone = driver.findElement(By.id("input_6_phone")).getTagName();
      String dob = driver.findElement(By.id("lite_mode_12")).getTagName();
    
      String company = driver.findElement(By.id("input_5")).getTagName();
      String letter = driver.findElement(By.id("input_7")).getTagName();
      String file = driver.findElement(By.id("input_8")).getTagName();
      
      System.out.print(f_name);
      System.out.println();
      System.out.print(l_name);
      
	    
	    
	    String[] valueToWrite = {f_name, l_name, email, address_1, address_2, city, province, zip, a_code, phone, dob, company, letter, file };

        //Create an object of current class

        DataWrite objExcelFile = new DataWrite();

        //Write the file using file name, sheet name and the data to be filled

        objExcelFile.writeExcel("D:\\eclipse", "user data 3.xlsx", "Sheet1", valueToWrite);

    }

}