package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import AlfrescoCustomization.CreateAnnotationsTest;
import AlfrescoCustomization.CropImageAndGenerateRenditionsTest;
import AlfrescoCustomization.GenerateMasterXMLTest;
import AlfrescoCustomization.UploadVideoAndGenerateVideoFramesTest;
import PublishingContent.CheckTagsTest;
import PublishingContent.CreateCollectionAndAddDocumentsTest;
import PublishingContent.PublishXMLTest;
import PublishingContent.SwichToBuildMyBookTest;
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
	CropImageAndGenerateRenditionsTest.class,
	UploadVideoAndGenerateVideoFramesTest.class,
	EditMasterXMLTest.class,
	DownloadFilesFromIDFolderTest.class,
	EditFilesWithInDesignTest.class,
	ImportFilesToIDFolderTest.class,
	EditHTMLFilesFromRenditionsFolderTest.class,
	PublishXMLTest.class,
	CheckTagsTest.class,
	SwichToBuildMyBookTest.class,
	CreateCollectionAndAddDocumentsTest.class
})
public class testScriptSuite {

}
