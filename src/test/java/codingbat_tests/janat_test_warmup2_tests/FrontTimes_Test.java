package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.FrontTimes;
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
                {"Abc", 3, "AbcAbcAbc"},
                {"Ab", 4, "AbAbAbAb"},
                {"A", 4, "AAAA"},
        };
    }

    @Test(description = "Verify Front_Times Function", dataProvider = "front_times")
    public void frontTimesTest(String str, int n, String exp){
        Assert.assertEquals(frontTimes.frontTimes(str, n), exp);
    }
}
