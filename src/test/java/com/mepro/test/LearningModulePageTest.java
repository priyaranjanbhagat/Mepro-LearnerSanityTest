package com.mepro.test;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mepro.base.SessionInitiator;
import com.mepro.pages.DashboardPage;
import com.mepro.pages.LearningModulePage;
import com.mepro.pages.LoginPage;
import com.mepro.pages.PlacmentTestPage;
import com.mepro.pages.WelcomePage;
import com.mepro.util.TestUtil;

public class LearningModulePageTest extends SessionInitiator{
	  LoginPage lp;
	  WelcomePage wp;
	  TestUtil tu;
	  PlacmentTestPage ptp;
	  LearningModulePage lmp;

	  
	  public LearningModulePageTest()
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
		  lmp=new LearningModulePage();
		  lp.Checklogin(prop.getProperty("learner"), prop.getProperty("learnerPassword"));
	  }
	  @BeforeMethod
	  public void beforeTestMethod(Method testMethod)
	  {
		  System.out.println("\n" + "*********************************************************************************" + "\n");
		  System.out.println("Now Executing Test Case---> " + testMethod.getName()+ "\n");       
	  }
	  @Test(priority = 1, enabled=true) 
	  public void verifyLearningModulePageLoad()
	  {
		  Assert.assertTrue(lmp.checkLearningModulePageNavigation());
	  }
	  @Test(priority = 2, enabled=true) 
	  public void verifyLevelCount()
	  {
		  Assert.assertTrue(lmp.checkNoOfLevels());
	  }
	  @Test(priority = 3, enabled=true)  
	  public void verifyAllLevelLoading()
	  {
		  Assert.assertTrue(lmp.checkLevelLoad());
	  }
	  @Test(priority = 4, enabled=true)  
	  public void verifyModuleLoading()
	  {
		  Assert.assertTrue(lmp.checkModules());
	  }
	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  }
	  
}
