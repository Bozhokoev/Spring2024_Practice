package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.EveryNth;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EveryNth_Test {
    EveryNth everyNth_t = new EveryNth();

    @DataProvider(name = "EveryNth")
    public Object[][] dpEveryNth(){
        return new Object[][]{
                {"Miracle",2,"Mrce"},
                {"abcdefg",2,"aceg"},
                {"Chocolate",3,"Cca"}
        };
    }

    @Test(description = "Verify EveryNth Function", dataProvider = "EveryNth")
    public void everyNthTest(String a, int num, String exp){
        Assert.assertEquals(everyNth_t.everyNth(a, num), exp);
    }
}
