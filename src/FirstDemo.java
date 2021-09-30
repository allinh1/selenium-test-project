import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DL_Ng\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window();
		
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		
		searchBox.sendKeys("DASH CAM");
		searchBox.submit();
	}	
}

//   	/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input