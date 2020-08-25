package LibraryLayer;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class CreateReference {

	public static Map<String, String> refMap = new HashMap<String, String>();
	public static String strArray[] = new String[2];

	  /**
 	 * This method is to read the excel sheet and to create a reference map with all the attributes and values
 	 * All the values in excel sheet can be referenced from the map created
 	 * @return void This method does not return any value
 	 */
	public static void createReference() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("The user directory is "+System.getProperty("user.dir"));
		
		String path=System.getProperty("user.dir")+"\\Data2.xls";
	
		POIFSFileSystem file = new POIFSFileSystem(
				new FileInputStream(path));
		
		HSSFWorkbook workbook = new HSSFWorkbook(file);

	
		
		  HSSFSheet sheerefMap = workbook.getSheet("Main");
		  
		  int lastRow1 = sheerefMap.getLastRowNum(); for(int i=1;i<=lastRow1;i++) { Row
		  row = sheerefMap.getRow(i); Cell valueCell = row.getCell(1); Cell keyCell =
		  row.getCell(0); String value = valueCell.getStringCellValue().trim(); String
		  key = keyCell.getStringCellValue().trim(); refMap.put(key, value); }
		 
		
HSSFSheet homePagesheet = workbook.getSheet("HomePage");
		
		int homePagelastRow = homePagesheet.getLastRowNum();
		for(int i=1;i<=homePagelastRow;i++)
		{
			Row row = homePagesheet.getRow(i);
		    Cell valueCell = row.getCell(1);
		Cell keyCell = row.getCell(0);
			String value = valueCell.getStringCellValue().trim();
			String key = keyCell.getStringCellValue().trim();
			refMap.put(key, value);
		}
		
		
	
		
		
		

		
		
	}
	
	


}