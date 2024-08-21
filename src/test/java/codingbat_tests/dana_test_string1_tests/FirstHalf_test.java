package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalf_test {

    FirstHalf firstHalf = new FirstHalf();

    @DataProvider(name = "firstHalf")
    public Object[][] dpFirstHalf(){
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"abcdef", "abc"},
                {"ab", "a"},
                {"", ""},
                {"0123456789", "01234"},
                {"kitten", "kit"}
        };
    }
    @Test(description = "Verify FirstHalf Functional", dataProvider = "firstHalf")
    public void firstHalf_test(String str, String res){
        Assert.assertEquals(firstHalf.firstHalf(str), res);
    }
}
