package com.paras;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SmokeTest extends BaseTest {

		
	    
	   
	   @Test
	  
	    public void AppiumUser() throws InterruptedException, MalformedURLException {
		  
		  /* driver.get("https://www.facebook.com/");*/
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Paras");
			Thread.sleep(5000); 
		/*  

			  //File appDir = new File("E:\\Android appium");
			 //File app = new File(appDir, "evati-release_1-0-16_qa.apk");
			 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
			 capabilities.setCapability(MobileCapabilityType.PLATFORM,"Android");
			 capabilities.setCapability(MobileCapabilityType.VERSION,"7.1.1");
			 AndroidDriver driver  = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	//Map<String, Object> data = populateUniqueData(xmlUtils.getXMLNodeValues("userData"));
	driver.get(applyURL);
	
	    }*/
	    
	 
	  
			

	/* DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.SetCapability(MobileCapabilityType.PlatformVersion, "8.0");
	    capabilities.SetCapability(MobileCapabilityType.DeviceName, "iPhone Simulator");
	    capabilities.SetCapability(MobileCapabilityType.App, <path to your app>);
	    AppiumDriver<IOSElement> drive = new IOSDriver<IOSElement>(
	                                   new Uri("http://127.0.0.1:4723/wd/hub"), 
	                                     capabilities);*/
	  
		
	    //Verify that User is able to Signup .
		
		
			/*
			driver.get("http://saucelabs.com/test/guinea-pig");
			WebElement div = driver.findElement(By.id("i_am_an_id"));
			Assert.assertEquals("I am a div", div.getText()); //check the text retrieved matches expected value
			driver.findElement(By.id("comments")).sendKeys("My comment"); //populate the comments field by id.

			//close the app.
			driver.quit();
               */
		
		/*

		@Override
		public void beforeClass() throws InterruptedException, Exception {
		}
		*/

	}

	@Override
	public void afterTest() {
		// TODO Auto-generated method stub
		
	}}



