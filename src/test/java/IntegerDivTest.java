import Data.Provider;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IntegerDivTest extends BaseTest {

    @Test(timeOut = 20, groups = "smoke")
    public void testIntegerDiv() {
        Assert.assertEquals(calculator.div(Integer.MAX_VALUE, Integer.MIN_VALUE), 0, "Wrong result");
    }

    @Parameters({"dividend", "divisor", "expResult"})
    @Test()
    public void testIntegerParameters(@Optional("4") int dividend, @Optional("2") int divisor, @Optional("2") int expResult) {
        Assert.assertEquals(calculator.div(dividend, divisor), expResult, "Wrong result");
    }

    @Test(dataProvider = "IntegerData", dataProviderClass = Provider.class,
            groups = "regression", description = "test with data provider")
    public void testIntegerProvider(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.div(a, b), expectedResult, "Wrong result");
    }

    @Test(invocationCount = 10, invocationTimeOut = 520, groups = "smoke", expectedExceptions = ArithmeticException.class)
    public void testIntegerDivByZero() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(calculator.div(10, 0), 10, "Wrong result");
    }


}
