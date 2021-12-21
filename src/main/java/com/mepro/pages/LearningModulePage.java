package com.mepro.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mepro.base.SessionInitiator;
import com.mepro.util.TestUtil;

public class LearningModulePage extends SessionInitiator 
{
	HomePage hp;
	TestUtil tu = new TestUtil();
	LoginPage lp=new LoginPage();
	PlacmentTestPage ptp=new PlacmentTestPage();
	
	//Page Object Factory :: OR
	@FindBy(xpath="//*[@id=\"lmodule\"]/a/span")
	WebElement lnkLearningModule;
	@FindBy(xpath="//body/section[1]/section[1]/section[1]/section[1]/section[1]/section[1]/div[1]")
	WebElement panelLavelNavigation;
	
	@FindBy(xpath="//div[@class='levelsRange']//ul//li")
	List <WebElement> lstOfLevels;
	
	@FindBy(xpath="//div[@class='topicHead ']")
	List <WebElement> countLevelModules;
	
	@FindBy(css="div[class^='topicHead topicHeadDefault']")
	List <WebElement> countModuleQuiz;
	
	@FindBy(xpath="//div//div[@class='title']")
	WebElement headerModule;
	
	@FindBy(xpath="//div[@class='moduleList']//div[@class='boxDiv']")
	List <WebElement> countLesson;
	
	@FindBy(xpath="//div[@class='moduleList']")
	WebElement elementLessonList;
	
	public LearningModulePage()
	{
		PageFactory.initElements(driver, this);
	}
	//*************************************************************************************************************************************************************************//
	public boolean checkLearningModulePageNavigation()
	{
		lnkLearningModule.click();
		if(panelLavelNavigation.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean checkNoOfLevels()
	{
		lnkLearningModule.click();
		if(lstOfLevels.size()==10)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	public boolean checkLevelLoad()
	{
		lnkLearningModule.click();
		int counter=0;
		for(int i=2; i<=lstOfLevels.size(); i++) 
		{
			WebElement level = driver.findElement(By.xpath("//div[@class='levelsRange']//ul//li["+i+"]"));
			level.click();
			WebElement level1 = driver.findElement(By.xpath("//div[@class='levelsRange']//ul//li["+i+"]"));
//			if(level1.isSelected())
			String className = level1.getAttribute("class");
			if(className.equals(" show "))

			{
				counter++;
			}
			if (counter ==9)
			{
				
			}
			
		}
		if (counter==9)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean checkModules()
	{
		lnkLearningModule.click();
		int i= countLevelModules.size();
		int counter =0;
		int flag=0;
		
		for(int l=1; l<=lstOfLevels.size(); l++) 
		{
			WebElement level = driver.findElement(By.xpath("//div[@class='levelsRange']//ul//li["+l+"]"));
			level.click();
			driver.navigate().refresh();
		for(int m=1;m<=i; m++)
		{
			WebElement module = driver.findElement(By.xpath("//div[@class='topicHead ' and @count='" + m + "']"));
			String moduleName=module.getText();
			//System.out.println("**********************************" +moduleName);
			
			
			module.click();
			String moduleHeader=headerModule.getText();
			//System.out.println("**********************************" +moduleHeader);
			if(elementLessonList.isDisplayed())
			
			{
				counter=1;
				System.out.println("*****All Okay*******************");
			}
			else
			{
				flag=1;
				System.out.println("*************************Level " + l + "  > Module " + m + " > Loading problem occurred");
			}
			lnkLearningModule.click();
		


		}
		System.out.println("**************Level: " +l+ "********************");
		}
        if (counter==1 && flag==0)
		{
			
		return true;
		}
		else
		{
			return false;
		}
	}
	

}
