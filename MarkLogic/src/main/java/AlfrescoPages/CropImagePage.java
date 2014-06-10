package AlfrescoPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;

public class CropImagePage extends AbstractPage {

	public CropImagePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "#cropImage > a")
	WebElement cropImage;

	@FindBy(id = "save-crop-button")
	WebElement saveCroppedImageBtn;

	public void clickOnCropImage() {
		element(cropImage).waitUntilVisible();
		cropImage.click();
	}

	public void selectCaptureSize() {

		WebElement leftTopCornerOfTheImage = getDriver().findElement(
				By.xpath("//*[@id='bd']/div[4]/div/img"));
		Actions actions = new Actions(getDriver());
		actions.dragAndDropBy(leftTopCornerOfTheImage, 50, 70).perform();

	}

	public void clickOnSaveCroppedImageBtn() {
		element(saveCroppedImageBtn).waitUntilVisible();
		saveCroppedImageBtn.click();
	}
}
