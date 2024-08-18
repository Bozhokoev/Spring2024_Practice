package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.EveryNth;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EveryNth_Test {
    EveryNth everyNth = new EveryNth();

    @DataProvider(name = "every_nth")
    public Object[][] dpEveryNth(){
        return new Object[][]{
                {"Miracle", 2, "Mrce"},
                {"abcdefg", 2, "aceg"},
                {"abcdefg", 3, "adg"},
                {"Chocolate", 3, "Cca"},
                {"Chocolates", 3, "Ccas"},
        };
    }

    @Test(description = "Verify Every_Nth Function", dataProvider = "every_nth")
    public void everyNthTest(String str, int a, String exp){
        Assert.assertEquals(everyNth.everyNth(str, a), exp);
    }
}
