package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.requirements.Application;
import com.steps.GenerateVideoFramesSteps;
import com.steps.LoginSteps;

@Story(Application.Login.login.class)
@RunWith(ThucydidesRunner.class)
public class GenerateVideoFramesTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public LoginSteps login;

	@Steps
	public GenerateVideoFramesSteps generateVideoFrames;
}
