package AlfrescoSteps;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class GenerateVideoFramesSteps extends AbstractSteps {

	public GenerateVideoFramesSteps(Pages pages) {
		super(pages);
	}

	@StepGroup
	public void generateVideoFrames(String term) {
		abstractPage().verifyIfElementExists("Wildlife.wmv");
		alfrescoCreateNewFolderPage().clickOnElement("Wildlife.wmv");
		generateVideoFramesPage().clickOnGenerateVideoFrames();
	}

}
