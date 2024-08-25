package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.EveryNth;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EveryNth_Test {
    EveryNth everyNth = new EveryNth();

    @DataProvider(name = "everyNth")
    public Object[][] dpEveryNth() {
        return new Object[][]{
                {"Miracle", 2, "Mrce"},
                {"abcdefg", 2, "aceg"},
                {"Chocolate", 3, "Cca"},
                {"Chocolates", 3, "Ccas"},
                {"Chocolates", 100, "C"},
        };
    }

    @Test(description = "Verify EveryNth function", dataProvider = "everyNth")
    public void EveryNthTest(String s, int n, String exp){
        Assert.assertEquals(everyNth.everyNth(s,n),exp);
    }
}
