package com.mepro.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mepro.base.SessionInitiator;
import com.mepro.util.TestUtil;

public class DashboardPage extends SessionInitiator 
{
	HomePage hp;
	TestUtil tu = new TestUtil();
	LoginPage lp=new LoginPage();
	PlacmentTestPage ptp=new PlacmentTestPage();
	
	
	//Page Object Factory :: OR
	
	@FindBy(xpath="//a[contains(text(),'Start')]")
	WebElement btnStartLesson;
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	WebElement btnContinueUnderLearn;
	
	@FindBy(xpath="//*[@class='fa fa-angle-down']")
	WebElement iconViewAllCollapseExpand;
	
	@FindBy(xpath="//span[contains(text(),'View all')]")
	WebElement lnkViewAll;
	
	@FindBy(xpath="//div[@id='boxDiv']//div//a")
	List <WebElement> countLesson;
	
	@FindBy(xpath="//select[@id='dailyGoalTime']")
    WebElement menuSetGoal;
	
	
	@FindBy(xpath="//select[@id='dailyGoalTime']//option[2]")
	WebElement option30MintsGoal;
	@FindBy(xpath="//button[@id='btnSetGoal']")
	WebElement btnSetGoal;
	@FindBy(xpath="//p[contains(text(),'Get started with your learning for the day!')]")
	WebElement txtLearningStartAfterSetGoal;
	@FindBy(xpath="//body/section[1]/section[1]/section[1]/aside[1]/section[1]/section[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement lnkDashBoard;
	@FindBy(xpath="//a[@class='btn' and contains(text(), Continue)]")
	WebElement btnContinueToResumeLesson;
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//*************************************************************************************************************************************************************************//
	
	public boolean checkLessonStartButton()
	{
		ptp.checkContninueAtSummaryPage();
		btnStartLesson.click();
		if (btnContinueUnderLearn.isDisplayed())
		{
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean checkViewAllIcon_Link()
	{
		ptp.checkContninueAtSummaryPage();
		if(iconViewAllCollapseExpand.isDisplayed() && lnkViewAll.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean checkLessonCount()
	{
		ptp.checkContninueAtSummaryPage();
		iconViewAllCollapseExpand.click();
		if(countLesson.size()==8)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean setGoal()
	{
		ptp.checkContninueAtSummaryPage();
		menuSetGoal.click();
		option30MintsGoal.click();
		btnSetGoal.click();
		if(txtLearningStartAfterSetGoal.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean checkResumeLessonActivity()
	{
		ptp.checkContninueAtSummaryPage();
		btnStartLesson.click();
		if (btnContinueUnderLearn.isDisplayed())
		{
			lnkDashBoard.click();
			if(btnContinueToResumeLesson.isDisplayed())
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
	public boolean checkAllLessonsLoad()
	{
		ptp.checkContninueAtSummaryPage();
		lnkViewAll.click();
		int flag=0;
		tu.implicitWait(10);
		for(int i=1;i<=countLesson.size();i++)
		{
			driver.findElement(By.xpath("//*[@id='chBoxDiv"+i+"'"+ "]/a/div[1]/div/img")).click();
			if (btnContinueUnderLearn.isDisplayed())
			{
				lnkDashBoard.click();
				lnkViewAll.click();
				flag= flag+1;
				
			}
			
		}
		if (flag==8)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
