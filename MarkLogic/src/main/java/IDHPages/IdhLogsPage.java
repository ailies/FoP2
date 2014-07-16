package IDHPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhLogsPage extends AbstractPage {

	public IdhLogsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*='ClearLog']")
	WebElement clearLogBtn;

	@FindBy(css = "div.Panel > div > div.Para")
	WebElement logsContainer;

	public void clickOnClearLogBtn() {
		$(clearLogBtn).waitUntilVisible();
		clearLogBtn.click();
	}

	public void verifyIfLogWasCleared() {
		if ($(logsContainer).isCurrentlyVisible())
			Assert.assertFalse("Logs container was wiped",
					logsContainer.isDisplayed());
	}

}
