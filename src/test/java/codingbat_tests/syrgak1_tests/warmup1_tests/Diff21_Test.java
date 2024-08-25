package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.Diff21;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Diff21_Test {
    Diff21 diff21_t = new Diff21();

    @DataProvider(name = "Diff21")
    public Object[][] dpDiff21(){
        return new Object[][]{
                {19, 2},
                {10, 11},
                {-1, 22},
                {-2, 23},
        };
    }

    @Test(description = "Verify Diff21 Function", dataProvider = "Diff21")
    public void diff21Test(int num, int exp){
        Assert.assertEquals(diff21_t.diff21(num), exp);
    }
}
