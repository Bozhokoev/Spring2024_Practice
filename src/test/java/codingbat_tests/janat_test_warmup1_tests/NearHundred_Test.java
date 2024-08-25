package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.NearHundred;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NearHundred_Test {

    NearHundred nearHundred = new NearHundred();

    @DataProvider(name = "near_hundred")
    public Object[][] dpNearHundred(){
        return new Object[][]{
                {93, true},
                {-101, false},
                {-209, false},
                {200, true},
                {210, true},
        };
    }
    @Test(description = "Verify Near_Hundred function", dataProvider = "near_hundred")
    public void nearHudred (int a, boolean b){
        Assert.assertEquals(nearHundred.nearHundred(a), b);
    }


}
