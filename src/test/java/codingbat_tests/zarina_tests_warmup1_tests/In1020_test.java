package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.In1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In1020_test {

    In1020 in1020 = new In1020();

    @DataProvider(name = "in1020")
    public Object [][] dpIn1020(){
        return new Object[][]{
                {12, 99, true},
                {21, 12, true},
                {8, 99, false},
                {99, 10, true},
                {20, 20, true},
                {21, 21, false},
                {9, 9, false}
        };
    }
    @Test(description = "Verify in1020 Functional", dataProvider = "in1020")
    public void in1020_test(int a, int b, boolean res){
        Assert.assertEquals(in1020.in1020(a, b), res);
    }
}
