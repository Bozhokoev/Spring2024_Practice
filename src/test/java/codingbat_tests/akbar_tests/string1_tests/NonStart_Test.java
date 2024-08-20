package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStart_Test {
    NonStart nonStart = new NonStart();

    @DataProvider(name = "nonStart")
    public Object[][] dpNonStart(){
        return new Object[][]{
                {"Hello", "There", "ellohere"},
                {"ab", "xy", "by"},
                {"x", "ac","c"},
                {"kit", "kat","itat"},
        };
    }

    @Test(description = "Verify nonStart fuction",dataProvider = "nonStart")
    public void nonStartTest(String a, String b, String exp){
        Assert.assertEquals(nonStart.nonStart(a,b),exp);
    }
}
