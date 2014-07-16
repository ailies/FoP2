package IDHPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhLargeEPubsPage extends AbstractPage {

	public IdhLargeEPubsPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnLargeEPubPanel() {
		WebElement largeEPubPanel = getDriver().findElement(
				By.cssSelector("a[href*='OpenNewLargeEPubPanel']"));
		$(largeEPubPanel).waitUntilVisible();
		largeEPubPanel.click();
	}

	public void inputEPubTitle(String eTitle) {
		WebElement ePubTitle = getDriver().findElement(
				By.cssSelector("input[name*='DocumentTitle']"));
		$(ePubTitle).waitUntilVisible();
		ePubTitle.clear();
		ePubTitle.sendKeys(eTitle);
	}

	public void clickOnCreateEPubButton() {
		WebElement createEPubBtn = getDriver().findElement(
				By.cssSelector("input[value='Create']"));
		$(createEPubBtn).waitUntilVisible();
		createEPubBtn.click();
	}

	public void clickOnEPubsListPanel() {
		WebElement ePubsListPanel = getDriver().findElement(
				By.cssSelector("a[href*='OpenEPubsListPanel']"));
		$(ePubsListPanel).waitUntilVisible();
		ePubsListPanel.click();
	}

}
