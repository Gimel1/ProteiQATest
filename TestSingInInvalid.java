package qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestSingInInvalid {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Открываем страницу входа
		driver.navigate().to("file:///E:/qa-test.html");
		
		//Вводим тестовые данные и нажимаем "вход"
		driver.findElement(By.cssSelector("#loginEmail")).sendKeys("123");
		driver.findElement(By.cssSelector("#loginPassword")).sendKeys("123");
		driver.findElement(By.cssSelector("#authButton")).click();
		
		//Проверяем, появилось ли сообщение об ошибке
		WebElement error = driver.findElement(By.cssSelector("#emailFormatError"));
		if (error.isDisplayed()) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
			}
		driver.quit();
	}

}
