package IDHPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhBooksPage extends AbstractPage {

	public IdhBooksPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnBooksIcon() {
		WebElement booksIcon = getDriver().findElement(
				By.cssSelector("a[href*='BooksPanel'] > img"));
		$(booksIcon).waitUntilVisible();
		booksIcon.click();
	}

	public void inputBooksName(String bname) {
		WebElement bookName = getDriver().findElement(
				By.cssSelector("input[name='Name']"));
		$(bookName).waitUntilVisible();
		bookName.clear();
		bookName.sendKeys(bname);
	}

	public void clickOnAddToCollectionDropDown() {
		WebElement addToCollectionDropDown = getDriver().findElement(
				By.cssSelector("select[name='AssignTo']"));
		$(addToCollectionDropDown).waitUntilVisible();
		addToCollectionDropDown.click();
	}

	public void clickOnAddBookBtn() {
		WebElement addBookBtn = getDriver().findElement(
				By.cssSelector("a[href*='submit()']"));
		$(addBookBtn).waitUntilVisible();
		addBookBtn.click();
	}

	public void inputCollectionName(String cname) {
		WebElement collectionName = getDriver().findElement(
				By.cssSelector("input[name='Name']"));
		$(collectionName).waitUntilVisible();
		collectionName.clear();
		collectionName.sendKeys(cname);
	}

	public void clickOnAddCollection() {
		WebElement addCollection = getDriver().findElement(
				By.cssSelector("a[href*='AddNewCollection.submit()']"));
		$(addCollection).waitUntilVisible();
		addCollection.click();
	}
}
