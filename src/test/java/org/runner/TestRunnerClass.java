package org.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.reports.ReportingClass;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles", glue = {
		"org.stepdefn" }, monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
				"json:D:\\selenium ass\\SampleCloud\\src\\test\\resources\\Reports\\report.json" },strict = true,
tags= {"@PositiveScenario"})

public class TestRunnerClass {
	@AfterClass
	public static void afterClass() {
		ReportingClass.jvmReport("D:\\selenium ass\\SampleCloud\\src\\test\\resources\\Reports\\report.json");

	}

}
