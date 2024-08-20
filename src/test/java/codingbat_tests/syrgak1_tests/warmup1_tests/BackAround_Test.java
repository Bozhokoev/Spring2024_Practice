package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.BackAround;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BackAround_Test {
    BackAround backAround_t = new BackAround();

    @DataProvider(name = "BackAround")
    public Object[][] dpBackAround(){
        return new Object[][] {
                {"cat", "tcatt"},
                {"Hello", "oHelloo"},
                {"a", "aaa"}
        };
    }

    @Test(description = "Verify BackAround Function", dataProvider = "BackAround")
    public void backAroundTest(String a, String exp){
        Assert.assertEquals(backAround_t.backAround(a), exp);
    }
}
