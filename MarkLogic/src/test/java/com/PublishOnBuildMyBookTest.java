package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;

public class PublishOnBuildMyBookTest {
	public class LoginTest {
		@Managed(uniqueSession = true)
		public WebDriver webdriver;

		@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
		public Pages pages;

		@Steps
		public LoginSteps login;

		@Test
		public void login() {
			login.login("admin", "admin");
			login.GetToFolder();
		}
	}
}
