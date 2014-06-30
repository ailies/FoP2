package IDHPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhBooksPage extends AbstractPage {

	public IdhBooksPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*='BooksPanel'] > img")
	WebElement booksIcon;

	@FindBy(css = "input[name='Name']")
	WebElement bookName;

	@FindBy(css = "select[name='AssignTo']")
	WebElement addToCollectionDropDown;

	@FindBy(css = "a[href*='submit()']")
	WebElement addBookBtn;

	@FindBy(css = "a[href*='CollectionsPanel'] > img")
	WebElement collectionsIcon;

	@FindBy(css = "input[name='Name']")
	WebElement collectionName;

	@FindBy(css = "a[href*='AddNewCollection.submit()']")
	WebElement addCollection;

	public void clickOnBooksIcon() {
		element(booksIcon).waitUntilVisible();
		booksIcon.click();
	}

	public void inputBooksName(String bname) {
		element(bookName).waitUntilVisible();
		bookName.clear();
		bookName.sendKeys(bname);
	}

	public void clickOnAddToCollectionDropDown() {
		element(addToCollectionDropDown).waitUntilVisible();
		addToCollectionDropDown.click();
	}

	public void clickOnAddBookBtn() {
		element(addBookBtn).waitUntilVisible();
		addBookBtn.click();
	}

	public void inputCollectionName(String cname) {
		element(collectionName).waitUntilVisible();
		collectionName.clear();
		collectionName.sendKeys(cname);
	}

	public void clickOnAddCollection() {
		element(addCollection).waitUntilVisible();
		addCollection.click();
	}
}
