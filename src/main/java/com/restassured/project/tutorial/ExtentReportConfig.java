/* * ********************
 * Please see this video tutorial : https://www.youtube.com/watch?v=WdenIgyGDyw
 * Go to the https://extentreports.com->docs->java;
 * Follow the steps;
 * *********************/

package com.restassured.project.tutorial;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportConfig {

	public void extenReportConfig(String testname) {
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/ExtentReport.html"); // path where report will e generated;
	ExtentReports extent = new ExtentReports(); // Will provide you the report;
	extent.attachReporter(reporter); // attach the report to the given path;
	ExtentTest logger = extent.createTest(testname); // Give the test name and logger will follow the test steps;
	logger.log(Status.INFO, "Info");
	logger.log(Status.PASS, "Passed");
	logger.log(Status.FAIL, "Failed");
	extent.flush(); // To flush the old report;
	}
}
