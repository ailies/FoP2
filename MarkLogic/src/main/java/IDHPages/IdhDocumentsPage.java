package IDHPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhDocumentsPage extends AbstractPage {

	public IdhDocumentsPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnFilterByBookDropDown() {
		WebElement filterByBookDropDown = getDriver().findElement(
				By.cssSelector(".ParaLarge > form > select"));
		$(filterByBookDropDown).waitUntilVisible();
		filterByBookDropDown.click();
	}

	public void clickOnSetFilterByBook() {
		WebElement setFilterByBook = getDriver().findElement(
				By.cssSelector("input[value='Set']"));
		$(setFilterByBook).waitUntilVisible();
		setFilterByBook.click();
	}

	public void clickOnFilterByCollectionDropDown() {
		WebElement filterByCollectionDropDown = getDriver().findElement(
				By.cssSelector(".ParaLarge > form > select"));
		$(filterByCollectionDropDown).waitUntilVisible();
		filterByCollectionDropDown.click();
	}

	public void clickOnSetFilterByCollection() {
		WebElement setFilterByCollection = getDriver().findElement(
				By.cssSelector("input[value='Set']"));
		$(setFilterByCollection).waitUntilVisible();
		setFilterByCollection.click();
	}

	public void clickOnSortAlphabetical() {
		WebElement sortAlphabetical = getDriver()
				.findElement(
						By.cssSelector("#AllDocuments > div:nth-child(3) > a:nth-child(1)"));
		$(sortAlphabetical).waitUntilVisible();
		sortAlphabetical.click();
	}

	public void clickOnSortOldestFirst() {
		WebElement sortOldestFirst = getDriver()
				.findElement(
						By.cssSelector("#AllDocuments > div:nth-child(3) > a:nth-child(2)"));
		$(sortOldestFirst).waitUntilVisible();
		sortOldestFirst.click();
	}

	public void clickOnSortLatestFirst() {
		WebElement sortLatestFirst = getDriver()
				.findElement(
						By.cssSelector("#AllDocuments > div:nth-child(3) > a:nth-child(3)"));
		$(sortLatestFirst).waitUntilVisible();
		sortLatestFirst.click();
	}

}