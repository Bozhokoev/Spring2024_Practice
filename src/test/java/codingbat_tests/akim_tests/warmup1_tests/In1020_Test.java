package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.In1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In1020_Test {
    In1020 in1020 = new In1020();

    @DataProvider(name = "in_1020")
    public Object[][] dpIn1020(){
        return new Object[][]{
                {12, 99, true},
                {8, 99, false},
                {99, 10, true},
                {21, 21, false},
                {9, 9, false}
        };
    }

    @Test(description = "Verify in1020 function", dataProvider = "in_1020")
    public void in1020Test(int a, int b, boolean expected){
        Assert.assertEquals(in1020.in1020(a, b), expected);
    }
}
