package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDouble_Test {

    SumDouble sumDouble = new SumDouble();

    @DataProvider(name = "SumDoubleData")
    public Object [][] dpSumDouble(){
        return new Object[][]{
                {1,2,3},
                {3,2,5},
                {2,2,8},
        };
    }
    @Test (description = "SumDoubleData", dataProvider = "SumDoubleData")
    public void setSumDoubleTest (int a,int b, int expected) {
        Assert.assertEquals(sumDouble.sumDouble(a,b),expected);
    }

}
