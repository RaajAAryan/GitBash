package Run;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Grams {
	@Test
	public void TestRepo1() {
		System.out.println("Execute my program");
	}
	@Test
	public void TestRepo2() {
		System.out.println("dont Execute");
	}
	@Test
	public void TestRepo3() {
		System.out.println("Please Execute my program");
	}
	@Test
	public void LaunChhrome() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
	}
	@Test
	public void LaunEddge() {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.in");
	}
	@Test
	public void LaunFiooreFox() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void ScreenTest() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("./ScreenShot/Abc.png");
		FileHandler.copy(source, Destination);
	}
}