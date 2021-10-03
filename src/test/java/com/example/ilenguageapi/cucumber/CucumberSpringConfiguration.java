package com.example.ilenguageapi.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src / test / resources / features")
@SpringBootTest(classes = CucumberSpringConfiguration.class)
public class CucumberSpringConfiguration {
}
