package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.BackAround;
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
        };
    }

    @Test(description = "Verify Back_Around Function", dataProvider = "back_around")
    public void backAroundTest(String str, String  exp){
        Assert.assertEquals(backAround.backAround(str), exp);
    }



}
