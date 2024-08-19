package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.FrontTimes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontTimes_Test {
    FrontTimes frontTimes = new FrontTimes();

    @DataProvider(name = "front_times")
    public Object[][] dpFrontTimes(){
        return new Object[][]{
                {"Chocolate", 2, "ChoCho"},
                {"Chocolate", 3, "ChoChoCho"},
                {"Ab", 4, "AbAbAbAb"},
                {"", 4, ""},
                {"Abc", 0, ""}
        };
    }

    @Test(description = "Verify frontTimes function", dataProvider = "front_times")
    public void frontTimesTest(String str, int num, String expected){
        Assert.assertEquals(frontTimes.frontTimes(str, num), expected);
    }
}
