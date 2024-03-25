import Data.Provider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleDivTest extends BaseTest {
    @Test(priority = 3, testName = "hardcode test", description = "test for checking")
    public void testDoubleDiv1() {
        Assert.assertEquals(calculator.div(10.0, 2.0), 5.0, "Wrong result");
    }

    @Test(enabled = true) //падает для проверки alwaysRun в testRetryDiv
    public void testDoubleDiv2() {
        Assert.assertEquals(calculator.div(10.0, 4), 2.5, "Wrong result");
    }

    @Test(priority = 1, dataProvider = "DoubleData", dataProviderClass = Provider.class,
            description = "test with data provider", threadPoolSize = 4)
    public void testDoubleProvider(double a, double b, double expectedResult) {
        Assert.assertEquals(calculator.div(a, b), expectedResult, "Wrong result");
    }

    @Test(priority = 2, expectedExceptions = AssertionError.class)
    public void testDoubleException() {
        Assert.assertEquals(calculator.div(0.0, 0.0), 0.0);
    }

    @Test(dependsOnMethods = "testDoubleDiv2", alwaysRun = true, retryAnalyzer = Retry.class)
    public void testRetryDiv() {
        Assert.assertEquals(calculator.div(50, Retry.b), 1.0);
    }

}
