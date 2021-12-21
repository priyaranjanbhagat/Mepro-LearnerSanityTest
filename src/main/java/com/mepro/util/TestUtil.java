package com.mepro.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mepro.base.SessionInitiator;

public class TestUtil extends SessionInitiator{
	
	public static long Page_Load_TimeOut = 60;
	public static long Implict_Wait = 30;
	
	public static String TestData_Sheet_Path="D:\\Eclipse\\My Projects\\knoxteams\\src\\main\\java\\com\\knoxteams\\testdata\\Knox_Teams_TestData.xlsx";
	public static String Users_Data="C:\\Users\\ARVAS\\eclipse-workspace\\Liqvid\\test-output\\MeProLearners.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	public static void takeScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	public void switchToFrame(WebElement frame)
	{
		driver.switchTo().frame(frame);
	}
	
	public void explicitWait(WebElement element)  //Explicit_Wait_for_element_visibility
	{
		WebDriverWait wait=new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void scrollDown()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250)");
	}
	
	public void openToNewTab()
	{
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t"); 
		driver.switchTo().defaultContent();
	}
	public void switchToTab(int Index)
	{
		ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs_windows.get(Index));
	}
	
	
	public void selectDropDownItem(WebElement dropdown, String areacode)
	{
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("areacode");
	}

	public void dragAndDropElements(WebElement source, WebElement target)
	{
		Actions actions = new Actions(driver); 
		//actions.dragAndDrop(source,target).perform(); 
		actions.clickAndHold(source).pause(2000).moveToElement(target).release().build().perform();
		
	}
	
	public void dragAndDropWithCordinate(WebElement source, WebElement destinantion)
	{
				int xCordinate=destinantion.getLocation().getX();
				int yCordinate=destinantion.getLocation().getY();
		Actions actions = new Actions(driver); 
		actions.dragAndDropBy(source, xCordinate, yCordinate).build().perform();
		 
		
	}
	public void implicitWait(int sec)
	{
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS) ;
	}	
	
	public void mouseHover(WebElement element)
	{
		Actions builder = new Actions(driver); 
		builder.moveToElement(element).perform();
	}
	public void jsClick(WebElement E)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript ("arguments[0].click();" , E);
	}
	
	public String getCurrentTime()
	{
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd_HHmmss");

		String date = simpleDateFormat.format(new Date());
		return date;
	}
//	public static Object[][] getTestData(String sheetName)
//	{
//		FileInputStream file=null;
//		try 
//		{
//			file=new FileInputStream(TestData_Sheet_Path);
//		}
//		catch (FileNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//		
//		try
//		{
//			book=WorkbookFactory.create(file);
//		}
//		catch (InvalidFormatException e)
//		{
//			e.printStackTrace();
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}
//		
//		sheet=(Sheet) book.getSheet(sheetName);
//		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		for(int i=0;i<sheet.getLastRowNum();i++)
//		{
//			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
//			{
//				data[i][k]= sheet.getRow(i+1).getCell(k).toString();
//			}
//		}
//		return data;
//	}


}
