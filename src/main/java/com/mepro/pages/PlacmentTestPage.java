package com.mepro.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.mepro.base.SessionInitiator;
import com.mepro.util.TestUtil;

public class PlacmentTestPage extends SessionInitiator 
{
	HomePage hp;
	TestUtil tu = new TestUtil();
	LoginPage lp=new LoginPage();
	//Page Object Factory :: OR
	
	@FindBy(xpath="//span[@class='user']")
	WebElement txtUserNameProfile;
	@FindBy(xpath="//span[@class='userArroIcon dropdown']//img[@class='userArroIcon']")
	WebElement dropdownProfile;
	@FindBy(xpath="//ul[@id='profileDrop']//span[@class='liTxt'][contains(text(),'Support')]")
	WebElement optionSupportProfile;
	@FindBy(xpath="//ul[@id='profileDrop']//span[@class='liTxt'][contains(text(),'Logout')]")
	WebElement optionLogoutProfile;
	@FindBy(xpath="//h4[contains(text(),'Pearson Digial English (PDE)')]")
	WebElement txtHeaderSupportPage;
	@FindBy(xpath="//button[@class='btn']")
	WebElement btnTakeTheTest;
	@FindBy(xpath="//a[contains(text(),'Skip the test')]")
	WebElement lnkSkipTheTest;
	@FindBy(xpath="//img[@class='baseline-help']")
	WebElement iconWhyShouldITakeTest;
	@FindBy(xpath="//a[@class='taketest']")
	WebElement lnkWhyShouldITakeTest;
	@FindBy(xpath="//div[@id='showInstPopup']//div[@class='modal-content']")
	WebElement popUpWhyShouldITakeTest;
	@FindBy(xpath="//h3[@class='header']")
	WebElement txtHeaderPopUpWhyShouldITakeTest;
	
	@FindBy(xpath="//img[@class='responsive welcome_leftImg']")
	WebElement imgWelcomePage;
	@FindBy(xpath="//*[@id=\"loginForm\"]/p/button")
	WebElement txtHeaderWelcomePage;
	@FindBy(xpath="//p[@class='sub-heading relative']")
	WebElement txtSubHeaderWelcomePage;
	@FindBy(xpath="//img[@class='logoImg']")
	WebElement imgProductLogo;
	@FindBy(xpath="//p[@class='sub-heading relative']")
	WebElement iconTimer;
	@FindBy(xpath="//span[@class='time']")
	WebElement txtTimeInstruction;
	@FindBy(xpath="//img[@class='adapts_icon']")
	WebElement iconQuizInstruction;
	@FindBy(xpath="//span[@class='adapts']")
	WebElement txtQuizInstruction;
	@FindBy(xpath="//img[@class='headset_icon']")
	WebElement iconHeadset;
	@FindBy(xpath="//span[@class='headset']")
	WebElement txtHeadsetInstruction;
	@FindBy(xpath="//*[@id='_hj-f5b2a1eb-9b07_feedback_minimized']/div[1]/div")
	WebElement tabFeedback;
	@FindBy(xpath="//div[@id='_hj-f5b2a1eb-9b07_feedback_open']")
	WebElement popUpFeedback;
	@FindBy(xpath="//*[@id='_hj-f5b2a1eb-9b07_feedback_open_close_phone']/span")
	WebElement btnCloseFeedbackPopUp;
	@FindBy(xpath="//p[contains(text(),'How would you rate your experience?')]")
	WebElement txtFeedbackQuestion;
	@FindBy(xpath="//h1[@class='unitActivityTitle']")
	WebElement txtUnitActivityTitle;
	
	@FindBy(xpath="//div[@class='auth-content container wide ng-scope']")
	WebElement popUpRequiredPolicies;
	@FindBy(xpath="//div[@class='pe-checkbox']//label")
	WebElement chkBoxRequiredPolicies;
	@FindBy(xpath="//button[@id='mainButton']")
	WebElement btnContinueRequiredPolicies;
	
	
	
	@FindBy(xpath="//b[contains(text(),'Welcome to Placement')]")
	WebElement txtHeaderWTP;
	
	@FindBy(xpath="//input[@id='pseSubmit']")
	WebElement btnWelcomePreSubmit;
	
	@FindBy(xpath="//button[@id='continue']")
	WebElement btnContinueUnattempted;
	
	@FindBy(xpath="/html/body/section/section/section/div[1]/p[1]")
	WebElement txtPlacementTestSubmission;
	
	@FindBy(xpath="//button[@id='psePause']")
	WebElement btnPausePacementTest;
	
	@FindBy(xpath="//span[contains(text(),'Section time left:')]")
	WebElement txtSectionTimeLeft;
	
	@FindBy(xpath="//button[@class='btn btn-info']")
	WebElement btnSubmitPlacementTest;
	
	@FindBy(xpath="//div[@class='levelBox']")
	WebElement panelLevelBox;
	
	@FindBy(xpath="//div[@class='ui-dialog activity-modal ng-scope']")
	WebElement popUpPausePlacementTest;
	@FindBy(xpath="//button[@id='modal-pause']")
	WebElement btnPopUpPausePlacementTest;
	@FindBy(xpath="//button[@id='modal-cancel']")
	WebElement btnPopUpCancelPausePlacementTest;
	@FindBy(xpath="//ul[@class='rangeList']/li)")
	List <WebElement> lstTotalLevels;
	
	@FindBy(xpath="//a[@class='taketest']")
	WebElement lnkUpGSE_CEFR;
	@FindBy(xpath="//div[@id='showRangePopup']//div[@class='modal-content']")
	WebElement popUpGSE_CEFR;
	@FindBy(xpath="//button[@id='continueBtn']")
	WebElement btnContinuePlacementTestSummaryPage;
	
	
	@FindBy(xpath="//button[@id='getStartBtn']")
	WebElement btnGetStarted;
	
	@FindBy(xpath="//*[@id='contentShow']/h3")
	WebElement txtHeaderWelcomeToDashboard;
	//Welcome to your dashboard
	@FindBy(xpath="//*[@id='btnConceptNext']")
	WebElement btnNextWelcomeToDashboard;
	@FindBy(xpath="//*[@id='contentDiv']/section/section/form/div[1]/h3")
	WebElement txtPopUpStartLearningJourney;
	//Click any of the tasks to start your learning journey
	@FindBy(xpath="//button[@id='btnRightNext']")
	WebElement btnNextStartLearningJourney;
	@FindBy(xpath="//button[@id='btnCloseNext']")
	WebElement btnNextSetGoal;
	@FindBy(xpath="//a[contains(text(),'Start')]")
	WebElement btnStartModuleAtDashboard;
	

	
	public PlacmentTestPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//*************************************************************************************************************************************************************************//
	

	public boolean attemptQuiz() throws InterruptedException
	{
		lp.checkStudentAccountCreation();
		int counter=0;
		int flag=0;
		btnTakeTheTest.click();
        while(flag==0)
		{
        	
        	List<WebElement> header = driver.findElements(By.xpath("//h1[@class='unitActivityTitle']"));
    		if (!header.isEmpty()) 
    		{
    			flag=0;
    		    
    		}
    		else
    		{
    			flag=1;
    			break;
    		}

            if(counter <= 1)
            {
            	
            	Thread.sleep(3000);
            	btnWelcomePreSubmit.click();
            }
            else if (counter > 1)
            {
            	List<WebElement> txt = driver.findElements(By.xpath("//span[contains(text(),'Section time left:')]"));
        		if (!txt.isEmpty()) 
        		{
        			Thread.sleep(3000);
        			btnWelcomePreSubmit.click();
        			
        			List<WebElement> cont = driver.findElements(By.xpath("//button[@id='continue']"));
            		if (!cont.isEmpty()) 
            		{
            			cont.get(0).click();
            			driver.navigate().refresh();
            		}
            		else
            		{
            			btnWelcomePreSubmit.click();
            			List<WebElement> fin = driver.findElements(By.xpath("//input[@value='Finish']"));
                		if (!fin.isEmpty()) 
                		{
                			fin.get(0).click();
                			break;
                		}
            		}
        			
        		}

      		
            }
            counter++;
            
        }
        
        btnSubmitPlacementTest.click();
        if (panelLevelBox.isDisplayed())
        {
        	return true;
        	
        }
        else
        {
        	return false;
        }
	}
	public boolean pausePlacementTest()
	{
		lp.checkStudentAccountCreation();
		btnTakeTheTest.click();
		tu.explicitWait(btnWelcomePreSubmit);
    	btnWelcomePreSubmit.click();
    	btnPausePacementTest.click();
    	
    	if(popUpPausePlacementTest.isDisplayed())
    	{
    		btnPopUpPausePlacementTest.click();
    		if(txtPlacementTestSubmission.isDisplayed())
    		{
    			btnSubmitPlacementTest.click();
    		}
    	}
    	if(panelLevelBox.isDisplayed())
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    	
    }
	public boolean cancelPausePlacementTest()
	{
		lp.checkStudentAccountCreation();
		btnTakeTheTest.click();
		tu.explicitWait(btnWelcomePreSubmit);
    	btnWelcomePreSubmit.click();
    	btnPausePacementTest.click();
    	
    	if(popUpPausePlacementTest.isDisplayed())
    	{
    		btnPopUpCancelPausePlacementTest.click();
    	}
    	if (txtSectionTimeLeft.isDisplayed())
        {
        	return true;
        	
        }
        else
        {
        	return false;
        }
    	
    }
	public boolean skipPlacementTest()
	{
		lp.checkStudentAccountCreation();
		lnkSkipTheTest.click();
		if (panelLevelBox.isDisplayed())
        {
        	return true;
        	
        }
        else
        {
        	return false;
        }
	}
	
	public int checkTotalLevels()
	{
		lp.checkStudentAccountCreation();
		lnkSkipTheTest.click();
		System.out.println("************************************" + lstTotalLevels.size());
		return(lstTotalLevels.size());
	}
	
	public boolean checkGSE_CEFRLink()
	{
		lp.checkStudentAccountCreation();
		lnkSkipTheTest.click();
		lnkUpGSE_CEFR.click();
		tu.explicitWait(popUpGSE_CEFR);
	if(popUpGSE_CEFR.isDisplayed())	
	{
	  return true;		
	}
	else
	{
		return false;
	}
		
	}
	public boolean checkContninueAtSummaryPage()
	{
		lp.checkStudentAccountCreation();
		lnkSkipTheTest.click();
		btnContinuePlacementTestSummaryPage.click();
		tu.explicitWait(btnGetStarted);
		btnGetStarted.click();
		tu.explicitWait(btnNextWelcomeToDashboard);
		btnNextWelcomeToDashboard.click();
		btnNextStartLearningJourney.click();
		btnNextSetGoal.click();
		if(btnStartModuleAtDashboard.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}



}
