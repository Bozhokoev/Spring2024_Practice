package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.In1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In1020_Test {
    In1020 in1020 = new In1020();

    @DataProvider(name = "in1020")
    public Object[][] dpIn1020(){
        return new Object[][]{
                {9, 9, false},
                {12, 99,true},
                {8, 99, false},
                {9, 9, false},
        };
    }

    @Test(description = "Verify In1020 function", dataProvider = "in1020")
    public void in1020Test(int a , int b , boolean exp){
        Assert.assertEquals(in1020.in1020(a,b),exp);
    }
}
