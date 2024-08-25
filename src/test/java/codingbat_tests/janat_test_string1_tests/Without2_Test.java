package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.Without2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Without2_Test {
    Without2 without2 = new Without2();

    @DataProvider(name = "without_2")
    public Object[][] dpWithout2(){
        return new Object[][]{
                {"HelloHe", "lloHe"},
                {"HelloHi", "HelloHi"},
                {"Hi", ""},
                {"Chocolate", "Chocolate"},
                {"xxx", "x"},
        };
    }
    @Test(description = "Verify Without2 Function", dataProvider = "without_2")
    public void without2Test(String str, String exp){
        Assert.assertEquals(without2.without2(str), exp);
    }
}
