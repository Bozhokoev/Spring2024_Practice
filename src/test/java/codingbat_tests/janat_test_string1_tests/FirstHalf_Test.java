package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalf_Test {

    FirstHalf firstHalf = new FirstHalf();

    @DataProvider(name = "first_half")
    public Object[][] dpFirstHalf(){
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"abcdef", "abc"},
                {"ab", "a"},
                {"", ""},
        };
    }
    @Test(description = "Verify First_Half Function", dataProvider = "first_half")
    public void firstHalfTest(String str, String exp){
        Assert.assertEquals(firstHalf.firstHalf(str),exp);
    }
}
