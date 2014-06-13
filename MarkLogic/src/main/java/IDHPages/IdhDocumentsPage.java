package IDHPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhDocumentsPage extends AbstractPage {

	public IdhDocumentsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".ParaLarge > form > select ")
	WebElement filterByBookDropDown;

	@FindBy(css = "input[value='Set']")
	WebElement setFilterByBook;

	@FindBy(css = ".ParaLarge > form > select ")
	WebElement filterByCollectionDropDown;

	@FindBy(css = "input[value='Set']")
	WebElement setFilterByCollection;

	@FindBy(css = "#AllDocuments > div:nth-child(3) > a:nth-child(1)")
	WebElement sortAlphabetical;

	@FindBy(css = "#AllDocuments > div:nth-child(3) > a:nth-child(2)")
	WebElement sortOldestFirst;

	@FindBy(css = "#AllDocuments > div:nth-child(3) > a:nth-child(3)")
	WebElement sortLatestFirst;

	public void clickOnFilterByBookDropDown() {
		element(filterByBookDropDown).waitUntilVisible();
		filterByBookDropDown.click();
	}

	public void clickOnSetFilterByBook() {
		element(setFilterByBook).waitUntilVisible();
		setFilterByBook.click();
	}

	public void clickOnFilterByCollectionDropDown() {
		element(filterByCollectionDropDown).waitUntilVisible();
		filterByCollectionDropDown.click();
	}

	public void clickOnSetFilterByCollection() {
		element(setFilterByCollection).waitUntilVisible();
		setFilterByCollection.click();
	}

	public void clickOnSortAlphabetical() {
		element(sortAlphabetical).waitUntilVisible();
		sortAlphabetical.click();
	}

	public void clickOnSortOldestFirst() {
		element(sortOldestFirst).waitUntilVisible();
		sortOldestFirst.click();
	}

	public void clickOnSortLatestFirst() {
		element(sortLatestFirst).waitUntilVisible();
		sortLatestFirst.click();
	}

}
