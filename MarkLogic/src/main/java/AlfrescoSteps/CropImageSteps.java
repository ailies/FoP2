package AlfrescoSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class CropImageSteps extends AbstractSteps {

	public CropImageSteps(Pages pages) {
		super(pages);
	}

	@Step
	public boolean verifyIfImagesExists(String term) {
		return generateRenditionsPage().verifyIfElementExists(term);
	}

	@StepGroup
	public void cropImage(String term) {
		verifyIfImagesExists(term);
		alfrescoCreateNewFolderPage().clickOnElement(term);
		cropImagePage().clickOnCropImage();
		cropImagePage().selectCaptureSize();
		cropImagePage().clickOnSaveCroppedImageBtn();
	}
}
