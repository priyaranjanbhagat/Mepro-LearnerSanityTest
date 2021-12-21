package com.mepro.test;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mepro.base.SessionInitiator;
import com.mepro.pages.LoginPage;
import com.mepro.pages.WelcomePage;
import com.mepro.util.ExcelReaderUtil;
import com.mepro.util.TestUtil;

public class NewUserLandingPageTest extends SessionInitiator{
	  LoginPage lp;
	  WelcomePage wp;
	  TestUtil tu;
	  ExcelReaderUtil reader=new ExcelReaderUtil("C:\\Users\\ARVAS\\eclipse-workspace\\Liqvid\\data\\MeProLearners.xlsx");
	  
	  
	  String userName; 
	  String password; 
  
	  
	  public NewUserLandingPageTest()
	  {
		  super();
	  }
	  
	  @BeforeMethod
	  public void setup()
	  {
		  initialization();
		  lp=new LoginPage();
		  tu=new TestUtil();
		  int n= reader.getRowCount("NewUser");
		  if(n==1)
		  {
			  driver.quit();
			  System.out.println("************************No user is available to login***************************");
		  }
		  userName = reader.getCellData("NewUser", 0, n);
		  password = reader.getCellData("NewUser", 1, n);
		  
		  wp=lp.Checklogin(userName, password);
		  System.out.println(userName);
		  System.out.println(password);
	  }
	  @BeforeMethod
	  public void beforeTestMethod(Method testMethod)
	  {
		  System.out.println("\n" + "*********************************************************************************" + "\n");
		  System.out.println("Now Executing Test Case---> " + testMethod.getName()+ "\n");       
	  }


	  @Test(priority =1, enabled=true)
	  public void verifyUserNameProffileLink() 
	  {
		  Assert.assertTrue(wp.checkUserNameAvailability());
	  }
	  @Test(priority =2, enabled=true)
	  public void verifySupportOptionUserProfile() 
	  {
		  Assert.assertTrue(wp.checkSupportOptionProfile());
	  }
	  @Test(priority =3, enabled=true)
	  public void verifyLogoutOptionUserProfile() 
	  {
		  Assert.assertTrue(wp.checkLogoutOptionProfile());
	  }
	  @Test(priority =4, enabled=true)
	  public void verifyTakeTheTestButtonAvailability() 
	  {
		  Assert.assertTrue(wp.checkTakeTheTestButton());
	  }
	  @Test(priority =5, enabled=true)
	  public void verifySkipTheTestLinkAvailability() 
	  {
		  Assert.assertTrue(wp.checkSkipTheTestLink());
	  }
	  @Test(priority =6, enabled=true)
	  public void verifyWhyShouldITakeTestLink() 
	  {
		  Assert.assertTrue(wp.checkWhyShouldITakeTestLink());
	  }
	  @Test(priority =7, enabled=true)
	  public void verifyWhyShouldITakeTestIcon() 
	  {
		  Assert.assertTrue(wp.checkWhyShouldITakeTestIcon());
	  }
	 
	  @Test(priority =8, enabled=true)
	  public void verifyWelcomePageImage() 
	  {
		  Assert.assertTrue(wp.checkWelcomeImage());
	  }
	  @Test(priority =9, enabled=true)
	  public void verifyWelcomePageHeaders() 
	  {
		  Assert.assertEquals(wp.checkHeaderAndSubHeader(), 2);
	  }
	  @Test(priority =10, enabled=true)
	  public void verifyWelcomePageProductLogo() 
	  {
		  Assert.assertTrue(wp.checkProductLogo());
	  }
	    @Test(priority =11, enabled=true)
	  public void verifyWelcomePageTimeInstruction() 
	  {
		  Assert.assertEquals(wp.checkWelcomePageTimeInstruction(), 2);
	  }
	  @Test(priority =12, enabled=true)
	  public void verifyWelcomePageQuizInstruction() 
	  {
		  Assert.assertEquals(wp.checkWelcomePageQuizInstruction(), 2);
	  }
	  @Test(priority =13, enabled=true)
	  public void verifyWelcomePageHeadsetInstruction() 
	  {
		  Assert.assertEquals(wp.checkWelcomePageHeadsetInstruction(), 2);
	  }
	  @Test(priority =14, enabled=true)
	  public void verifyWelcomePageFeedBackPopUp() 
	  {
		  Assert.assertTrue(wp.CheckFeedbackPopUp());
	  }
	  
 
	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  }

}
