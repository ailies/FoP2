/*package com.pages.BuildMyBook;

import java.io.File;

import net.thucydides.core.pages.PageObject;

public class BmBAuthentication{
	
	Mouse mouse = new DesktopMouse();
	  ScreenRegion s = new DesktopScreenRegion();
	  DesktopKeyboard keyboard = new DesktopKeyboard();

	  File fNewTwo = new File("pics/cap1.JPG");
	  ScreenRegion pathField = s.find(new ImageTarget(fNewTwo));
	  mouse.click(pathField.getCenter());
	  keyboard.type(fNewTwo.getAbsolutePath().replace("cap1.JPG", ""));
	  keyboard.type(Key.ENTER);

	  waitABit(3000);
	  File fNewThree = new File("pics/");
	  String fileName = fNewThree.getAbsolutePath();
	  constructFileString(fileName);

	  File fNewFour = new File("pics/zzz.JPG");
	  ScreenRegion pathField2 = s.find(new ImageTarget(fNewFour));
	  mouse.click(pathField2.getCenter());
	  keyboard.type(constructFileString(fileName));
	  keyboard.type(Key.ENTER);
}
*/