package snippet;

import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Base64Convert {

	/*public static boolean base64ToFile(String base64, String path) {
        byte[] buffer;
        try {
            buffer = new BASE64Decoder().decodeBuffer(base64);
            FileOutputStream out = new FileOutputStream(path);
            out.write(buffer);
            out.close();
            return true;
        } catch (Exception e) {
        }
    }*/
	
	public static void main(String[] args) {
		/*String base64 = \"iVBORw0KGgoAAAANSUhEUgAAAPYAAABDCAYAAACvFfgOAAAFhUlEQVR4Xu2dyXLDMAxD6///6HS8y7YkApR7aOb10ukiJ6FFAgQpevp8Pp8fvrAAFvgqC0w49lfdTz4MFlgsgGOzEbDAF1rg4tjTNP2UzHz/ef6+f81/r/3s/H6/Vnn9fX10nfv7u7+v2vra67XWle+jXKe8zv3zKK+r2FV5Hz27Ke+jZ//e/VLs4qyvXe/N9dF9V+6H4yfufRnxvzI+4dhboLpv7EwAwbFXYLgH/jcdMwKAKDDg2DNP3xAcxH4yFpdZtP5fQQgQe7VAjeH9tf16gcBhQlHAaTFFdd/cNXAQG8QOHcZBXBB7tVbELFqUGyq+RfBsjhdRMqj4uUFx7Kejqg5Ijn1DTpUC4dhrTutuoCiwlX/HsXHsQ5jLqqxu7opj49gl9Y1yWSeg9ao/ILapkuLYzxwN8QzxzBEJF6Gx7Dxz6nMKUrYoYo/a4dg49l18clIBEHsLgjj2lcrSoDJWh0YVRxWvlllAbBAbxH6mHlBxMaePRBTKXZS7EM+CcovTYghig9ggNoidLq+B2PVccDRHHl0fiV9RR1e0PrrvCuV1RGa3v0Ato/U+J6p4pfUP8QzxrGQMvUBQU+udalFL7Veui2MXA2KiDq3e6SznhjkRXUGI8ka7iKMiQLahSLFLawOrh4veXO/aD8c2zmn3bhQ5Njk2OTY5Njm20GOvUDsQuz5ABMQGsR91ecWhoOJXhhKJX4hn7QlGB8rRUlo/tVPLkZVckgkqTFBx9gniWVEnzzSOKMh5R4LM6+DYODaO3Rh1g3iGeIZ4hniGeIZ4tuwBtRGEchfDDI+gkRm3rNaPEc8Qz95I4cr9NluU89gMM2SYYWIarxq4VSbR6nhsre9VD3BsWkof0zRHe71H11PuOh+l547/ptxVebIJqnh7dlqvU1BRgZ31ODaOLT9qiHJXrLLSeUbnmexQzDyLHQrxDPEM8azy0MAsFYzKHjSonA7nUGly7GcfQquqQucZnWfLHohG9TgbKAps5d9xbB4YkG4YiZr7RwYgkGPHKQE5Njk2ObYw402tc5Jjk2OTY5NjNxmR2wgBFa/Pk1cCrTMhx70vWUCg8yw4Nz5C+d+IvFEd13HIzAYcFb9G10efP0rZovWu/Xr/76R40fui8+w2wwxVnIfyzXtARUYcm0MgB+3lEMhTfIuO12ZVdQfZMsMQcWwcG8fekJByF+Uuyl3FaTElB1PEmvI6LuKoYgzlLspdlLsod3VzWueRTm5gQzxjmOGyZ7KIRUvpWV+GikPFoeJQ8QejcwID4hnHNuWUQMl1OY/NeWxVZc/0BzgBS9mvvevNf2M0EqORGI3EaKR+I4Ba7+1Rs6g+msl9lQgIYoPYIHZntFC2EyxSO0daPXHsZ4OJUzZzcmRaSk/RMXq6a8uuyn6FivMY3UujjcKIRspVODaOXc3tlI2nNGyUEU2JgFBxqDhUHCoeNmio9XO3QcOh0Bn1dhRxR9c76rHqiAoQtAClZ28HMJzPpVwXKg4Vh4pvFsiMlsKxeT42z8dulI0c8c1BNhD72hF3RHDq2Dwfu6YtIJ7FZV011VLPiTNogUELS2BWHJIce31eNzl2ZaaYKyq0cpJIpaaOHZ/ayeSILrKMil+j66Hi9IrTK36bt85c8elAZ7ehyQUwN2A6AQtVXCy7KYaijk0dWxXjMikOji1MEVVypoj6R/VgNTcbLYdQx14tkBGZVEdU9guIbZS1eCjfuqWc5xxHkT0KSNF6pbMPVRxV/KHOIp6dlFZJAUBsEPuNefQlw1zA5FP8xskdFAcGsUHslsjkUN9agMyudxnPaKqVSTEygIBjCzl8LcC5gUxVTUFsEPvPEXvfZHzHAljgf1vgQsX/90fh3WMBLHDQ+DLHxixYAAt8hwV+AVExq2KUfU9wAAAAAElFTkSuQmCC\";
		String path = \"f://img/1549.png\";
		base64ToFile(base64, path);*/
		/*Pattern pattern = Pattern.compile(\"\\s+|,+\");
		String[] split = pattern.split(\"嘛水电费第三方 sdf\r\n胜多负少的\r\r\r\r\nsss\");
		System.out.println(Arrays.toString(split));*/
		
		/*String str = \"VG*12.123\";
		str = str.replace(\"%\", \"\");
		Pattern pattern = Pattern.compile(\"\\w+[+-/*](\\d{2}(\\.\\d+)?)\");
		Matcher matcher = pattern.matcher(str);
		boolean find = matcher.find();
		
		System.out.println(find);
		for (int i = 1; i <= matcher.groupCount(); i++) {
			System.out.println(matcher.group(i));
		}*/
		/*String str = \"VG*12.123\";
		str = str.replace(\"%\", \"\");
		String groupStr = RegexUtils.getCapturingGroup(\"\\w+[+-/*](\\d{2}(\\.\\d+)?)\", str, 1);
		System.out.println(groupStr);*/
		/*boolean cdaFormulaFMatch = RegexUtils.matcherEvent(\"\\w+[*+-/]\\w+[>=<!]{1,2}\\d+\", \"VG/Y>=10\");
		System.out.println(cdaFormulaFMatch);*/
		
		/*String regex = \"100|(\\d{1,2}(\\.\\d+)?)\";
		String str = \"0.5231\";
		
		boolean capturingGroup = RegexUtils.completeMatcherEvent(regex, str);
		System.out.println(capturingGroup);*/
		/*Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.matches());
		System.out.println(matcher.find());
		
		matcher.reset();
		
		System.out.println(matcher.matches());
		System.out.println(matcher.find());*/
		/*String secret = "LSfN6pZMR5Cgtrc7eA3yVd0PKVur2+sIbwVp8B4nQvPtYOgBiqrG/9J2cAOUK6At";
		String systemCode = "VJNOYUIIHG";
		String content = "{\"password\":\"sam2015\",\"method\":\"CLOSE_WORK_ORDER\",\"refferenceNo\":\"GD20190111095748\",\"userName\":\"sam\"}";
		String md5Hex = DigestUtils.md5Hex(secret + systemCode +content);
		String md5 = MD5Utl.encode(secret + systemCode + content);
		System.out.println(md5Hex);
		System.out.println(md5);*/
		/*String str = "UP/10>=412";
		boolean cdaFormulaFMatch = RegexUtils.matcherEvent("\\w+[*+-/]\\w+[>=<!]{1,2}\\d+", str);
		System.out.println(cdaFormulaFMatch);*/
		/*String cdaFormulaF = "VG/Y>=10";
		boolean matcherEvent = RegexUtils.matcherEvent("\\w+[*+-/]\\w+([*+-/]\\w+)?[>=<!]{1,2}\\d+", cdaFormulaF);
		System.out.println(matcherEvent);*/
//		String str = "3304990041\\\\\\\\\\r"+"3304990049\r\n3304300003\r\n3304200093\r\n3304200013\r\n3304100093\r\n3304100013";
//		List<String> split = NoSplit.split(str);
//		Arrays.toString(split.toArray());
//		System.out.println(str);
		String path = "C:\\Users\\Administrator\\Desktop\\excel\\15487469575722a1.xlsx";
		try {
			Workbook workBook = new XSSFWorkbook(new File(path));
			Sheet sheet = workBook.getSheetAt(0);
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			for (Row row : sheet) {
				int cells = row.getPhysicalNumberOfCells();
				for (Cell cell : row) {
					/*String cellValue = null;
					// 处理数字型的,自动去零
					if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
						System.out.print("t:n");
						// 在excel里,日期也是数字,在此要进行判断
						if (HSSFDateUtil.isCellDateFormatted(cell)) {
							cellValue = POIExcelUtil.dateConvertString(cell.getDateCellValue(), "yyyy-MM-dd HH:mm:ss");
						} else {
							cellValue = (cell.getNumericCellValue() + "");
						}
					} else if (Cell.CELL_TYPE_STRING == cell.getCellType()) {// 处理字符串型
						System.out.print("t:s");
						cellValue = cell.getStringCellValue();
					} else if (Cell.CELL_TYPE_BOOLEAN == cell.getCellType()) {// 处理布尔型
						System.out.print("t:b");
						cellValue = cell.getBooleanCellValue() + "";
					} else if (Cell.CELL_TYPE_FORMULA == cell.getCellType()) {
						System.out.print("t:f");
						try {
							if (HSSFDateUtil.isCellDateFormatted(cell)) {
								cellValue = DateUtil.dateConvertString(cell.getDateCellValue(), DateUtil.yyyy_MM_ddHHmmss);
							} else {
								cellValue = (cell.getNumericCellValue() + "");
							}
						} catch (Exception e) {
							cellValue = cell.getStringCellValue();
						}
					} else {// 其它数据类型
						System.out.print("t:e");
						cellValue = cell.toString() + "";
					}
					System.out.print(cellValue+ "\t");*/
					cell.setCellType(Cell.CELL_TYPE_STRING);
					String stringCellValue = cell.getStringCellValue();
					System.out.print("t:" +cell.getCellType() +"-" + stringCellValue + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}