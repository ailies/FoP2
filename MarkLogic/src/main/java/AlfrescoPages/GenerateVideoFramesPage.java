package AlfrescoPages;

import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class GenerateVideoFramesPage extends AbstractPage {

	public GenerateVideoFramesPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnVideo(String... terms) {
		WebElement element = selectVideo(terms);
		System.out.println(element.getText());
		WebElement video = element.findElement(By.cssSelector("span a"));
		System.out.println(video.getText());
		if (element != null) {
			$(video).waitUntilVisible();
			video.click();
		} else {
			Assert.fail("Video was not found!!!!");
		}
	}

	public void clickOnGenerateVideoFrames() {
		WebElement generateFramesBtn = getDriver().findElement(
				By.cssSelector("a[title='Generate Frames'] > span"));
		$(generateFramesBtn).waitUntilVisible();
		generateFramesBtn.click();
		generateFramesBtn.click();
		waitABit(10000);
	}

	public WebElement verifyIfVideoFramesWereGenerated() {
		WebElement generateFramesBtn = getDriver().findElement(
				By.cssSelector("a[title='Generate Frames'] > span"));
		List<WebElement> frames = getDriver()
				.findElement(
						By.id("template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_ixpdc_frames-cntrl"))
				.findElements(By.cssSelector("a href"));
		Assert.assertTrue("Video frames were generated",
				frames.contains("a href"));
		frames.size();
		return generateFramesBtn;
	}
}
