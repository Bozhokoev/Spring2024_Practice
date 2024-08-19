package codingbat_tests.aidar_tests.warmup1_tests;

import codingbat.aidar.warmup1.Makes10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Makes10_Test {
    @DataProvider (name = "makes1")
    public Object [][] dpMakes10 () {
        return new Object [][] {
                {9,10,true},
                {9,9,false},
                {1,9,true},
                {10,1,true},
                {10,10,true},
                {8,2,true},
                {8,3,false},
                {10,42,true},
                {12,-2}
        };
    }
    @Test (description = "makes10_data", dataProvider =  "makes10")
    public void testMakes10 (int a, int b, boolean except ) {
        Makes10 makes10 = new Makes10();
        boolean res = makes10.makes10(a,b);
        Assert.assertEquals(res, except);

    }
}
