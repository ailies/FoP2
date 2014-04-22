package AlfrescoCustomization;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.SearchAndImportWikiDocumentSteps;

public class GenerateMasterXMLTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public LoginSteps login;

	@Steps
	public SearchAndImportWikiDocumentSteps searchAndImportWikiDocument;

	@Test
	public void searchAndImportWikiDocument() {
		login.loginToSite("admin", "admin");
		login.GetToFolder();
		searchAndImportWikiDocument.SearchAndImportWikiDocument();
	}
}
