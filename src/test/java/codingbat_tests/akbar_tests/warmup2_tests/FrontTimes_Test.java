package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.FrontTimes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontTimes_Test {
    FrontTimes frontTimes = new FrontTimes();

    @DataProvider(name = "frontTimes")
    public Object[][] dpFrontTimes(){
        return new Object[][]{
                {"Chocolate", 2,"ChoCho"},
                {"Abc", 3,"AbcAbcAbc"},
                {"Ab", 4, "AbAbAbAb"},
                {"A", 4,"AAAA"},
                {"", 4, ""},
        };
    }

    @Test(description = "Verify FrontTimes function",dataProvider = "frontTimes")
    public void frontTimesTest(String s, int n, String exp){
        Assert.assertEquals(frontTimes.frontTimes(s,n),exp);
    }
}
