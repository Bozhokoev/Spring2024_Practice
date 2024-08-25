package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboString_test {

    ComboString comboString = new ComboString();

    @DataProvider(name = "comboString")
    public Object[][] dpComboString(){
        return new Object[][]{
                {"Hello", "hi", "hiHellohi"},
                {"hi", "Hello", "hiHellohi"},
                {"aaa", "b", "baaab"},
                {"b", "aaa", "baaab"},
                {"aaa", "", "aaa"},
                {"", "bb", "bb"},
                {"aaa", "1234", "aaa1234aaa"},
                {"aaa", "bb", "bbaaabb"},
                {"a", "bb", "abba"},
                {"bb", "a", "abba"},
                {"xyz", "ab", "abxyzab"}
        };
    }

    @Test(description = "Verify ComboString Functional", dataProvider = "comboString")
    public void comboString_test(String a, String b, String res){
        Assert.assertEquals(comboString.comboString(a, b), res);
    }
}
