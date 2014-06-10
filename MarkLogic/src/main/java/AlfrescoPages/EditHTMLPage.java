package AlfrescoPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;

public class EditHTMLPage extends AbstractPage{

	public EditHTMLPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "template_x002e_inline-edit_x002e_inline-edit_x0023_default_prop_cm_content_resize")
	WebElement contentResize;
	
	@FindBy(css = "#Seq_6647_874")
	WebElement summaryField;
	
	@FindBy(id = "template_x002e_inline-edit_x002e_inline-edit_x0023_default-form-submit-button")
	WebElement saveHTMLEdit;
	
	public void clickOnContentResize(){
		Actions actions = new Actions(getDriver());
		element(contentResize).waitUntilVisible();
		contentResize.click();
		actions.dragAndDropBy(contentResize, 800, 800).perform();
	}
	
	public void inputTitleField(String title){
		getDriver().switchTo().frame(
				getDriver().findElement(By.id("template_x002e_inline-edit_x002e_inline-edit_x0023_default_prop_cm_content_ifr")));
		WebElement mceIframeContainer = getDriver().switchTo().activeElement();
		element(mceIframeContainer).waitUntilVisible();
		mceIframeContainer.click();
		element(summaryField).waitUntilVisible();
		summaryField.click();
		summaryField.click(); 
		summaryField.sendKeys("SUMMARY");
//		summaryField.getSize();
		getDriver().switchTo().defaultContent();
	} 
	
	public void clickOnSaveHTMLEdit(){
		element(saveHTMLEdit).waitUntilVisible();
		saveHTMLEdit.click();
	}

}
