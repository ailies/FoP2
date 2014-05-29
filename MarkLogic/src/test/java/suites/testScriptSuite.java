package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import AlfrescoCustomization.AddAnnotationTest;
import AlfrescoCustomization.CropImageTest;
import AlfrescoCustomization.GenerateMasterXMLTest;
import AlfrescoCustomization.GenerateImageRenditionsTest;
import AlfrescoCustomization.UploadVideoAndGenerateVideoFramesTest;
import PublishingContent.CheckTagsTest;
import PublishingContent.GenerateCollectionTest;
import PublishingContent.PublishArticleTest;
import Research.CreateFolderTest;
import Research.LoginTest;
import Research.MarkLogicSearchTest;
import XMLRoundTripping.DownloadFilesTest;
import XMLRoundTripping.EditHTMLFilesFromRenditionsFolderTest;
import XMLRoundTripping.EditMasterXMLTest;
import XMLRoundTripping.ImportFilesToIDFolderTest;



@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class,
	CreateFolderTest.class,
	MarkLogicSearchTest.class,
	GenerateMasterXMLTest.class,
	AddAnnotationTest.class,
	GenerateImageRenditionsTest.class,
	CropImageTest.class,
	UploadVideoAndGenerateVideoFramesTest.class,
	EditMasterXMLTest.class,
	DownloadFilesTest.class,
	ImportFilesToIDFolderTest.class,
	EditHTMLFilesFromRenditionsFolderTest.class,
	PublishArticleTest.class,
	CheckTagsTest.class,
	GenerateCollectionTest.class
})
public class testScriptSuite {

}
