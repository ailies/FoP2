package AlfrescoPages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class GenerateImageRenditionsPage extends AbstractPage {

	public GenerateImageRenditionsPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnGenerateImageRenditions() {
		WebElement generateImageRenditions = getDriver().findElement(
				By.cssSelector("#generateImgRenditions > a"));
		$(generateImageRenditions).waitUntilVisible();
		generateImageRenditions.click();
		generateImageRenditions.click();
		waitABit(10000);
	}

	public WebElement verifyIfImageRenditionsWereGenerated() {
		List<WebElement> renditions = getDriver()
				.findElement(
						By.id("template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl"))
				.findElements(By.cssSelector("a"));
		Assert.assertTrue("Image renditions were generated",
				renditions.contains("a"));
		renditions.size();
		return null;

	}

}
