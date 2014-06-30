package IDHPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhLargeEPubsPage extends AbstractPage {

	public IdhLargeEPubsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*='OpenNewLargeEPubPanel']")
	WebElement largeEPubPanel;

	@FindBy(css = "input[name*='DocumentTitle']")
	WebElement ePubTitle;

	@FindBy(css = "input[value='Create']")
	WebElement createEPubBtn;

	@FindBy(css = "a[href*='OpenEPubsListPanel']")
	WebElement ePubsListPanel;

	public void clickOnLargeEPubPanel() {
		element(largeEPubPanel).waitUntilVisible();
		largeEPubPanel.click();
	}

	public void inputEPubTitle(String eTitle) {
		element(ePubTitle).waitUntilVisible();
		ePubTitle.clear();
		ePubTitle.sendKeys(eTitle);
	}

	public void clickOnCreateEPubButton() {
		element(createEPubBtn).waitUntilVisible();
		createEPubBtn.click();
	}

	public void clickOnEPubsListPanel() {
		element(ePubsListPanel).waitUntilVisible();
		ePubsListPanel.click();
	}

}
