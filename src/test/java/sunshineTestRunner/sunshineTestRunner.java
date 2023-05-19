package sunshineTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import sunshineUtilityPackage.Baseclass;

@CucumberOptions(features = {"src/test/resources/sunshineFolder"},
plugin = {"json:target/cucumber.json"},
glue = "sunshineStepDefination", tags = {"@contactverification"})

public class sunshineTestRunner extends AbstractTestNGCucumberTests {
				
@BeforeTest
public void SunshineOpenURL() {
Baseclass check= new Baseclass ();
check.SunshineBrowser();
				
			}
@AfterTest
public void SunshineCloseURL() {
Baseclass check= new Baseclass ();
check.driver.quit();
			}
				
			}

