package TestApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Logout extends Pages {
	

	
	 @FindBy(xpath="//*[@id='logout-trigger']")
	 public static WebElement Logout;
	
	
	
	public static void LogoutApp() throws Exception {
		 
		 
			PageFactory.initElements(driver,Logout.class);
		    WaitforVisiblityof(driver,Logout,10);
			Logout.click();
		  
}
	
	



}