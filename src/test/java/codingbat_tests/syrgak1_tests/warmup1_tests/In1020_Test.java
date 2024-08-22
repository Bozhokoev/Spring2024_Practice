package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.In1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In1020_Test {
    In1020 in1020_t = new In1020();

    @DataProvider(name = "In1020")
    public Object[][] dpIn1020(){
        return new Object[][]{
                {12,99, true},
                {8,99, false},
                {20,21, true}
        };
    }

    @Test(description = "Verify In1020 Function", dataProvider = "In1020")
    public void in1020Test(int num, int num2, boolean exp){
        Assert.assertEquals(in1020_t.in1020(num,num2), exp);
    }
}
