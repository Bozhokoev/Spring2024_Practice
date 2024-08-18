package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.Makes10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Makes10_Test {
    Makes10 makes10 = new Makes10();

    @DataProvider (name = "Makes 10")
    public Object [][] dpMakes10(){
        return new Object[][]{
                {9, 10, true},
                {9, 9, false},
                {1, 9, true},
                {10, 1, true},
                {1, 10, true}

        };
    }
    @Test(description = "Verify Makes 10 function", dataProvider = "Makes 10")
    public void makes10Test(int a, int b, boolean exp){
        Assert.assertEquals(makes10.makes10(a,b),exp);
    }
}
