package com.requirements;

import net.thucydides.core.annotations.Feature;

public class Application {

	@Feature
	public class BasicFunctionality {
		public class Authentication {}
		public class CreateNewUser {}
		public class CreateFolder {}
		public class DeleteFolder {}
		public class NavigateToFolder {}
	}

	@Feature
	public class Articles {
		public class SearchArticles {}
		public class ImportArticles {}
		public class ReorderArticles {}
		public class EditFiles {}
		public class PublishArticle {}
		public class AddAnnotation {}
	}

	@Feature
	public class MediaFiles {
		public class CropImage {}
		public class GenerateImageRenditions {}
		public class UploadVideo {}
		public class GenerateVideoFrames {}
	}

	@Feature
	public class FilesActions {
		public class DownloadMultipleFiles {}
		public class UploadMultipleFiles {}
	}

	@Feature
	public class BuildMyBook {
		public class SearchArticles {}
		public class CreateCollection {}
	}

}
