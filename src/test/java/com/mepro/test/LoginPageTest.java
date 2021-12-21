package com.mepro.test;
import org.testng.annotations.Test;
import com.mepro.base.SessionInitiator;
import com.mepro.pages.LoginPage;
import com.mepro.pages.WelcomePage;

import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;


public class LoginPageTest extends SessionInitiator {

	LoginPage lp;
	WelcomePage wp;
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		lp=new LoginPage();
	}
	  @BeforeMethod
	  public void beforeTestMethod(Method testMethod)
	  {
		  System.out.println("\n" + "*********************************************************************************" + "\n");
		  System.out.println("Now Executing Test Case---> " + testMethod.getName()+ "\n");       
	  }

	  @Test (priority =1, enabled=true)
	  public void verifyLogin()
	  {
		 wp=lp.Checklogin(prop.getProperty("LUser"), prop.getProperty("pwd"));
	  }
	  @Test (priority =2, enabled=true)
	  public void verifyLoginHelp()
	  {
		 Assert.assertTrue(lp.checkHelpPopup());
	  }
	  @Test (priority =3, enabled=true)
	  public void verifyTermsOfUseLink()
	  {
		 Assert.assertTrue(lp.checkTermsOfUse());
	  }
	  @Test (priority =4, enabled=true)
	  public void verifySignUpCaption()
	  {
		 Assert.assertEquals(lp.checkSignUpCaption(), "New to Pearson?");
	  }
	  @Test (priority =5, enabled=true)
	  public void verifyCreateNewAccountButton()
	  {
		 Assert.assertTrue(lp.checkCreateAccountButton());
	  }
	  @Test (priority =6, enabled=true)
	  public void verifyForgetPasswordLink()
	  {
		 Assert.assertTrue(lp.checkForgetPassworeLink());
	  }
	  @Test (priority =7, enabled=true)	  
	  public void verifyForgetPassword()
	  {
		 Assert.assertTrue(lp.checkForgetPassworeLink());
	  }
	  @Test (priority =8, enabled=true)	  
	  public void verifyPasswordResetWithEmail()
	  {
		 Assert.assertEquals(lp.checkForgetPasswordWithEmail(), "Your username/password request has been sent");
	  }
	  @Test (priority =9, enabled=true)	  
	  public void verifyReturnToSignInPageLink()
	  {
		 Assert.assertTrue(lp.checkReturnToSignInLink());
	  }
	  @Test (priority =10, enabled=true)	  
	  public void verifyTermsOfUseFooterLink()
	  {
		 Assert.assertTrue(lp.checkTermsOfUseLink());
	  }
	  @Test (priority =11, enabled=true)	  
	  public void verifyPrivacyFooterLink()
	  {
		 Assert.assertTrue(lp.checkPrivacyLink());
	  }
	  @Test (priority =12, enabled=true)	  
	  public void verifyAccessibilityFooterLink()
	  {
		 Assert.assertTrue(lp.checkAccessibilityLink());
	  }
	  @Test (priority =13, enabled=true)	  
	  public void verifyPermissionsFooterLink()
	  {
		 Assert.assertTrue(lp.checkPermissionsLink());
	  }
	  @Test (priority =14, enabled=true)	  
	  public void verifySupportFooterLink()
	  {
		 Assert.assertTrue(lp.checkSupportLink());
	  }
	  @Test (priority =15, enabled=true)	  
	  public void verifyCreditFooterTextAvailability()
	  {
		 Assert.assertTrue(lp.checkCreditText());
	  }
	  @Test (priority =16, enabled=true)	  
	  public void verifyPearsonFooterLink()
	  {
		 Assert.assertTrue(lp.checkPearsonLink());
	  }
	  @Test (priority =17, enabled=true)	  
	  public void verifyInvalidLoginAttempt()
	  {
		  Assert.assertTrue(lp.CheckIncorrectlogin(prop.getProperty("LUser"), prop.getProperty("incpwd")));
	  }
	  @Test (priority =18, enabled=true)	  
	  public void verifyPasswordResetWithPhone()
	  {
		 Assert.assertTrue(lp.checkForgetPasswordWithPhone());
	  }
	  @Test (priority =19, enabled=true)	  
	  public void verifyLoginAttemptWithBlankCredentials()
	  {
		  Assert.assertTrue(lp.checkLoginAttemptWithEmptyCredentials());
	  }
	  	  @Test (priority =20, enabled=true)	  
	  public void verifyLoginAttemptBlankUserName()
	  {
		  Assert.assertTrue(lp.CheckIncorrectlogin(prop.getProperty("LUser"), prop.getProperty("incpwd")));
	  }
	  @Test (priority =21, enabled=true)	  
	  public void verifyLoginAttemptBlankPassword()
	  {
		  Assert.assertTrue(lp.checkLoginAttemptWithEmptyLogin());
	  }
	  
	  @Test (priority =22, enabled=true)	  
	  public void verifyStudAccountCreation()
	  {
		   Assert.assertTrue(lp.checkStudentAccountCreation());
	  }
	  @Test (priority =23, enabled=true)	  
	  public void verifyInstructorAccountCreation()
	  {
		  Assert.assertTrue(lp.checkInstructorAccountCreation());
	  }
	  @Test (priority =24, enabled=true)	  
	  public void verifyLogoAvailability()
	  {
		  Assert.assertTrue(lp.checkLogoAvailability());
	  }
	  @Test (priority =25, enabled=true)	  
	  public void verifyLoginInstructionText()
	  {
		  Assert.assertTrue(lp.checkSignInInstruction());
	  }
	  @Test (priority =26, enabled=true)	  
	  public void verifyCreateAccountHelp()
	  {
		  Assert.assertTrue(lp.checkAccountCreationHelp());
	  }
	  @Test (priority =27, enabled=true)	  
	  public void verifyCreateAccountCountryHelp()
	  {
		  Assert.assertTrue(lp.checkAccountCreationCountryHelp());
	  }
  	  @Test (priority =28, enabled=true)	  
	  public void verifySignInLinkCreateAccountPane()
	  {
		  Assert.assertTrue(lp.checkSignInNavigationFromCreateAccount());
	  }
	  
  	  @Test (priority =29, enabled=true)	  
	  public void verifyDuplicateEmailAlertCreateAccount()
	  {
		  Assert.assertTrue(lp.checkDuplicateEmailPopUpCreateAccount(prop.getProperty("dupEmail")));
	  }
  	  @Test (priority =30, enabled=true)	 
  	  public void verifySignInNavigationDuplicateEmailPopUpCA()
	  {
		  Assert.assertTrue(lp.checkLoginPageNavigationFromDuplicateEmailAlert(prop.getProperty("dupEmail")));
	  }
	  @Test (priority =31, enabled=true)	 
  	  public void verifyForgotPasswordDuplicateEmailPopUpCA()
	  {
		  Assert.assertTrue(lp.checkForgotUserNamePasswordDuplicateEmailAlert(prop.getProperty("dupEmail")));
	  }
	  @Test (priority =32, enabled=true)	 
  	  public void verifyCreateAccountAnywaysDuplicateEmailPopUpCA()
	  {
		  Assert.assertTrue(lp.checkCreateAccountAnywayLinkDuplicateEmailPopUp(prop.getProperty("dupEmail")));
	  }
	 
	  @Test (priority =33, enabled=true)	 
  	  public void verifyCreateAccountPrivacyPolicy()
	  {
		  Assert.assertTrue(lp.checkCreateAccountPrivacyPolicyPage());
	  }
	  @Test (priority =34, enabled=true)	 
  	  public void verifyCreateAccountTermsOfUse()
	  {
		  Assert.assertTrue(lp.checkCreateAccountTermsOfUsePage());
	  }
	  @Test (priority =35, enabled=true)	 
  	  public void verifyTryAgainLinkForgotPassword()
	  {
		  Assert.assertTrue(lp.checkTryAgainNavigationForgotPassword());
	  }
	  @Test (priority =36, enabled=true)	 
  	  public void verifyLoginHelpPopUpItems()
	  {
		  Assert.assertEquals(lp.checkLoginHelpItems(), 4);
	  }
	  @Test (priority =37, enabled=true)	 
	  public void verifyCreateAccountHelpPopUpItems()
     {
	  Assert.assertEquals(lp.checkCreatAccountHelpItems(), 4);
     }
	  @Test (priority =38, enabled=true)	 
	  public void verifyForgetPasswordHelpPopUpItems()
     {
	  Assert.assertEquals(lp.checkForgetPasswordHelpItems(), 2);
     }

	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  }
	  
	 

}
