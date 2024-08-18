package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.Max1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Max1020_Test {

    Max1020 max1020 = new Max1020();

    @DataProvider (name = "Max1020")
    public Object [][] dpMax1020(){
        return new Object[][]{
                {11,19,19},
                {19,11,19},
                {9,21,0},
                {9,11,11},
        };
    }
    @Test (description = "Verify Max1020",dataProvider = "Max1020")
    public void max1020Test (int a, int b, int x){
        Assert.assertEquals(max1020.max1020(a,b), x);
    }
}
