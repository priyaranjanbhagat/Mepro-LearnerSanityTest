package com.mepro.test;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mepro.base.SessionInitiator;
import com.mepro.pages.DashboardPage;
import com.mepro.pages.LoginPage;
import com.mepro.pages.PlacmentTestPage;
import com.mepro.pages.WelcomePage;
import com.mepro.util.TestUtil;

public class DashBoardPageTest extends SessionInitiator{
	  LoginPage lp;
	  WelcomePage wp;
	  TestUtil tu;
	  PlacmentTestPage ptp;
	  DashboardPage dp;

	  
	  public DashBoardPageTest()
	  {
		  super();
	  }
	  
	  @BeforeMethod
	  public void setup()
	  {
		  initialization();
		  lp=new LoginPage();
		  tu=new TestUtil();
		  ptp=new PlacmentTestPage();
		  dp=new DashboardPage();
		  
	  }
	  @BeforeMethod
	  public void beforeTestMethod(Method testMethod)
	  {
		  System.out.println("\n" + "*********************************************************************************" + "\n");
		  System.out.println("Now Executing Test Case---> " + testMethod.getName()+ "\n");       
	  }
	  
	  @Test(priority=1, enabled=true)
	  public void verifySetGoal30Mint()
	  {	
		  Assert.assertTrue(dp.setGoal());		  
	  }
	  @Test(priority =2, enabled=true)
	  public void verifyStartLessonButton()
	  {
		  Assert.assertTrue(dp.checkLessonStartButton());
	  }
	  @Test(priority =3, enabled=true)
	  public void verifyViewAllLessonsLink()
	  {
		  Assert.assertTrue(dp.checkViewAllIcon_Link());
	  }
	  @Test(priority =4, enabled=true)
	  public void verifyLessonCount()
	  {
		  Assert.assertTrue(dp.checkLessonCount());
	  }
	  @Test(priority =5, enabled=true)
	  public void verifyContinueButtonToResumeLesson()
	  {
		  Assert.assertTrue(dp.checkResumeLessonActivity());
	  }
	  @Test(priority = 6, enabled=true) 
	  public void verifyAllLessonLoads()
	  {
		  Assert.assertTrue(dp.checkAllLessonsLoad());
	  }
	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  }
}
