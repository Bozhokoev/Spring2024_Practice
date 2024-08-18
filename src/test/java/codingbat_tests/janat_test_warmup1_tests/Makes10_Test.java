package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.Makes10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Makes10_Test {

    Makes10 makes10= new Makes10();

    @DataProvider(name = "makes10")
    public Object[][] dpMakes10(){
        return new Object[][]{
                {9, 10, true},
                {9, 9, false},
                {1, 9, true},
                {10, 1, true},
                {1, 10, true},

        };
    }
    @Test(description = "Verify sleep in function", dataProvider = "makes10")
    public void makes10Test(int a, int b, boolean res){
        Assert.assertEquals(makes10.makes10(a, b), res);
    }
}
