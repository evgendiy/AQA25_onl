import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CalcTest extends BaseClassTest {
    private int count = 0;

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("CalcTest started...");
    }

    @Test
    public void testSum() {
        Assert.assertEquals(calculator.sum(2, 3), 6, "Неверная сумма двух чисел");
        counter++;
    }

    @Test(enabled = false)
    public void testSum1() {
        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма двух чисел");
    }

    @Test(description = "Тест с описанием")
    public void testDescription() {
        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма двух чисел");
    }

    @Test(testName = "Переименованный тест")
    public void testName() {
        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма двух чисел");
    }

    @Test(timeOut = 1000)
    public void testTimeOut() throws InterruptedException {
        Thread.sleep(500);
    }

    @Test(invocationCount = 3, threadPoolSize = 3)
    public void invocationCountTest() {
        System.out.println(count++);
    }

    @Test(dataProvider = "dataForSum", dataProviderClass = StaticProvider.class, threadPoolSize = 3)
    public void testDataProvider(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.sum(a, b), expectedResult, "Неверная сумма двух чисел");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testException() {
        List list = null;
        int size = list.size();
    }

}
