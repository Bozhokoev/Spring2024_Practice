package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDouble_Test {
    SumDouble sumDouble = new SumDouble();

    @DataProvider(name = "sumDouble")
    public Object[][] doubleSum() {
        return new Object[][]{
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
        };
    }

    @Test(description = "Verify SumDouble",dataProvider = "sumDouble")
    public void sumDoubleTest(int a, int b , int exp){
        Assert.assertEquals(a,b,exp);
    }

}
