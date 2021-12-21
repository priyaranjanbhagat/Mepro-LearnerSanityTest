package com.mepro.test;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mepro.base.SessionInitiator;
import com.mepro.pages.LoginPage;
import com.mepro.pages.PlacmentTestPage;
import com.mepro.pages.WelcomePage;
import com.mepro.util.TestUtil;

public class PlacementQuizTest extends SessionInitiator{
	  LoginPage lp;
	  WelcomePage wp;
	  TestUtil tu;
	  PlacmentTestPage ptp;
	  
	  
	  
	  String userName; 
	  String password; 

	  
	  public PlacementQuizTest()
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
		  
	  }
	  @BeforeMethod
	  public void beforeTestMethod(Method testMethod)
	  {
		  System.out.println("\n" + "*********************************************************************************" + "\n");
		  System.out.println("Now Executing Test Case---> " + testMethod.getName()+ "\n");       
	  }
	  
	  @Test(priority =1, enabled=true)
	  public void verifyAttemptQuiz()throws InterruptedException
	  {

		
		  Assert.assertTrue(ptp.attemptQuiz());
		  
	  }
	  @Test(priority =2, enabled=true)
	  public void verifySkipTest()
	  {

		
		  Assert.assertTrue(ptp.skipPlacementTest());
		  
	  }
	  @Test(priority =3, enabled=true)
	  public void verifyPausePlacementTest()
	  {

		
		  Assert.assertTrue(ptp.skipPlacementTest());
		  
	  }
	  @Test(priority =4, enabled=true)
	  public void verifyCancelPlacementTestPause()
	  {

		
		  Assert.assertTrue(ptp.cancelPausePlacementTest());
		  
	  }
	  @Test(priority=5, enabled=true)
	  public void verifyGSE_CEFRLink()
	  {

		
		  Assert.assertTrue(ptp.checkGSE_CEFRLink());
		  
	  }
	  @Test(priority=6, enabled=true)
	  public void verifyContinueToDashboard()
	  {

		
		  Assert.assertTrue(ptp.checkContninueAtSummaryPage());
		  
	  }

	  
	  
	  @AfterMethod
	    public void tearDown()
	    {
			  driver.quit();
		}
}
