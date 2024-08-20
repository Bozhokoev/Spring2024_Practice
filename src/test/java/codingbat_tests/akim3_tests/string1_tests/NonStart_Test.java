package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStart_Test {
    NonStart nonStart = new NonStart();

    @DataProvider(name = "non_start")
    public Object[][]dpNonStart(){
        return new Object[][]{
                {"Hello", "There", "ellohere"},
                {"java", "code", "avaode"},
                {"shotl", "java", "hotlava"},
                {"ab", "xy", "by"},
                {"a", "x", ""}
        };
    }

    @Test(description = "Verify nonStart function", dataProvider = "non_start")
    public void nonStartTest(String a, String b, String expected){
        Assert.assertEquals(nonStart.nonStart(a, b), expected);
    }
}
