package com.mepro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mepro.base.SessionInitiator;
import com.mepro.util.ExcelReaderUtil;
import com.mepro.util.TestUtil;

public class LoginPage extends SessionInitiator 
{
	

		HomePage hp;
		TestUtil tu = new TestUtil();
		ExcelReaderUtil reader=new ExcelReaderUtil("C:\\Users\\ARVAS\\eclipse-workspace\\Liqvid\\data\\MeProLearners.xlsx");
		
		
	//	WelcomePage wp=new WelcomePage();
		//Page Object Factory :: OR
		
		@FindBy(xpath ="//*[@id='e2e-comms-wrapper']/div[1]/div/div/div[1]/div/div/div/div/span")
		WebElement txtSignInInstruction;
		@FindBy(xpath ="//img[@class='logo-img']")
		WebElement logo;
		@FindBy(xpath = "//input[@id='username']")
		WebElement inputUserName;
		@FindBy(xpath="//input[@id='password']")
		WebElement inputPassword;
		@FindBy(xpath="//button[@id='mainButton']")
		WebElement btnLogin;
		@FindBy(xpath="//body[@class='bgDiv']/section[@class='vbox']/div[@class='header relative']/div[@class='headerRight hidden-xs']/span[@class='userBgDiv']/a/span[@class='userIcon']/img[1]")
		WebElement iconUserProfile;
		@FindBy(xpath="//button[@id='help-in-form']")
	    WebElement iconHelp;
	    @FindBy(xpath="//div[@id='o-contextual-help-drawer']")
	    WebElement popupHelp;
	    @FindBy(xpath="//span//button[@class='pe-icon--btn']")
	    WebElement iconCloseHelpPopup;
	    @FindBy(xpath="//a[@id='tosPolicyLink']")
	    WebElement linkTermsOfUse;	    
	    @FindBy(xpath="//div[@class='pe-form--group ng-binding ng-scope']")
	    WebElement txtTermsOfUse;
	    @FindBy(xpath="//h2[@class='pe-title pe-title--small ng-binding']")
	    WebElement txtNewToPearson;
	    @FindBy(xpath="//h1[@class='pe-page-title pe-page-title--small ng-binding']")
	    WebElement txtSignInHeader;
	    
	    @FindBy(xpath="//h3[contains(text(),'Having trouble or need support?')]")
	    WebElement lnkLoginHelpPopUpItem1;
	    @FindBy(xpath="//h3[contains(text(),'Having trouble signing in or account locked?')]")
	    WebElement lnkLoginHelpPopUpItem2;
	    @FindBy(xpath="//h3[contains(text(),'How do I enable cookies?')]")
	    WebElement lnkLoginHelpPopUpItem3;
	    @FindBy(xpath="//h3[contains(text(),'What if I get a date or clock error?')]")
	    WebElement lnkLoginHelpPopUpItem4;
	    
	    
	    @FindBy(xpath="//h3[contains(text(),'Having trouble or need support?')]")
	    WebElement lnkCreateAccountHelpPopUpItem1;
	    @FindBy(xpath="//h3[contains(text(),'Can I use my Pearson account for other courses?')]")
	    WebElement lnkCreateAccountHelpPopUpItem2;
	    @FindBy(xpath="//h3[contains(text(),'Any tips for my username?')]")
	    WebElement lnkCreateAccountHelpPopUpItem3;
	    @FindBy(xpath="//h3[contains(text(),'Any tips for my username?')]")
	    WebElement lnkCreateAccountHelpPopUpItem4;
	    @FindBy(xpath="//h2[@class='pe-title']")
	    WebElement txtHeaderCreateAccountHelpItem;
	    @FindBy(xpath="//h3[contains(text(),'Having trouble or need support?')]")
	    WebElement lnkForgetPasswordHelpPopUpItem1;
	    @FindBy(xpath="//h3[contains(text(),'What happens after I request my username and passw')]")
	    WebElement lnkForgetPasswordHelpPopUpItem2;
	    @FindBy(xpath="//h2[@class='pe-title']")
	    WebElement txtHeaderForgetPasswordItem;
	    
	    	    
	    @FindBy(xpath="//button[@class='titleSectionHeaderBackButton slideInRightContent']")
	    WebElement lnkHelpItemToMainPage;
	    @FindBy(xpath="//h2[@class='pe-title']")
	    WebElement txtHeaderLoginHelpItem;
	    @FindBy(xpath="//h1[@class='titleSectionHeaderTitle']")
	    WebElement txtHeaderHelpPopUp;
	    
	    @FindBy(xpath="//button[@class='pe-btn__primary--btn_xlarge ng-binding ng-scope']")
	    WebElement btnCreatNewAccount;
	    @FindBy(xpath="//input[@id='emailInput']")
	    WebElement inputEmail_CreateAccount;
	    @FindBy(xpath="//input[@id='reenterEmailInput']")
	    WebElement inputConfirmEmail_CreateAccount;
	    @FindBy(xpath="//input[@id='passwordInput2']")
	    WebElement inputPassword_CreateAccount;
	    @FindBy(xpath="//input[@id='firstNameInput']")
	    WebElement inputFirstName_CreateAccount;
	    @FindBy(xpath="//input[@id='lastNameInput']")
	    WebElement inputLastName_CreateAccount;
	    @FindBy(xpath="//input[@id='countryInput']")
	    WebElement inputCountry_CreateAccount;
	    @FindBy(xpath="//select[@id='roleSelect']")
	    WebElement dropdownSelectRole_CreateAccount;
	    @FindBy(xpath="//select[@id='roleSelect']//option[2]")
	    WebElement selectInstructor_CreateAccount;
	    @FindBy(xpath="//select[@id='roleSelect']//option[3]")
	    WebElement selectStudent_CreateAccount;
	    @FindBy(xpath="//div[@class='pe-form--group medium-long ng-scope']//label//span[1]")
	    WebElement chkboxTermsAgreement_CreateAccount;
	    @FindBy(xpath="//div//button[@id='createMyAccountButton']")
	    WebElement btnCreateAccount_CreateAccount;
	    @FindBy(xpath="//a[@class='signin-link ng-binding']")
	    WebElement lnkAlreadySignIn_CreateAccount;
	    @FindBy(xpath="//*[@id=\"mainForm\"]/h1")
	    WebElement txtConfirmAccountCreation;
	    @FindBy(xpath="//button[@id='help-in-form']")
	    WebElement btnHelp_CreateAccount;
	    @FindBy(xpath="//*[@id=\"o-contextual-help-drawer\"]/div/span[1]/h1")
	    WebElement txtHeaderHelpPopUp_CreateAccount;
	    @FindBy(xpath="//span//button[@class='pe-icon--btn']")
	    WebElement btnCloseHelp_CreateAccount;
	    @FindBy(xpath="//button[@id='help-for-country-field']")
	    WebElement btnCountryHelp_CreateAccount;
	    @FindBy(xpath="//h1[@class='pe-page-title pe-page-title--small ng-binding']")
	    WebElement txtHeaderCreateAccount;
	    @FindBy(xpath="//a[contains(text(),'Terms of Use')]")
	    WebElement lnkTOUCreateAccount;
	    @FindBy(xpath="//a[contains(text(),'Privacy Policy')]")
	    WebElement lnkPriPolCreateAccount;
	    @FindBy(xpath="//h1[@class='titleSectionHeaderTitle']")
	    WebElement txtHeaderCountryHelpPopUp_CreateAccount;
	    @FindBy(xpath="//span//button[@class='pe-icon--btn']")
	    WebElement btnCloseCountryHelp_CreateAccount;
	    @FindBy(xpath="//span[contains(text(),'Duplicate Email')]")
	    WebElement txtDuplicateEmailPopUPHeader;
	    @FindBy(xpath="//button[@id='signInButton']")
	    WebElement btnSignInDuplicateEmailPopUP;
	    @FindBy(xpath="//button[@id='forgotUsernameButton']")
	    WebElement btnForgotUNamePwdDuplicateEmailPopUP;
	    @FindBy(xpath="//a[@id='newAccountLink']")
	    WebElement lnkCreateAccountAnywayDuplicateEmailPopUP;
	    
	    
	    @FindBy(xpath="//a[@id='forgotUsernameOrPasswordLink']")
	    WebElement lnkForgetPassword;
	    @FindBy(xpath="//input[@id='email-radio-button']")
	    WebElement radioEmail_ForgetPassword;
	    @FindBy(xpath="//input[@id='text-radio-button']")
	    WebElement radioText_ForgetPassword;
	    @FindBy(xpath="//input[@id='emailaddress']")
	    WebElement inputEmail_ForgetPassword;
	    @FindBy(xpath="//a[@id='signinAgainLink']")
	    WebElement lnkSignInAgain_ForgetPassword;
	    @FindBy(xpath="//button[@id='help-in-form']")
	    WebElement iconHelp_ForgetPassword;
	    @FindBy(xpath="//h1[@class='pe-page-title pe-page-title--small ng-binding']")
	    WebElement txtHeader_ForgetPassword;
	    @FindBy(xpath="//button[@id='emailButton']")
	    WebElement btnSendEmail_ForgetPassword;
	    @FindBy(xpath="//button[@id='text']")
	    WebElement btnSendVerification_ForgetPassword;
	    @FindBy(xpath="//input[@id='piphoneNumberInput']")
	    WebElement inputPhoneNumber_ForgetPassword;
	    @FindBy(xpath="//*[@id=\"e2e-comms-wrapper\"]/div[1]/div/div/div[2]/div/div/main[8]/main/h1")
	    WebElement txtConfirmEmail_ForgetPassword;
	    @FindBy(xpath="//input[@id='piphoneNumberInput']")
	    WebElement inputPhoneNo_ForgetPassword;
	    @FindBy(xpath="//p[@class='ng-binding']")
	    WebElement txtChargesAlert_ForgetPassword;
	    @FindBy(xpath="//a[@id='tryAgainLink']")
	    WebElement lnkTryAgain_ForgetPassword;
	    
	    @FindBy(xpath="//span[contains(text(),'Terms of Use')]")
	    WebElement lnkTOU_Footer;
	    @FindBy(xpath="//span[contains(text(),'Privacy')]")
	    WebElement lnkPrivacy_Footer;
	    @FindBy(xpath="//span[contains(text(),'Accessibility')]")
	    WebElement lnkAccessibility_Footer;
	    @FindBy(xpath="//span[contains(text(),'Permissions')]")
	    WebElement lnkPermission_Footer;
	    @FindBy(xpath="//span[contains(text(),'Support')]")
	    WebElement lnkSupport_Footer;
	    @FindBy(xpath="//body[@id='appRoot']/footer[@class='ng-scope']/div[@class='copyright']/span[1]")
	    WebElement txtCopyRight_Footer;
	    @FindBy(xpath="//span[contains(text(),'Pearson')]")
	    WebElement lnkPearson_Footer;
	    
	    @FindBy(xpath="//h1[contains(text(),'Universal Terms of Service and End User License Ag')]")
	    WebElement txtTOUHeader;
	    @FindBy(xpath="//h1[contains(text(),'Data Privacy')]")
	    WebElement txtPrivacyHeader;
	    @FindBy(xpath="//h1[@class='mar-bot--125']")
	    WebElement txtAccessibilityHeader;
	    
	    @FindBy(xpath="//h1[contains(text(),'Permissions')]")
	    WebElement txtPermissionsHeader;
	    @FindBy(xpath="//h1[@class='slds-text-align_center']")
	    WebElement txtSupportHeader;
	    @FindBy(xpath="//div[@class='panel-heading']")
	    WebElement txtInvalidLoginAttempt;
	    
	    @FindBy(xpath="//div[contains(text(),'Your username is required.')]")
	    WebElement txtEmptyLoginField;
	    @FindBy(xpath="//div[contains(text(),'Your password is required.')]")
	    WebElement txtEmptyPasswordField;
	    
	    @FindBy(xpath="//button[@id='mainButton']")
	    WebElement btnContinueAccountCreated;
	    @FindBy(xpath="//div[@class='auth-content container ng-scope']")
		WebElement popAddMobilePhone;		
		@FindBy(xpath="//a[@id='skipLink']")
		WebElement lnkSkipPhoneNo;
		@FindBy(xpath="//span[contains(text(),'Yes, skip')]")
		WebElement lnkSkipConfirmation;
	    

		
	    //Initialization of Page Objects:
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		//************************************************************************************
		
		public boolean checkSignInInstruction()
		{
			if(txtSignInInstruction.getText().equals("Hello. Sign in and let the learning begin!"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public boolean checkLogoAvailability()
		{
			if(logo.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public WelcomePage Checklogin(String un, String pw)
		{
		
			inputUserName.sendKeys(un);
			inputPassword.sendKeys(pw);
			btnLogin.click();
			return new WelcomePage();
		 
		}
		
		public boolean checkHelpPopup()
		{
			iconHelp.click();
			if(popupHelp.isDisplayed())
			{
			iconCloseHelpPopup.click();
			return true;
			}
			else
			{
			return false;
			}
		}
		public boolean checkTermsOfUse()
		{
			if (txtTermsOfUse.isDisplayed())
			{
				linkTermsOfUse.click();
				return true;
			}
			else
			{
				return false;
			}
		}
		public String checkSignUpCaption()
		{
			return (txtNewToPearson.getText());
		}
		
		public boolean checkCreateAccountButton()
		{
			return (btnCreatNewAccount.isDisplayed());
		}
		
		public boolean checkForgetPassworeLink()
		{
			return (lnkForgetPassword.isDisplayed());
		}
		
		public String checkForgetPasswordWithEmail()
		{
			lnkForgetPassword.click();
			inputEmail_ForgetPassword.sendKeys("ashutosh.dixit@englishedge.in");
			btnSendEmail_ForgetPassword.click();
			return txtConfirmEmail_ForgetPassword.getText();
		}
		public boolean checkForgetPasswordWithPhone()
		{
			lnkForgetPassword.click();
			radioText_ForgetPassword.click();
			if (inputPhoneNo_ForgetPassword.isDisplayed() && txtChargesAlert_ForgetPassword.isDisplayed())
			{
				return true;
			}
			
			else
			{
				return false;
			}
		}
		public boolean checkTryAgainNavigationForgotPassword()
		{
			lnkForgetPassword.click();
			inputEmail_ForgetPassword.sendKeys("ashutosh.dixit@englishedge.in");
			btnSendEmail_ForgetPassword.click();
			if (txtConfirmEmail_ForgetPassword.isDisplayed())
				{
				lnkTryAgain_ForgetPassword.click();
				if(txtHeader_ForgetPassword.isDisplayed())
				{
					return true;
				}
				else
				{
					return false;
				}
				
				}
			else
			{
				return false;
			}
		}
		public boolean checkReturnToSignInLink()
		{
			checkForgetPasswordWithEmail();
			lnkSignInAgain_ForgetPassword.click();
			if(txtSignInHeader.isDisplayed())
			{
			return true;
			}
			else
			{
				return false;
			}
		}
		
		public boolean checkTermsOfUseLink()
		{
			tu.explicitWait(txtSignInHeader);
			
			if(lnkTOU_Footer.isDisplayed())
			{
				lnkTOU_Footer.click();
				tu.switchToTab(1);
				System.out.println(driver.getTitle());
				if (txtTOUHeader.getText().equals("Universal Terms of Service and End User License Agreement"))
				{
				return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		public boolean checkPrivacyLink()
		{
			tu.explicitWait(txtSignInHeader);
			if(lnkPrivacy_Footer.isDisplayed())
			{
				lnkPrivacy_Footer.click();
				tu.switchToTab(1);
				if (txtPrivacyHeader.getText().equals("Data Privacy"))
				{
				return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		public boolean checkAccessibilityLink()
		{
			tu.explicitWait(txtSignInHeader);
			if(lnkAccessibility_Footer.isDisplayed())
			{
				lnkAccessibility_Footer.click();
				tu.switchToTab(1);
				if (txtAccessibilityHeader.getText().equals("Accessibility Information"))
				{
				return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		public boolean checkPermissionsLink()
		{
			tu.explicitWait(txtSignInHeader);
			if(lnkPermission_Footer.isDisplayed())
			{
				lnkPermission_Footer.click();
				tu.switchToTab(1);
				if (txtPermissionsHeader.getText().equals("Permissions"))
				{
				return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		public boolean checkSupportLink()
		{
			tu.explicitWait(txtSignInHeader);
			if(lnkSupport_Footer.isDisplayed())
			{
				lnkSupport_Footer.click();
				tu.switchToTab(1);
				if (txtSupportHeader.getText().equals("Pearson Support"))
				{
				return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		public boolean checkCreditText()
		{
			tu.explicitWait(txtSignInHeader);
			if(txtCopyRight_Footer.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public boolean checkPearsonLink()
		{
			if(lnkPearson_Footer.isDisplayed())
			{  lnkPearson_Footer.click();
				tu.switchToTab(1);
				if(driver.getTitle().contentEquals("The world’s learning company | Pearson"))
					{
					return true;
					}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		public boolean CheckIncorrectlogin(String un, String pw)
		{
		
			inputUserName.sendKeys(un);
			inputPassword.sendKeys(pw);
			btnLogin.click();
			if (txtInvalidLoginAttempt.getText().equals("That username or password didn't work."))
			{
				return true;
			}
			else
			{
				return false;
			}
			 
		}
		public boolean checkLoginAttemptWithEmptyCredentials()
		{
			inputUserName.sendKeys();
			inputPassword.sendKeys();
			btnLogin.click();
			if (txtEmptyLoginField.getText().contentEquals("Your username is required.") && txtEmptyPasswordField.getText().contentEquals("Your password is required."))
				{
				return true;
				}
			else
			{
				return false;
			}
		}
		public boolean checkLoginAttemptWithEmptyLogin()
		{
			inputUserName.sendKeys();
			inputPassword.sendKeys("12365478");
			btnLogin.click();
			if (txtEmptyLoginField.getText().contentEquals("Your username is required."))
				{
				return true;
				}
			else
			{
				return false;
			}
		}
		public boolean checkLoginAttemptWithEmptyPassword(String un, String pw)
		{
			inputUserName.sendKeys(un);
			inputPassword.sendKeys();
			btnLogin.click();
			if (txtEmptyPasswordField.getText().contentEquals("Your password is required."))
				{
				return true;
				}
			else
			{
				return false;
			}
		}
		
		public boolean checkStudentAccountCreation()
		{
			String str = tu.getCurrentTime();
			String userName= "test_"+str+"@email.com";
			String pwd = prop.getProperty("password");
			btnCreatNewAccount.click();
			inputEmail_CreateAccount.sendKeys(userName);
			inputConfirmEmail_CreateAccount.sendKeys(userName);
			inputPassword_CreateAccount.sendKeys(pwd);
			inputFirstName_CreateAccount.sendKeys("Ashutosh");
			inputLastName_CreateAccount.sendKeys("Dixit");
			inputCountry_CreateAccount.sendKeys("India");
			dropdownSelectRole_CreateAccount.click();
			selectStudent_CreateAccount.click();
			chkboxTermsAgreement_CreateAccount.click();
			btnCreateAccount_CreateAccount.click();
			if(txtConfirmAccountCreation.isDisplayed())
			{
				btnContinueAccountCreated.click();
				lnkSkipPhoneNo.click();
				lnkSkipConfirmation.click();
			}
			int n= reader.getRowCount("NewUser");
			reader.setCellData("NewUser", "EmailID", n+1, userName);
			reader.setCellData("NewUser", "Password", n+1, pwd);
			
			System.out.println("Account created: " + userName);
			return true;
		}
		public boolean checkInstructorAccountCreation()
		{
			String str = tu.getCurrentTime();
			String userNameInst= "test_Inst"+str+"@email.com";
			String pwd = prop.getProperty("password");
			btnCreatNewAccount.click();
			inputEmail_CreateAccount.sendKeys(userNameInst);
			inputConfirmEmail_CreateAccount.sendKeys(userNameInst);
			inputPassword_CreateAccount.sendKeys(pwd);
			inputFirstName_CreateAccount.sendKeys("Ashutosh");
			inputLastName_CreateAccount.sendKeys("Dixit");
			inputCountry_CreateAccount.sendKeys("India");
			dropdownSelectRole_CreateAccount.click();
			selectInstructor_CreateAccount.click();
			chkboxTermsAgreement_CreateAccount.click();
			btnCreateAccount_CreateAccount.click();
			return(txtConfirmAccountCreation.isDisplayed());
		}
		public boolean checkAccountCreationHelp()
		{
			btnCreatNewAccount.click();
			btnHelp_CreateAccount.click();
			if(txtHeaderHelpPopUp_CreateAccount.isDisplayed())
			{
				btnCloseHelp_CreateAccount.click();
				return true;
			}
			else
			{
				return false;
			}
		}
		public boolean checkAccountCreationCountryHelp()
		{
			btnCreatNewAccount.click();
			btnHelp_CreateAccount.click();
			if(txtHeaderCountryHelpPopUp_CreateAccount.isDisplayed())
			{
				btnCloseCountryHelp_CreateAccount.click();
				return true;
			}
			else
			{
				return false;
			}

		}
		public boolean checkSignInNavigationFromCreateAccount()
		{
			btnCreatNewAccount.click();
			lnkAlreadySignIn_CreateAccount.click();
			if(txtSignInHeader.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public boolean checkDuplicateEmailPopUpCreateAccount(String email)
		{
			btnCreatNewAccount.click();
			inputEmail_CreateAccount.sendKeys(email);
			inputConfirmEmail_CreateAccount.sendKeys(email);
			tu.explicitWait(txtDuplicateEmailPopUPHeader);
			if (txtDuplicateEmailPopUPHeader.isDisplayed())
			{
				return true;
			}
			else 
			{
				return false;	
			}
				
			
		}
		public boolean checkLoginPageNavigationFromDuplicateEmailAlert(String email)
		{
			btnCreatNewAccount.click();
			inputEmail_CreateAccount.sendKeys(email);
			inputConfirmEmail_CreateAccount.sendKeys(email);
			tu.explicitWait(txtDuplicateEmailPopUPHeader);
			if (btnSignInDuplicateEmailPopUP.isDisplayed())
			{
				
				btnSignInDuplicateEmailPopUP.click();
				String str = inputUserName.getAttribute("value");
				if(str.equals(email))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else 
			{
				return false;	
			}
				
			
		}
		public boolean checkForgotUserNamePasswordDuplicateEmailAlert(String email)
		{
			btnCreatNewAccount.click();
			inputEmail_CreateAccount.sendKeys(email);
			inputConfirmEmail_CreateAccount.sendKeys(email);
			tu.explicitWait(txtDuplicateEmailPopUPHeader);
			if (btnForgotUNamePwdDuplicateEmailPopUP.isDisplayed())
			{
				
				btnForgotUNamePwdDuplicateEmailPopUP.click();
				if(txtHeader_ForgetPassword.isDisplayed())
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else 
			{
				return false;	
			}
				
			
		}
		public boolean checkCreateAccountAnywayLinkDuplicateEmailPopUp(String email)
		{
			btnCreatNewAccount.click();
			inputEmail_CreateAccount.sendKeys(email);
			inputConfirmEmail_CreateAccount.sendKeys(email);
			tu.explicitWait(txtDuplicateEmailPopUPHeader);
			if (lnkCreateAccountAnywayDuplicateEmailPopUP.isDisplayed())
			{
				
				lnkCreateAccountAnywayDuplicateEmailPopUP.click();
				if(txtHeaderCreateAccount.getText().equals("Create an account"))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else 
			{
				return false;	
			}
				
			
		}
		public boolean checkCreateAccountPrivacyPolicyPage()
		{
			
			btnCreatNewAccount.click();
			
			lnkPriPolCreateAccount.click();
			tu.switchToTab(1);
			if(txtPrivacyHeader.getText().equals("Data Privacy"))
			{
				return true;
			}
			else 
			{
				return false;
			}
			
		}

		public boolean checkCreateAccountTermsOfUsePage()
		{
			
			btnCreatNewAccount.click();
			
			lnkTOUCreateAccount.click();
			tu.switchToTab(1);
			if(txtTOUHeader.getText().equals("Universal Terms of Service and End User License Agreement") )
			{
				return true;
			}
			else 
			{
				return false;
			}
			
		}
		public int checkLoginHelpItems()
		{
			iconHelp.click();
			tu.explicitWait(popupHelp);
			int flag =0;
			
		    lnkLoginHelpPopUpItem1.click();
		    if(txtHeaderLoginHelpItem.isDisplayed())
		    {
		    	lnkHelpItemToMainPage.click();
		    	if (txtHeaderHelpPopUp.isDisplayed())
			    {
			    	flag=flag + 1;
			    }
		    	else
		    	{
		    		flag=0;
		    	}
		    	
		    }
		    lnkLoginHelpPopUpItem2.click();
		    if(txtHeaderLoginHelpItem.isDisplayed())
		    {
		    	lnkHelpItemToMainPage.click();
		    	if (txtHeaderHelpPopUp.isDisplayed())
			    {
			    	flag=flag + 1;
			    }
		    	else
		    	{
		    		flag=0;
		    	}
		    	
		    }
		    lnkLoginHelpPopUpItem3.click();
		    if(txtHeaderLoginHelpItem.isDisplayed())
		    {
		    	lnkHelpItemToMainPage.click();
		    	if (txtHeaderHelpPopUp.isDisplayed())
			    {
			    	flag=flag + 1;
			    }
		    	else
		    	{
		    		flag=0;
		    	}
		    	
		    }
		    lnkLoginHelpPopUpItem4.click();
		    if(txtHeaderLoginHelpItem.isDisplayed())
		    {
		    	lnkHelpItemToMainPage.click();
		    	if (txtHeaderHelpPopUp.isDisplayed())
			    {
			    	flag=flag + 1;
			    }
		    	else
		    	{
		    		flag=0;
		    	}
		    	
		    }
		    
			return flag;
		}
		public int checkCreatAccountHelpItems()
		{
			btnCreatNewAccount.click();
			iconHelp.click();
			tu.explicitWait(popupHelp);
			int flag =0;
			
		    lnkCreateAccountHelpPopUpItem1.click();
		    if(txtHeaderCreateAccountHelpItem.isDisplayed())
		    {
		    	lnkHelpItemToMainPage.click();
		    	if (txtHeaderHelpPopUp.isDisplayed())
			    {
			    	flag=flag + 1;
			    }
		    	else
		    	{
		    		flag=0;
		    	}
		    	
		    }
		    lnkCreateAccountHelpPopUpItem2.click();
		    if(txtHeaderCreateAccountHelpItem.isDisplayed())
		    {
		    	lnkHelpItemToMainPage.click();
		    	if (txtHeaderHelpPopUp.isDisplayed())
			    {
			    	flag=flag + 1;
			    }
		    	else
		    	{
		    		flag=0;
		    	}
		    	
		    }
		    lnkCreateAccountHelpPopUpItem3.click();
		    if(txtHeaderCreateAccountHelpItem.isDisplayed())
		    {
		    	lnkHelpItemToMainPage.click();
		    	if (txtHeaderHelpPopUp.isDisplayed())
			    {
			    	flag=flag + 1;
			    }
		    	else
		    	{
		    		flag=0;
		    	}
		    	
		    }
		    lnkCreateAccountHelpPopUpItem4.click();
		    if(txtHeaderCreateAccountHelpItem.isDisplayed())
		    {
		    	lnkHelpItemToMainPage.click();
		    	if (txtHeaderHelpPopUp.isDisplayed())
			    {
			    	flag=flag + 1;
			    }
		    	else
		    	{
		    		flag=0;
		    	}
		    	
		    }
		    return flag;
		}
		public int checkForgetPasswordHelpItems()
		{
			lnkForgetPassword.click();
			iconHelp.click();
			tu.explicitWait(popupHelp);
			int flag =0;
			
		    lnkForgetPasswordHelpPopUpItem1.click();
		    if(txtHeaderForgetPasswordItem.isDisplayed())
		    {
		    	lnkHelpItemToMainPage.click();
		    	if (txtHeaderHelpPopUp.isDisplayed())
			    {
			    	flag=flag + 1;
			    }
		    	else
		    	{
		    		flag=0;
		    	}
		    	
		    }
		    lnkForgetPasswordHelpPopUpItem2.click();
		    if(txtHeaderForgetPasswordItem.isDisplayed())
		    {
		    	lnkHelpItemToMainPage.click();
		    	if (txtHeaderHelpPopUp.isDisplayed())
			    {
			    	flag=flag + 1;
			    }
		    	else
		    	{
		    		flag=0;
		    	}
		    	
		    }
		    return flag;
		}


}
