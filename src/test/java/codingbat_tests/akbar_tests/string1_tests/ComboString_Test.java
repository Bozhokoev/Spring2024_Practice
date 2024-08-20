package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboString_Test {
    ComboString comboString = new ComboString();

    @DataProvider(name = "comboString")
    public Object[][] dpComboString(){
        return new Object[][]{
                {"", "bb","bb"},
                {"aaa", "","aaa"},
                {"aaa", "1234","aaa1234aaa"},
                {"bb", "a", "abba"},
                {"xyz", "ab", "abxyzab"},
        };
    }

    @Test(description = "Verify ComboString fuction",dataProvider = "comboString")
    public void comboStringTest(String a, String b, String exp){
        Assert.assertEquals(comboString.comboString(a,b),exp);
    }

}
