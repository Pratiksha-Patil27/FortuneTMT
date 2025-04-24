package com.fortune.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	public static ExtentReports getExtentReport()

	{
				String path=System.getProperty("user.dir")+"\\ExtentReports\\FortuneReport.html";
				ExtentSparkReporter reporter = new ExtentSparkReporter(path);
				//Give Title name
				reporter.config().setDocumentTitle("FortuneTMT");
				//Give report name
				reporter.config().setReportName("FortuneTMT Report");
		      //Creat object ExtentReports class - it a main class- Its Responsible to drive all reporting test execution
				ExtentReports extent =new ExtentReports();
		        extent = new ExtentReports();
				extent.attachReporter(reporter);
				
				extent.setSystemInfo("Company Name", "Prowess Selling Skills Pvt.Ltd");
				extent.setSystemInfo("Project Name", "FortuneTMT Project");
				extent.setSystemInfo("Automation Tester Name", "Pratiksha Patil");
				
				
				return extent;
			}

}
