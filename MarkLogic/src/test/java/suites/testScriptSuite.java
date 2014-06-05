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
import Research.CreateFolderTest;
import Research.MarkLogicSearchTest;
import XMLRoundTripping.EditMasterXMLTest;

@RunWith(Suite.class)
@SuiteClasses({

		// Research
		CreateFolderTest.class,
		MarkLogicSearchTest.class,
		// Alfresco Customisations
//		GenerateXMLTest.class, 
		VerifyRenditionsTest.class,
		AddAnnotationTest.class, 
		CropImageTest.class,
		GenerateImageRenditionsTest.class, 
		UploadVideoTest.class,
		// XML round-tripping
		EditMasterXMLTest.class
})

 public class testScriptSuite {}
