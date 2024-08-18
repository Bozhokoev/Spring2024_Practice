package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.BackAround;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BackAround_test {

    BackAround backAround = new BackAround();

    @DataProvider(name = "backAround")
    public Object [][] dpBackAround(){
        return new Object[][]{
                {"cat", "tcatt"},
                {"Hello", "oHelloo"},
                {"a", "aaa"},
                {"abc", "cabcc"},
                {"read", "dreadd"},
                {"boo", "obooo"}
        };
    }
    @Test(description = "Verify Back Around", dataProvider = "backAround")
    public void backAround_test(String str, String res){
        Assert.assertEquals(backAround.backAround(str), res);
    }
}
