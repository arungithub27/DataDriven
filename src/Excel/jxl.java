package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

public class jxl {
	
	 
	
	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		/*WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\E-Backup\\Automation\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://secure.payrollspan.net/");
		driver.manage().window().maximize();*/
		FileInputStream path = new FileInputStream("C:\\Users\\STS-111\\Desktop\\Book1.xls");
		Workbook get = Workbook.getWorkbook(path);
		Sheet s = get.getSheet(0);
		int rowcount = s.getRows();
		//System.out.println(rowcount);
		for(int i=0;i<rowcount;i++)
		{
			String user=s.getCell(0, i).getContents();
			String pass=s.getCell(1,i).getContents();
			System.out.println("User name is  "+i+"  "+user);
			System.out.println("User name is  "+i+"  "+pass);			
			//driver.findElement(By.id("EmailAddress")).sendKeys(user);
			Thread.sleep(3000);
			//driver.findElement(By.id("EmailAddress")).clear();
			
			//driver.findElement(By.id("Password")).sendKeys(pass);
			Thread.sleep(3000);
			//driver.findElement(By.id("Password")).clear();
			//driver.findElement(By.id("btnsignin")).click();
			Thread.sleep(9000);
			
			//driver.quit();
		}
		
		
		 
		
	}

}
