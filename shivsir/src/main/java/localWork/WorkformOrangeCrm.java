package localWork;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkformOrangeCrm {
	
	ChromeDriver driver;
	public void CrmworkLogin() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.orangehrm.com");
		
		
		
	}

}
