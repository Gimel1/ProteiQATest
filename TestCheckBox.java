package qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Открываем страницу входа
		driver.navigate().to("file:///E:/qa-test.html");
		
		//Выбираем поле ввода email и вводим тестовый email
		driver.findElement(By.cssSelector("#loginEmail")).sendKeys("test@protei.ru");
		
		//Выбираем поле ввода пароля и вводим тестовый пароль
		driver.findElement(By.cssSelector("#loginPassword")).sendKeys("test");
		
		//Нажимаем кнопку "Вход"
		driver.findElement(By.cssSelector("#authButton")).click();
		
		//Находим чекбоксы
		WebElement box1 = driver.findElement(By.cssSelector("#dataCheck11"));
		WebElement box2 = driver.findElement(By.cssSelector("#dataCheck12"));
		
		//Проверяем нажаты ли они по умолчанию
		if (box1.isSelected() || box2.isSelected()) {
			System.out.println("Сheckboxes selected by default");
		}else {
			System.out.println("Checkboxes is not selected by default");
		}
		
		//Нажимаем на чекбоксы
		box1.click();
		box2.click();
		
		//Выводим результат
		if (box1.isSelected() || box2.isSelected()) {
			System.out.println("Сheckboxes selected");
		}else {
			System.out.println("Cheboxes not selected");
		}
		driver.quit();
	}
	
}
		