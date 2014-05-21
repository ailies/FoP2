package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import AlfrescoCustomization.CreateAnnotationsTest;
import AlfrescoCustomization.CropImageTest;
import AlfrescoCustomization.GenerateMasterXMLTest;
import AlfrescoCustomization.GenerateImageRenditionsTest;
import AlfrescoCustomization.UploadVideoAndGenerateVideoFramesTest;
import PublishingContent.CheckTagsTest;
import PublishingContent.CreateCollectionTest;
import PublishingContent.PublishArticleTest;
import Research.CreateNewFolderTest;
import Research.LoginTest;
import Research.MarkLogicSearchTest;
import XMLRoundTripping.DownloadFilesFromIDFolderTest;
import XMLRoundTripping.EditHTMLFilesFromRenditionsFolderTest;
import XMLRoundTripping.EditMasterXMLTest;
import XMLRoundTripping.ImportFilesToIDFolderTest;



@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class,
	CreateNewFolderTest.class,
	MarkLogicSearchTest.class,
	GenerateMasterXMLTest.class,
	CreateAnnotationsTest.class,
	GenerateImageRenditionsTest.class,
	CropImageTest.class,
	UploadVideoAndGenerateVideoFramesTest.class,
	EditMasterXMLTest.class,
	DownloadFilesFromIDFolderTest.class,
	ImportFilesToIDFolderTest.class,
	EditHTMLFilesFromRenditionsFolderTest.class,
	PublishArticleTest.class,
	CheckTagsTest.class,
	CreateCollectionTest.class
})
public class testScriptSuite {

}
