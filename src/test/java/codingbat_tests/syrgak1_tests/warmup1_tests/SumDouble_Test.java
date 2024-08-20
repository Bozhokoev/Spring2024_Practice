package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDouble_Test {
    SumDouble sumDouble_t = new SumDouble();

    @DataProvider(name = "SumDouble")
    public Object[][] dpSumDouble(){
        return new Object[][]{
                {1,2,3},
                {3,2,5},
                {-1,0,-1}
        };
    }

    @Test(description = "Verify SumDouble Function", dataProvider = "SumDouble")
    public void sumDoubleTest(int num, int num2, int exp){
        Assert.assertEquals(sumDouble_t.sumDouble(num, num2), exp);
    }
}
