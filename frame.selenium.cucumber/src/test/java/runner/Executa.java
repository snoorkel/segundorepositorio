package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/features",
		glue= "steps",
	    tags = "@moto",
	    monochrome= true,
	    dryRun = false,
	    plugin= {"pretty","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)



public class Executa extends DriversFactory{

	
	public static void abrirnavegador() {
    String urlTeste ="https://buger-eats.vercel.app/deliver";
    System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get(urlTeste);
    driver.manage().window().maximize();
	}
	
}
