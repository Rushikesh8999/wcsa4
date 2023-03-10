package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest {
	
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
	    String username = flib.readPropertyData("PROP_PATH","Username");
	    String password = flib.readPropertyData("PROP_PATH", "Password");
	    
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	    
	    driver.findElement(By.id("loginButton")).click();
	    bt.closeBrowser();
	}

}
