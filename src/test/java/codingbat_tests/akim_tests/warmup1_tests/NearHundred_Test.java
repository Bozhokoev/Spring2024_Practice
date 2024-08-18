package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.NearHundred;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NearHundred_Test {
    NearHundred nearHundred = new NearHundred();

    @DataProvider(name = "Near Hundred")
    public Object[][] dpNearHundred(){
        return new Object[][]{
                {93, true},
                {-101, false},
                {-209, false},
                {200, true},
                {210, true}
        };
    }

    @Test(description = "Verify Near Hundred Function", dataProvider = "Near Hundred")
    public void nearHundredTest(int a, boolean exp){
        Assert.assertEquals(nearHundred.nearHundred(a), exp);
    }
}
