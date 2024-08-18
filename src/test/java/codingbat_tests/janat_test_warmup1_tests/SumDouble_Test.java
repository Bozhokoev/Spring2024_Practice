package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDouble_Test {
    SumDouble sumDouble = new SumDouble();

    @DataProvider(name = "sum_double")
    public Object[][] dpSumDouble(){
        return new Object[][]{
                {1, 2, 3},
                {3, 2, 5},
                {2, 2, 8},
                {-1, 0, -1},
                {3, 3, 12},
        };
    }

    @Test(description = "Verify Sum_Double Function", dataProvider = "sum_double")
    public void sumDoubleTest(int a, int b, int exp){
        Assert.assertEquals(sumDouble.sumDouble(a, b), exp);
    }
}
