package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboString_Test {
    ComboString comboString = new ComboString();

    @DataProvider(name = "combo_string")
    public Object[][] dpComboString(){
        return new Object[][]{
                {"Hello", "hi", "hiHellohi"},
                {"hi", "Hello", "hiHellohi"},
                {"aaa", "", "aaa"},
                {"b", "aaa",  "baaab"},
                {"aaa", "1234", "aaa1234aaa"}
        };
    }

    @Test(description = "Verify comboString function", dataProvider = "combo_string")
    public void comboStringTest(String a, String b, String expected){
        Assert.assertEquals(comboString.comboString(a, b), expected);
    }
}
