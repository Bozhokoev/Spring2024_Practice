package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.BackAround;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BackAround_Test {
    BackAround backAround = new BackAround();

    @DataProvider(name = "BackAround")
    public Object[][] dpBackAround() {
        return new Object[][]{
                {"cat","tcatt"},
                {"Hello","oHelloo"},
                {"a","aaa"},
                {"boo","obooo"}

        };
    }

    @Test (description = "Verify BackAground functon", dataProvider = "BackAround")
            public void backAgroundTes (String str, String exp){
        Assert.assertEquals(backAround.backAround(str),exp);
    }
}