package AlfrescoSteps;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class EditHTMLSteps extends AbstractSteps {

	public EditHTMLSteps(Pages pages) {
		super(pages);
	}

	@StepGroup
	public void editHTMLRendition(String term, String title){
		customizeXMLPage().clickOnInlineEdit(term);
		editHTMLPage().clickOnContentResize();
		editHTMLPage().inputTitleField(title);
//		editHTMLPage().clickOnSaveHTMLEdit();
	}
}
