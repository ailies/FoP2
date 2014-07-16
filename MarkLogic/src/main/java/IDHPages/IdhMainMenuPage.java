package IDHPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhMainMenuPage extends AbstractPage {

	public IdhMainMenuPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnHomeTab() {
		WebElement homeTab = getDriver().findElement(By.cssSelector("a[href*='WELCOME']"));
		$(homeTab).waitUntilVisible();
		homeTab.click();
	}

	public void clickOnAddTab() {
		WebElement addTab = getDriver().findElement(By.cssSelector("a[href*='UPLOAD']"));
		$(addTab).waitUntilVisible();
		addTab.click();
	}

	public void clickOnDocumentsTab() {
		WebElement documentsTab = getDriver().findElement(By.cssSelector("a[href*='LIBRARY']"));
		$(documentsTab).waitUntilVisible();
		documentsTab.click();
	}

	public void clickOnSearchTab() {
		WebElement searchTab = getDriver().findElement(By.cssSelector("a[href*='SEARCH']"));
		$(searchTab).waitUntilVisible();
		searchTab.click();
	}

	public void clickOnSelectedTab() {
		WebElement selectedTab = getDriver().findElement(By.cssSelector("a[href*='SelectedFile']"));
		$(selectedTab).waitUntilVisible();
		selectedTab.click();
	}

	public void clickOnLargeEPubsTab() {
		WebElement largeEPubsTab = getDriver().findElement(By.cssSelector("a[href*='CONSTRUCT_LARGE_EPUB']"));
		$(largeEPubsTab).waitUntilVisible();
		largeEPubsTab.click();
	}

	public void clickOnBooksTab() {
		WebElement booksTab = getDriver().findElement(By.cssSelector("a[href*='SHELVES']"));
		$(booksTab).waitUntilVisible();
		booksTab.click();
	}

	public void clickOnUsersTab() {
		WebElement usersTab = getDriver().findElement(By.cssSelector("a[href*='USERS']"));
		$(usersTab).waitUntilVisible();
		usersTab.click();
	}

	public void clickOnLogsTab() {
		WebElement logsTab = getDriver().findElement(By.cssSelector("a[href*='LOGS']"));
		$(logsTab).waitUntilVisible();
		logsTab.click();
	}

	public void clickOnConfigureTab() {
		WebElement configureTab = getDriver().findElement(By.cssSelector("a[href*='CONFIG']"));
		$(configureTab).waitUntilVisible();
		configureTab.click();
	}

}
