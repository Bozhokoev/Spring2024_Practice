package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.BackAround;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BackAround_Test {
    BackAround backAround = new BackAround();

    @DataProvider(name = "backAround")
    public Object[][] dpBackAround() {
        return new Object[][]{
                {"cat", "tcatt"},
                {"Hello", "oHelloo"},
                {"a", "aaa"},
                {"abc","cabcc"}
        };
    }

    @Test(description = "Verify BackArond function",dataProvider = "backAround")
    public void BackAroundTest(String str, String exp){
        Assert.assertEquals(backAround.backAround(str),exp);
    }
}
