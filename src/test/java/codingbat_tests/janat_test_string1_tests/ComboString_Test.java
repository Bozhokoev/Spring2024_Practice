package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.ComboString;
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
                {"aaa", "b", "baaab"},
                {"b", "aaa", "baaab"},
                {"aaa", "", "aaa"},
        };
    }
    @Test(description = "Verify Combo_String Function", dataProvider = "combo_string")
    public void comboStringTest(String str, String str1, String exp){
        Assert.assertEquals(comboString.comboString(str, str1), exp);
    }
}
