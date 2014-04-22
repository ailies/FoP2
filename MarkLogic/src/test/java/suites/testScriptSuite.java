package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.CreateNewFolderTest;
import com.CropImageAndGenerateRenditionsTest;
import com.CustomizeXMLTest;
import com.GenerateVideoFramesTest;
import com.LoginTest;
import com.PublishingContentTest;
import com.SearchAndImportWikiDocumentTest;


@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class,
	CreateNewFolderTest.class,
	SearchAndImportWikiDocumentTest.class,
	CustomizeXMLTest.class,
	CropImageAndGenerateRenditionsTest.class,
	GenerateVideoFramesTest.class,
	PublishingContentTest.class
})
public class testScriptSuite {

}
