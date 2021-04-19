package com.Vtiger.MyCampaigns.generics;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ExcelUtility {
		
		/**
		 * @author Monica
		 * To fetch the data from excel sheet
		 * @param sheetName
		 * @param rowNum
		 * @param cellNum
		 * @return data from excel sheet
		 * @throws IOException 
		 * @throws EncryptedDocumentException 
		 * @throws InvalidFormatException 
		 */
		public String readDatafromExcel(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException, InvalidFormatException
		{
			FileInputStream fis = new FileInputStream(IConstants.excelpath);
			Workbook wb=WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(sheetname);
			Row r=sh.getRow(rownum);
			Cell c=r.getCell(cellnum);
			String data=c.getStringCellValue();
			return data;
	  
		}
		
		/**
		 * @author Monica
		 * To read the data from excel
		 * @param path
		 * @param sheetname
		 * @param rownum
		 * @param cellnum
		 * @return data
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 * @throws Exception 
		 */
		public String readDatafromExcel(String path,String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException, Exception
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(sheetname);
			Row r=sh.getRow(rownum);
			Cell c=r.getCell(cellnum);
			String data=c.getStringCellValue();
			return data;

		}
		
		/**
		 * @author Monica
		 * @param path
		 * @param sheetname
		 * @param rownum
		 * @return last row number
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 * @throws InvalidFormatException 
		 */
		public int getRowCount(String path, String sheetname,int rownum) throws EncryptedDocumentException, IOException, InvalidFormatException
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			return sh.getLastRowNum();
		}
		
		/**
		 * Write data in excel file
		 * @param path
		 * @param sheetname
		 * @param rownum
		 * @param column
		 * @param value
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 * @throws InvalidFormatException 
		 */
		public void writeDataInExcel(String path, String sheetname, int rownum, int column, String value) throws EncryptedDocumentException, IOException, InvalidFormatException
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			Row r = sh.getRow(rownum);
			Cell c = r.getCell(column);
			c.setCellValue(value);
			FileOutputStream fos = new FileOutputStream(path);
			wb.write(fos);
			wb.close();
		}

	}



