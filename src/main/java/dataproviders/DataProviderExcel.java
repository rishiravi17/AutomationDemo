package dataproviders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderExcel {
	
	@DataProvider(name = "getSiteURLs")
	public String[][] getUrls() {

		XSSFWorkbook workBook = null;

		String[][] data = null;

		DataFormatter formatter = new DataFormatter();

		try (FileInputStream inputFile = new FileInputStream(
				System.getProperty("user.dir") + "/resources/datarepo/SiteURLs.xlsx")) {

			workBook = new XSSFWorkbook(inputFile);

			XSSFSheet sheet = workBook.getSheet("URLs");

			int rowCount = sheet.getPhysicalNumberOfRows();

			int colCount = sheet.getRow(0).getLastCellNum();

			data = new String[rowCount - 1][colCount];

			for (int i = 0; i < rowCount - 1; i++) {

				for (int j = 0; j < colCount; j++) {

					data[i][j] = formatter.formatCellValue(sheet.getRow(i + 1).getCell(j));

				}

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		return data;

	}

}
