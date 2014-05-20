package com.pages.Alfresco;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;

public class CropImagePage extends AbstractPage{

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
//		WebElement image = getDriver().findElement(
//				By.cssSelector("div.yui-gc > div > input"));
//		
//		System.out.println(image.getSize() + "smth");
		
		WebElement leftTopCornerOfTheImage = getDriver().findElement(By.xpath("//*[@id='bd']/div[4]/div/img"));
//				("div.yui-gc > div > img")); 
		Actions actions = new Actions(getDriver()); 
//		actions.clickAndHold(leftTopCornerOfTheImage).moveByOffset(5, 5).perform(); 
		
//		OR 
		actions.dragAndDropBy(leftTopCornerOfTheImage, 50, 70).perform();
		
//		int width = image.getSize().getWidth();
//		int height = image.getSize().getHeight();
//		System.out.println(image.getSize().getWidth() + "width");
//		System.out.println(image.getSize().getHeight() + "height");	
//		Actions crop = new Actions(getDriver());
//		crop.moveToElement(image, 0px, 0px);
//		crop.clickAndHold();
//		crop.moveToElement(image, 100px, 100px);
//		crop.release();
//		crop.build();
//		crop.perform();
		
		
	}



	public void clickOnSaveCroppedImageBtn() {
		element(saveCroppedImageBtn).waitUntilVisible();
		saveCroppedImageBtn.click();
	}
}
