package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.EveryNth;
import codingbat.dana.warmup1.StringE;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EveryNth_test {

    EveryNth everyNth = new EveryNth();

    @DataProvider(name = "everyNth")
    public Object[][] dpEveryNth(){
        return new Object[][]{
                {"Miracle", 2, "Mrce"},
                {"abcdefg", 2, "aceg"},
                {"abcdefg", 3, "adg"},
                {"Chocolate", 3, "Cca"},
                {"Chocolates", 3, "Ccas"},
                {"Chocolates", 4, "Coe"},
                {"Chocolates", 100, "C"}
        };
    }

    @Test(description = "Verify EveryNth Functional", dataProvider = "everyNth")
    public void everyNth_test(String str, int a, String res){
        Assert.assertEquals(everyNth.everyNth(str, a), res);
    }
}
