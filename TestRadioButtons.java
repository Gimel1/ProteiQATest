package qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioButtons {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Открываем страницу входа
		driver.navigate().to("file:///E:/qa-test.html");
		
		//Вводим тестовые данные и нажимаем "вход"
		driver.findElement(By.cssSelector("#loginEmail")).sendKeys("test@protei.ru");
		driver.findElement(By.cssSelector("#loginPassword")).sendKeys("test");
		driver.findElement(By.cssSelector("#authButton")).click();
		
		//Находим кнопки 
		WebElement button21 = driver.findElement(By.cssSelector("#dataSelect21"));
		WebElement button22 = driver.findElement(By.cssSelector("#dataSelect22"));
		WebElement button23 = driver.findElement(By.cssSelector("#dataSelect23"));
		
		//Проверяем работу кнопок, выводим результат
		button21.click();
		if (button21.isSelected()) {
			System.out.println("Button 1 selected");
		}else {
			System.out.println("Button 1 failed");
		}
		
		button22.click();
		if (button22.isSelected()) {
			System.out.println("Button 2 selected");
		}else {
			System.out.println("Button 2 selected");
		}
		button23.click();
		if (button23.isSelected()) {
			System.out.println("Button 3 selected");
		}else {
			System.out.println("Button 3 not selected");
		}
		driver.quit();
	}

}
