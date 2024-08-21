package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.Without2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Without2_test {

    Without2 without2 = new Without2();

    @DataProvider(name = "without2")
    public Object[][] dpWithout2(){
        return new Object[][]{
                {"HelloHe", "lloHe"},
                {"HelloHi", "HelloHi"},
                {"Hi", ""},
                {"Chocolate", "Chocolate"},
                {"xxx", "x"},
                {"хх", ""},
                {"", ""},
                {"Fruits", "Fruits"}
        };
    }

    @Test(description = "Verify Without2 functional", dataProvider = "without2")
    public void without2_test(String str, String res){
        Assert.assertEquals(without2.without2(str), res);
    }
}
