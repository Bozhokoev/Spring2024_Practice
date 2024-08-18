package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.In1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In1020_Test {

    In1020 in1020 = new In1020();

    @DataProvider(name = "in_10_20")
    public Object[][] dpIn1020(){
        return new Object[][]{
                {12, 99, true},
                {21, 12, true},
                {8, 99, false},
                {99, 10, true},
                {20, 20, true},
        };
    }

    @Test(description = "Verify In1020 Function", dataProvider = "in_10_20")
    public void in1020Test(int a, int b, boolean exp){
        Assert.assertEquals(in1020.in1020(a, b), exp);

    }
}
