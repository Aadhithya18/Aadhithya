package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	public static void jvmReport(String jsonfile) {
		File reports = new File("D:\\selenium ass\\SampleCloud\\src\\test\\resources\\Reports");
		Configuration config = new Configuration(reports, "Flipkart Automation");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Version", "94");
		config.addClassifications("OS", "Window");
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		ReportBuilder builder = new ReportBuilder(jsonfiles, config);
		builder.generateReports();
		
		
}

}
