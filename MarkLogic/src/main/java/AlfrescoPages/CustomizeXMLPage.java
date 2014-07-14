package AlfrescoPages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;

public class CustomizeXMLPage extends AbstractPage {

	public CustomizeXMLPage(WebDriver driver) {
		super(driver);
	}

	// ------------generate master xml with assembly view----------------
	public void clickOnAssemblyView() {
		WebElement assemblyViewButton = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-assembly-view-button-button"));
		$(assemblyViewButton).waitUntilVisible();
		assemblyViewButton.click();
	}

	public void verifyIfAssemblyViewTreeIsDisplayed() {
		WebElement assemblyViewTree = getDriver().findElement(
				By.cssSelector("div#assembly-view-tree"));
		$(assemblyViewTree).shouldBeVisible();
		Assert.assertTrue("Assembly View Tree is displayed",
				assemblyViewTree.isDisplayed());
	}

	public void reorderXMLFilesInTree(String fileTitle) {

		WebElement files = getElementWithSpecifiedTextFromList(
				By.cssSelector(".dynatree-node.dynatree-exp-c.dynatree-ico-c a"),
				false, false, fileTitle).findElement(By.tagName(".xml"));
		WebElement xmlFile = getDriver().findElement(
				By.cssSelector("div.current-pages > ul.page-list"));
		Actions action = new Actions(getDriver());
		action.dragAndDrop(files, xmlFile).build().perform();

	}

	// ----------------verify Renditions----------------
	public WebElement verifyIfRenditionsExists() {
		List<WebElement> searchResults = getDriver()
				.findElement(
						By.id("template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl"))
				.findElements(By.cssSelector("a"));

		if (searchResults.size() == 3) {
			// Assert.assertTrue("3 Renditions were generated",
			// searchResults.size());
			System.out.println(searchResults.size());
		} else {
			Assert.assertFalse("Less than 3 renditions were generated", false);
		}
		return null;

	}

	public void clickOnFirstRendition() {
		WebElement firstRendition = getDriver()
				.findElement(
						By.cssSelector("#template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl > a:nth-child(1) > img"));
		$(firstRendition).waitUntilVisible();
		firstRendition.click();
		waitABit(2000);
		checkTheMimetype();
		// goBack();
	}

	public void clickOnSecondRendition() {
		WebElement secondRendition = getDriver()
				.findElement(
						By.cssSelector("#template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl > a:nth-child(2) > img"));
		$(secondRendition).waitUntilVisible();
		secondRendition.click();
		waitABit(2000);
		checkTheMimetype();
		goBack();
	}

	public void clickOnThirdRendition() {
		WebElement thirdRendition = getDriver()
				.findElement(
						By.cssSelector("#template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl > a:nth-child(3) > img"));
		$(thirdRendition).waitUntilVisible();
		thirdRendition.click();
		waitABit(2000);
		checkTheMimetype();
		goBack();
	}

	public void checkTheMimetype() {
		WebElement mimetype = getDriver().findElement(
				By.cssSelector("div:nth-child(4) > div > span.viewmode-value"));
		if (mimetype.getText().contains("Adobe PDF Document")) {
			$(mimetype).isDisplayed();
			System.out.println("Adobe PDF Document");
		} else {
			if (mimetype.getText().contains("HTML")) {
				element(mimetype).isDisplayed();
				System.out.println("HTML");
			} else {
				if (mimetype.getText().contains(
						"{http://www.alfresco.org/model/content/1.0}content")) {
					element(mimetype).isDisplayed();
					System.out.println("Thumbnail");
				} else {
					Assert.assertTrue("Mimetype is not available",
							mimetype.isDisplayed());
					System.out.println("N/A");
				}
			}
		}
	}

	// -----------edit the master XML with XOPUS----------------

	public void clickOnInlineEdit(String term) {
		WebElement element = getTheSearchedElement(term);
		if (element == null) {
			Assert.fail("No element matching the given terms was found in the table!");
		} else {
			Actions mouseOver = new Actions(getDriver());
			mouseOver.moveToElement(element).build().perform();
			WebElement moreOptionsButton = element.findElement(By
					.cssSelector("#onActionShowMore a"));
			mouseOver.click(element).build().perform();
			$(moreOptionsButton).waitUntilVisible();
			moreOptionsButton.click();
			scrollPageDown();
			WebElement inlineEditButton = element.findElement(By
					.cssSelector("a[title='Inline Edit']"));

			element(inlineEditButton).waitUntilVisible();
			inlineEditButton.click();
		}
	}

	public void updateXMLTitle(String title) {

		getDriver().switchTo().frame(
				getDriver().findElement(By.cssSelector("#xopusFrame")));
		WebElement xopusFrame = getDriver().switchTo().activeElement();
		waitABit(6000);
		$(xopusFrame).waitUntilVisible();
		xopusFrame.click();

		getDriver().switchTo().frame(
				getDriver().findElement(By.cssSelector(".iframe")));
		WebElement iframe = getDriver().switchTo().activeElement();
		$(iframe).waitUntilVisible();
		iframe.click();

		waitABit(6000);
		WebElement fileTitle = getDriver().findElement(
				By.id("a0#*b42[a0*]b45b248[a1*]b48b257[a0#*]b32|x0"));
		$(fileTitle).waitUntilVisible();
		fileTitle.sendKeys(title);
		scrollToPageBottom();

		waitABit(2000);

		getDriver().switchTo().defaultContent();
	}

	public void clickOnSubmitButton() {
		WebElement submitUpdate = getDriver()
				.findElement(
						By.id("template_x002e_inline-edit_x002e_inline-edit_x0023_default-form-submit-button"));
		scrollPageDown();
		$(submitUpdate).waitUntilVisible();
		submitUpdate.click();
	}

	// ---------------Verify if tags were generated---------------

	public void verifyIfSemanticTagsWereGenerated() {
		try {
			WebElement semanticTagsContainer = getDriver().findElement(
					By.cssSelector(".form-field.inlineable"));
			if (semanticTagsContainer.isDisplayed()) {
				Assert.assertTrue("! Semantic Tags available "
						+ semanticTagsContainer.isDisplayed(),
						semanticTagsContainer.isDisplayed());
			} else {
				Assert.assertFalse("! Semantic Tags weren't generated !"
						+ semanticTagsContainer.isEnabled(),
						semanticTagsContainer.isEnabled());
			}
		} catch (Exception e) {
			Assert.fail("Tags were not found!");
		}
	}
}
