package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.IntMax;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntMax_Test {
    IntMax intMax = new IntMax();

    @DataProvider(name = "int_max")
    public Object[][] dpIntMax(){
        return new Object[][]{
                {1, 2, 3, 3},
                {1, 3, 2, 3},
                {3, 2, 1, 3},
                {9, 3, 3, 9},
                {3, 9, 3, 9},
        };
    }

    @Test(description = "Verify Int_Max Function", dataProvider = "int_max")
    public void intMaxTest(int a, int b, int c, int exp){
        Assert.assertEquals(intMax.intMax(a, b, c), exp);
    }
}
