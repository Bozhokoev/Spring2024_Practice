package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.MiddleTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleTwo_test {

    MiddleTwo middleTwo = new MiddleTwo();

    @DataProvider(name = "middleTwo")
    public Object[][] dpMiddleTwo(){
        return new Object[][]{
                {"string", "ri"},
                {"code", "od"},
                {"Practice", "ct"},
                {"ab", "ab"},
                {"0123456789", "45"}
        };
    }

    @Test(description = "Verify MiddleTwo Functional", dataProvider = "middleTwo")
    public void middleTwo_test(String str, String res){
        Assert.assertEquals(middleTwo.middleTwo(str), res);
    }
}
