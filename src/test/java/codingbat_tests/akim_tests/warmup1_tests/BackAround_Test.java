package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.BackAround;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BackAround_Test {
    BackAround backAround = new BackAround();

    @DataProvider(name = "back_around")
    public Object[][] dpBackAround(){
        return new Object[][]{
                {"cat", "tcatt"},
                {"Hello", "oHelloo"},
                {"a", "aaa"},
                {"abc", "cabcc"},
                {"read", "dreadd"},
                {"boo", "obooo"}
        };
    }

    @Test(description = "Verify back_around function", dataProvider = "back_around")
    public void backAroundTest(String str, String expected){
        Assert.assertEquals(backAround.backAround(str), expected);
    }
}
