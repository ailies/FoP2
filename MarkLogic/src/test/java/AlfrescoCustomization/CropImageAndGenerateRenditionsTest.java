package AlfrescoCustomization;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.steps.CreateNewFolderSteps;
import com.steps.CropImageAndGenerateRenditionsSteps;
import com.steps.CustomizeXMLSteps;
import com.steps.LoginSteps;
import com.steps.SearchAndImportWikiDocumentSteps;

public class CropImageAndGenerateRenditionsTest {
	public class LoginTest {
		@Managed(uniqueSession = true)
		public WebDriver webdriver;

		@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
		public Pages pages;

		@Steps
		public LoginSteps login;

		@Steps
		public CreateNewFolderSteps createNewFolder;

		@Steps
		public SearchAndImportWikiDocumentSteps searchAndImportWikiDocument;

		@Steps
		public CustomizeXMLSteps customizeXML;

		@Steps
		public CropImageAndGenerateRenditionsSteps cropImageAndGemerateRenditions;

		@Test
		public void login() {
			login.loginToSite("admin", "admin");
			login.GetToFolder();
			createNewFolder.CreateNewFolder();
			searchAndImportWikiDocument.SearchAndImportWikiDocument();
			customizeXML.CustomizeXML();
			cropImageAndGemerateRenditions.CropImageAndCreateImageRenditions();
		}
	}
}