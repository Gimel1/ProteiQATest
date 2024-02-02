package qaTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Открываем страницу входа
		driver.navigate().to("file:///E:/qa-test.html");
		
		//Выполняем вход
		driver.findElement(By.cssSelector("#loginEmail")).sendKeys("test@protei.ru");
		driver.findElement(By.cssSelector("#loginPassword")).sendKeys("test");
		driver.findElement(By.cssSelector("#authButton")).click();
		
		//Находим раскрывающийся список
		Select dropdown = new Select(driver.findElement(By.cssSelector("#dataGender")));
		
		//Выводим все возможные опции
		List<WebElement> options = dropdown.getOptions();
		System.out.println("Dropdown elements are: ");
		for(WebElement option: options)
			System.out.println(option.getText());
		driver.quit();
	}

}
