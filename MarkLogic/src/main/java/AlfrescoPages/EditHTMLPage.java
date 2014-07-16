package AlfrescoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;

public class EditHTMLPage extends AbstractPage {

	public EditHTMLPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnContentResize() {
		Actions actions = new Actions(getDriver());
		WebElement contentResize = getDriver()
				.findElement(
						By.id("template_x002e_inline-edit_x002e_inline-edit_x0023_default_prop_cm_content_resize"));
		$(contentResize).waitUntilVisible();
		contentResize.click();
		actions.dragAndDropBy(contentResize, 800, 800).perform();
	}

	public void inputTitleField(String title) {
		getDriver()
				.switchTo()
				.frame(getDriver()
						.findElement(
								By.id("template_x002e_inline-edit_x002e_inline-edit_x0023_default_prop_cm_content_ifr")));
		WebElement mceIframeContainer = getDriver().switchTo().activeElement();
		$(mceIframeContainer).waitUntilVisible();
		mceIframeContainer.click();
		WebElement summaryField = getDriver().findElement(
				By.cssSelector("#Seq_6647_874"));
		$(summaryField).waitUntilVisible();
		summaryField.click();
		summaryField.click();
		summaryField.sendKeys("SUMMARY");
		getDriver().switchTo().defaultContent();
	}

	public void clickOnSaveHTMLEdit() {
		WebElement saveHTMLEdit = getDriver()
				.findElement(
						By.id("template_x002e_inline-edit_x002e_inline-edit_x0023_default-form-submit-button"));
		$(saveHTMLEdit).waitUntilVisible();
		saveHTMLEdit.click();
	}

}
