package com.execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utilies.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 extends BaseClass{
	
	@Parameters({"browser"})
	@Test
	private void testCase1(String s) {
		if(s.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			winMax();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			winMax();
		}
		loadUrl("https://en-gb.facebook.com/");
	}
	
	@Test
	private void testCase2() {
		System.out.println("karthik");
	}

}
