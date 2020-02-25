import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testobject.appium.junit.TestObjectAppiumSuite;
import org.testobject.appium.junit.TestObjectAppiumSuiteWatcher;
import org.testobject.rest.api.appium.common.TestObject;

import java.net.URL;

import static java.lang.Thread.sleep;

/**
 * Created by albedithdiaz on 4/26/17.
 */
/* You must add these two annotations on top of your test class. */
@TestObject(testLocally = false, testObjectApiKey = "EEA2DB39151146558C93E91FA319DEAE", testObjectSuiteId = 7)
@RunWith(TestObjectAppiumSuite.class)
public class myTest {

    private AppiumDriver driver;

    @Rule
    public TestName testName = new TestName();

    @Rule
    public TestObjectAppiumSuiteWatcher resultWatcher = new TestObjectAppiumSuiteWatcher();

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("testobject_api_key", resultWatcher.getApiKey());
        capabilities.setCapability("testobject_test_report_id", resultWatcher.getTestReportId());

        driver = new AndroidDriver(new URL("http://appium.testobject.com/wd/hub"), capabilities);

        resultWatcher.setRemoteWebDriver(driver);

    }

    @Test
    public void testMethod() {
        driver.getPageSource();
    }

}
