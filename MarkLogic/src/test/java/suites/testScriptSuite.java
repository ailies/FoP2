package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import AlfrescoCustomisations.AddAnnotationTest;
import AlfrescoCustomisations.CropImageTest;
import AlfrescoCustomisations.GenerateImageRenditionsTest;
import AlfrescoCustomisations.GenerateXMLTest;
import AlfrescoCustomisations.UploadVideoTest;
import AlfrescoCustomisations.VerifyRenditionsTest;
import PublishingContent.CheckTagsTest;
import PublishingContent.GenerateCollectionTest;
import PublishingContent.PublishArticleTest;
import Research.AuthenticationTest;
import Research.CreateFolderTest;
import Research.MarkLogicSearchTest;
import XMLRoundTripping.DownloadFilesTest;
import XMLRoundTripping.EditHTMLFilesFromRenditionsFolderTest;
import XMLRoundTripping.EditMasterXMLTest;
import XMLRoundTripping.UploadFilesTest;



@RunWith(Suite.class)
@SuiteClasses({
	
//	Research
	AuthenticationTest.class,
	CreateFolderTest.class,
	MarkLogicSearchTest.class,
	
//	Alfresco Customisations
	GenerateXMLTest.class,
	VerifyRenditionsTest.class,
	AddAnnotationTest.class,
	CropImageTest.class,
	GenerateImageRenditionsTest.class,
	UploadVideoTest.class,
	
//	XML round-tripping
	EditMasterXMLTest.class,
	DownloadFilesTest.class,
	
	UploadFilesTest.class,
	EditHTMLFilesFromRenditionsFolderTest.class,
	
//	Publishing content
	PublishArticleTest.class,
	CheckTagsTest.class,
	GenerateCollectionTest.class
})

public class testScriptSuite {

}
