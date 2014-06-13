package IDHPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhMainMenuPage extends AbstractPage {

	public IdhMainMenuPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*='WELCOME']")
	WebElement homeTab;

	@FindBy(css = "a[href*='UPLOAD']")
	WebElement addTab;

	@FindBy(css = "a[href*='LIBRARY']")
	WebElement documentsTab;

	@FindBy(css = "a[href*='SEARCH']")
	WebElement searchTab;

	@FindBy(css = "a[href*='SelectedFile']")
	WebElement selectedTab;

	@FindBy(css = "a[href*='CONSTRUCT_LARGE_EPUB']")
	WebElement largeEPubsTab;

	@FindBy(css = "a[href*='SHELVES']")
	WebElement booksTab;

	@FindBy(css = "a[href*='USERS']")
	WebElement usersTab;

	@FindBy(css = "a[href*='LOGS']")
	WebElement logsTab;

	@FindBy(css = "a[href*='CONFIG']")
	WebElement configureTab;

	public void clickOnHomeTab() {
		element(homeTab).waitUntilVisible();
		homeTab.click();
	}

	public void clickOnAddTab() {
		element(addTab).waitUntilVisible();
		addTab.click();
	}

	public void clickOnDocumentsTab() {
		element(documentsTab).waitUntilVisible();
		documentsTab.click();
	}

	public void clickOnSearchTab() {
		element(searchTab).waitUntilVisible();
		searchTab.click();
	}

	public void clickOnSelectedTab() {
		element(selectedTab).waitUntilVisible();
		selectedTab.click();
	}

	public void clickOnLargeEPubsTab() {
		element(largeEPubsTab).waitUntilVisible();
		largeEPubsTab.click();
	}

	public void clickOnBooksTab() {
		element(booksTab).waitUntilVisible();
		booksTab.click();
	}

	public void clickOnUsersTab() {
		element(usersTab).waitUntilVisible();
		usersTab.click();
	}

	public void clickOnLogsTab() {
		element(logsTab).waitUntilVisible();
		logsTab.click();
	}

	public void clickOnConfigureTab() {
		element(configureTab).waitUntilVisible();
		configureTab.click();
	}

}
