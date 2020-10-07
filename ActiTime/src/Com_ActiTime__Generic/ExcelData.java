package Com_ActiTime__Generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getData(String file_Path,String sheet_name,int row,int cell)
	{
		
		try 
		{
	     FileInputStream file = new FileInputStream(new File(file_Path));
      	 String data=WorkbookFactory.create(file).getSheet(sheet_name).getRow(row).getCell(cell).toString();
		 return data;
		} 
		catch (Exception e) 
		{
		return null;
		}
	}

	public static int getRow(String file_Path, String sheet_name)
	{
		try 
		{
			FileInputStream file = new FileInputStream(new File(file_Path));
			int rw = WorkbookFactory.create(file).getSheet(sheet_name).getLastRowNum();
			return rw;
		} 
		catch (Exception e) 
		{
			return 0;	
		}
		
	}
	public static int cellCount(String file_Path, String sheet_name,int row)
	{
		try 
		{
			FileInputStream file = new FileInputStream(new File(file_Path));
			int cl = WorkbookFactory.create(file).getSheet(sheet_name).getRow(row).getLastCellNum();
			return cl;
		} 
		catch (Exception e) 
		{
			return 0;	
		}
	}
}
