package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStart_Test {
    NonStart nonStart = new NonStart();

    @DataProvider(name = "non_start")
    public Object[][] dpNonStart(){
        return new Object[][]{
                {"Hello", "There", "ellohere"},
                {"java", "code", "avaode"},
                {"shotl", "java", "hotlava"},
                {"ab", "xy", "by"},
                {"ab", "x", "b"},
        };
    }

    @Test(description = "Verify Non_Start Function", dataProvider = "non_start")
    public void nonStartTest(String str, String str1, String exp){
        Assert.assertEquals(nonStart.nonStart(str, str1), exp);
    }
}
