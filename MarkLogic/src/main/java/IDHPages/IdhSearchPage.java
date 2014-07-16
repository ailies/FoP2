package IDHPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhSearchPage extends AbstractPage {

	public IdhSearchPage(WebDriver driver) {
		super(driver);
	}

	public void inputSearchTermField(String term) {
		WebElement searchField = getDriver().findElement(By.cssSelector(""));
		$(searchField).waitUntilVisible();
		searchField.sendKeys(term);
	}

	public void clickOnSearchDropDown() {
		WebElement searchWithinDropDown = getDriver().findElement(
				By.cssSelector("select[name='SearchWhat']"));
		$(searchWithinDropDown).waitUntilVisible();
		searchWithinDropDown.click();
	}

	public void clickOnFindElementButton() {
		WebElement findElementsButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > div:nth-child(3) > div:nth-child(1) > div.IndentedSubPanel > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > input[type='button']:nth-child(3)"));
		$(findElementsButton).waitUntilVisible();
		findElementsButton.click();
	}
}
