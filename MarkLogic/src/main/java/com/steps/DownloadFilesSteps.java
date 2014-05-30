package com.steps;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class DownloadFilesSteps extends AbstractSteps {

	public DownloadFilesSteps(Pages pages) {
		super(pages);
	}

	@StepGroup
	public void downloadFiles() {
//		downloadFilesPage().clickOnDownload(".xml");
//		downloadFilesPage().clickOnDownload(".indd");
		downloadFilesPage().clickOnSelect();
		downloadFilesPage().clickOnAll();
		downloadFilesPage().clickOnSelectedItems();
		downloadFilesPage().clickOnDownloadAsZIP();
	}

}
