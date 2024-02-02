package qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SystemTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Открываем страницу входа
		driver.navigate().to("file:///E:/qa-test.html");
		
		//Выполняем вход
		driver.findElement(By.cssSelector("#loginEmail")).sendKeys("test@protei.ru");
		driver.findElement(By.cssSelector("#loginPassword")).sendKeys("test");
		driver.findElement(By.cssSelector("#authButton")).click();
		
		//Вводим тестовые данные на следующей странице
		WebElement email = driver.findElement(By.cssSelector("#dataEmail"));
		WebElement name = driver.findElement(By.cssSelector("#dataName"));
		email.sendKeys("test@test.com");
		name.sendKeys("test");
		
		//Выбираем чекбоксы
		driver.findElement(By.cssSelector("#dataCheck11")).click();
		driver.findElement(By.cssSelector("#dataCheck12")).click();
		
		//Выбираем кнопку
		driver.findElement(By.cssSelector("#dataSelect21")).click();
		
		//Отправляем данные в таблицу
		driver.findElement(By.cssSelector("#dataSend")).click();
		
		//Выводим появившиеся в таблице данные
		driver.findElement(By.cssSelector("body > div.uk-modal.uk-open > div > div > div.uk-modal-footer.uk-text-right > button")).click();
		WebElement table = driver.findElement(By.xpath("/html/body/div[2]/form/table"));
		
		System.out.println("Contents are: " +table.getText());
		
		driver.quit();
	}

}
