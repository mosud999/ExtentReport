package com.restassured.project.tutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtentReportTutorial {

	ExtentReportConfig extentReportConfig;
	
	@Test
	public void test1() {
		extentReportConfig = new ExtentReportConfig();
		extentReportConfig.extenReportConfig("test1");
		System.out.println("Test case one passed");
	}
	
	@Test
	public void test2() {
		extentReportConfig = new ExtentReportConfig();
		extentReportConfig.extenReportConfig("test1");
		System.out.println("Test case two passed");
	}
	
	@Test
	public void test3() {
		extentReportConfig = new ExtentReportConfig();
		extentReportConfig.extenReportConfig("test1");
		System.out.println("Test case three failed");
		Assert.assertTrue("a".equals("b"));
	}
}
