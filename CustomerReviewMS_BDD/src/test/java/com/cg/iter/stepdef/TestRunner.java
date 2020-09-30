package com.cg.iter.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/Feature",
glue="com.cg.iter.stepdef")
public class TestRunner {

}
