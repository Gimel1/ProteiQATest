package qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestSignInValid {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Открываем страницу входа
		driver.navigate().to("file:///E:/qa-test.html");
		
		//Вводим тестовые данные и нажимаем "вход"
		driver.findElement(By.cssSelector("#loginEmail")).sendKeys("test@protei.ru");
		driver.findElement(By.cssSelector("#loginPassword")).sendKeys("test");
		driver.findElement(By.cssSelector("#authButton")).click();
		WebElement inputspage = driver.findElement(By.cssSelector("#inputsPage"));
		
		//Проверяем, открылась ли следующая страница
		if (inputspage.isDisplayed()) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
			}
		driver.quit();
	}

}
