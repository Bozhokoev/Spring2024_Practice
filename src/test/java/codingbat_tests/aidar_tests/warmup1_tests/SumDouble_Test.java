package codingbat_tests.aidar_tests.warmup1_tests;

import codingbat.aidar.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDouble_Test {
    @DataProvider(name = "SumDoubleTest")
    public Object[][] dpSumDouble() {
        return new Object[][]{
                {1, 2, 3},
                {3, 2, 5},
                {2, 2, 8},
                {-1, 0, -1},
                {3, 3, 12},
                {0, 0, 0},
                {0, 1, 1},
                {3, 4, 7}
        };

    }
    @Test(description = "SumDoubleTest", dataProvider = "SumDoubleTest")
    public void SumDoubleTesting(int a, int b, int expected) {
        SumDouble sumDouble = new SumDouble();
        Assert.assertEquals(sumDouble.calculate(a,b),expected);


    }
    class SumDouble {

        public int calculate(int a, int b) {
            int sum = a + b;
            if (a == b) {
                sum *= 2;
            }
            return sum;
        }
    }
}

