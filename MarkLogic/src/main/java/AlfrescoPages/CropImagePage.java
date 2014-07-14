package AlfrescoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;

public class CropImagePage extends AbstractPage {

	public CropImagePage(WebDriver driver) {
		super(driver);
	}

	public void clickOnCropImage() {
		WebElement cropImage = getDriver().findElement(
				By.cssSelector("#cropImage > a"));
		$(cropImage).waitUntilVisible();
		cropImage.click();
	}

	public void selectCaptureSize() {

		WebElement leftTopCornerOfTheImage = getDriver().findElement(
				By.xpath("//*[@id='bd']/div[4]/div/img"));
		Actions actions = new Actions(getDriver());
		actions.dragAndDropBy(leftTopCornerOfTheImage, 50, 70).perform();

	}

	public void clickOnSaveCroppedImageBtn() {
		WebElement saveCroppedImageBtn = getDriver().findElement(
				By.id("save-crop-button"));
		$(saveCroppedImageBtn).waitUntilVisible();
		saveCroppedImageBtn.click();
	}
}
