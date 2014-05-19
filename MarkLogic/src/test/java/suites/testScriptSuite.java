package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import AlfrescoCustomization.CreateAnnotationsTest;
import AlfrescoCustomization.CropImageTest;
import AlfrescoCustomization.GenerateMasterXMLTest;
import AlfrescoCustomization.GenerateRenditionsTest;
import AlfrescoCustomization.UploadVideoAndGenerateVideoFramesTest;
import PublishingContent.CheckTagsTest;
import PublishingContent.CreateCollectionAndAddDocumentsTest;
import PublishingContent.PublishXMLTest;
import Research.CreateNewFolderTest;
import Research.LoginTest;
import Research.MarkLogicSearchTest;
import XMLRoundTripping.DownloadFilesFromIDFolderTest;
import XMLRoundTripping.EditFilesWithInDesignTest;
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
	GenerateRenditionsTest.class,
	CropImageTest.class,
	UploadVideoAndGenerateVideoFramesTest.class,
	EditMasterXMLTest.class,
	DownloadFilesFromIDFolderTest.class,
	EditFilesWithInDesignTest.class,
	ImportFilesToIDFolderTest.class,
	EditHTMLFilesFromRenditionsFolderTest.class,
	PublishXMLTest.class,
	CheckTagsTest.class,
	CreateCollectionAndAddDocumentsTest.class
})
public class testScriptSuite {

}
