package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.NearHundred;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NearHundred_Test {
    NearHundred nearHundred_t = new NearHundred();

    @DataProvider(name = "NearHundred")
    public Object[][] dpNearHundred(){
        return new Object[][]{
                {93, true},
                {90, true},
                {89, false},
                {111, false}
        };
    }

    @Test(description = "Verify NearHundred Function", dataProvider = "NearHundred")
    public void nearHundredTest(int num, boolean exp){
        Assert.assertEquals(nearHundred_t.nearHundred(num), exp);
    }
}
