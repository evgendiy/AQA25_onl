package Data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Provider {
    @DataProvider(name = "DoubleData", parallel = true)
    public static Object[][] dataForDoubleDivTest() {
        return new Object[][]{
                {67.99, 3.34, 20.3562874251497},
                {10.0, 2.5, 4.0},
                {-2.0, -2.0, 1.0},
                {-50.0, 25.0, -2.0},
                {20.0, -2.0, -10.0},
                {20.0, 0.0, Double.POSITIVE_INFINITY},
                {-20.0, 0.0, Double.NEGATIVE_INFINITY},
                {0.0, 0.0, Double.NaN},
                {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN}
        };
    }

    @DataProvider(name = "IntegerData")
    public static Object[][] dataForIntegerDivTest() {
        return new Object[][]{
                {4, 2, 2},
                {10, -2, -5},
                {-100, -10, 10},
                {-50, 25, -2},
                {0, 5, 0},
                {5, 1, 5},
                {1, 5, 0}
        };
    }

}
