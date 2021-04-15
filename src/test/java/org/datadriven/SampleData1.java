package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleData1 {
	
	public static void main(String[] args) throws IOException {
		
		//1.file location
		
		File f=new File("C:\\Users\\Nirmala Gopinath\\eclipse-workspace\\FrameClass1\\excel\\nirmala.xlsx");
		
		//2.create a workbook
		
        Workbook book=new XSSFWorkbook();
        
        //4.to fetch a sheet
        
        Sheet sh=book.getSheet("Data1");
        
        //5.to create a new row
        
        Row r=sh.createRow(0);

        //6. to create a new cell
        
        Cell c=r.createCell(0);
        
        //7.set a value for the cell
        
        c.setCellValue("Username");
        
        //8.to write a file
        
        FileOutputStream fo=new FileOutputStream(f);
        
        //9.to write in a file
        
        book.write(fo);
        
        System.out.println("Done...");
        
        
       
	}
}


