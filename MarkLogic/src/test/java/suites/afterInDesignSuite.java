package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import PublishingContent.CheckTagsTest;
import PublishingContent.GenerateCollectionTest;
import PublishingContent.PublishArticleTest;
import XMLRoundTripping.CheckIfFilesExistsTest;
import XMLRoundTripping.DownloadFilesTest;
import XMLRoundTripping.EditHTMLFilesFromRenditionsFolderTest;
import XMLRoundTripping.UploadFilesTest;

@RunWith(Suite.class)
@SuiteClasses({ DownloadFilesTest.class,

	// XML round-tripping
	UploadFilesTest.class,
	CheckIfFilesExistsTest.class,
	EditHTMLFilesFromRenditionsFolderTest.class,

	// Publishing content
	PublishArticleTest.class, 
	CheckTagsTest.class,
	GenerateCollectionTest.class 
	})


public class afterInDesignSuite {

}
