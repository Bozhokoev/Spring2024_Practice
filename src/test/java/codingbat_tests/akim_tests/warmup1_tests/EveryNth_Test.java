package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.EveryNth;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EveryNth_Test {
    EveryNth everyNth = new EveryNth();

    @DataProvider(name = "every_nth")
    public Object[][] dpEvertNth(){
        return new Object[][]{
                {"Miracle", 2, "Mrce"},
                {"abcdefg", 2, "aceg"},
                {"Chocolate", 3, "Cca"},
                {"Chocolates", 100,  "C"},
                {"Chocolates", 4, "Coe"},
        };
    }

    @Test(description = "Verify everyNth function", dataProvider = "every_nth")
    public void everuNthTest(String str, int num, String expected){
        Assert.assertEquals(everyNth.everyNth(str, num), expected);
    }
}
