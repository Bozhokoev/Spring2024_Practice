package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.In1020;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In1020_Test {
    In1020 in1020 = new In1020();

    @DataProvider (name = "In1020")
    public Object [][] dpIn1020(){
        return new Object[][]{
                {12,99,true},
                {8,9,false},
                {20,20,true},
                {9,9,false},
        };
    }
    @Test (description = "Verify In1020 Test", dataProvider = "In1020")
    public void in1020Test(int a, int b, boolean exp){
        Assert.assertEquals(in1020.in1020(a,b),exp);
    }
}
