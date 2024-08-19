package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.FrontTimes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontTimes_test {

    FrontTimes frontTimes = new FrontTimes();

    @DataProvider(name = "frontTimes")
    public Object[][] dpFrontTimes(){
        return new Object[][]{
                {"Chocolate", 2, "ChoCho"},
                {"Chocolate", 3, "ChoChoCho"},
                {"Abc", 3, "AbcAbcAbc"},
                {"Ab", 4, "AbAbAbAb"},
                {"A", 4, "AAAA"},
                {"", 4, ""},
                {"Abc", 0, ""}
        };
    }

    @Test(description = "Verify Front Times Functional", dataProvider = "frontTimes")
    public void frontTimes_test(String str, int a, String res){
        Assert.assertEquals(frontTimes.frontTimes(str, a), res);
    }
}
