package snippet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet("总运单明细");
		
		
		CellStyle cellStyle01 = book.createCellStyle();
		cellStyle01.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 垂直    
		cellStyle01.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 水平 
		cellStyle01.setBorderBottom(HSSFCellStyle.BORDER_THICK);
		cellStyle01.setBorderRight(HSSFCellStyle.BORDER_THICK);
		cellStyle01.setBorderTop(HSSFCellStyle.BORDER_THICK);
		
		CellStyle cellStyle02 = book.createCellStyle();
		cellStyle02.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 垂直    
		cellStyle02.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		Font font = book.createFont();
		font.setBoldweight((short)2);
		cellStyle02.setFont(font);
		cellStyle02.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		cellStyle02.setFillForegroundColor(HSSFColor.YELLOW.index);
		cellStyle02.setBorderBottom(HSSFCellStyle.BORDER_THICK);
		cellStyle02.setBorderRight(HSSFCellStyle.BORDER_THICK);
		cellStyle02.setBorderTop(HSSFCellStyle.BORDER_THICK);
		
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 1));
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 2, 5));
		Row row = sheet.createRow(0);
		
		for (int i = 0; i < 7; i++) {
			sheet.setColumnWidth(i, 5000);
		}
		
	
		
		
		
		Cell cell = row.createCell(0);
		cell.setCellValue(1212121);
		cell.setCellStyle(cellStyle01);
		
		
		Cell cell2 = row.createCell(2);
		cell2.setCellValue(53453536);
		cell2.setCellStyle(cellStyle01);
		
		
		Row row2 = sheet.createRow(1);
		
		String values[]=new String[]{"运单号","客户单号","商品名称","价值","数量","总重量","包号"};
		for (int i = 0; i < values.length; i++) {
			Cell createCell = row2.createCell(i);
			createCell.setCellStyle(cellStyle02);
			createCell.setCellValue(values[i]);
		}
		
		
		
		book.write(new FileOutputStream("e:/test/testhb.xlsx"));
		book.close();
	}
}
