package com.guru99.gurubank.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\Login.feature",
glue="com.guru99.gurubank.stepdefinitions",
snippets=SnippetType.CAMELCASE)



public class InicioDeSesionRunner {

}
