package IDHPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhSearchPage extends AbstractPage {

	public IdhSearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "")
	WebElement searchField;

	@FindBy(css = "select[name='SearchWhat']")
	WebElement searchWithinDropDown;

	@FindBy(css = "body > div.Screen > div:nth-child(3) > div:nth-child(1) > div.IndentedSubPanel > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > input[type='button']:nth-child(3)")
	WebElement findElementsButton;

	public void inputSearchTermField(String term) {
		element(searchField).waitUntilVisible();
		searchField.sendKeys(term);
	}

	public void clickOnSearchDropDown() {
		element(searchWithinDropDown).waitUntilVisible();
		searchWithinDropDown.click();
	}

	public void clickOnFindElementButton() {
		element(findElementsButton).waitUntilVisible();
		findElementsButton.click();
	}
}
