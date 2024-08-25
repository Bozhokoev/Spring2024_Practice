package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStart_test {

    NonStart nonStart = new NonStart();

    @DataProvider(name = "nonStart")
    public Object[][] dpNonStart(){
        return new Object[][]{
                {"Hello", "There", "ellohere"	},
                {"java", "code", "avaode"},
                {"shotl", "java", "hotlava"},
                {"ab", "xy", "by"},
                {"ab", "x", "b"},
                {"x", "ac", "c"},
                {"a", "x", ""},
                {"kit", "kat", "itat"},
                {"mart", "dart", "artart"},
        };
    }

    @Test(description = "Verify NonStart Functional", dataProvider = "nonStart")
    public void nonStart_test(String a, String b, String res){
        Assert.assertEquals(nonStart.nonStart(a, b), res);
    }
}
