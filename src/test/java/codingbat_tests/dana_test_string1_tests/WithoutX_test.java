package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.WithoutX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX_test {

    WithoutX withoutX = new WithoutX();

    @DataProvider(name = "withoutX")
    public Object[][] dpWithoutX(){
        return new Object[][]{
                {"xHix", "Hi"},
                {"xHi", "Hi"},
                {"Hxix", "Hxi"},
                {"Hi", "Hi"},
                {"xxHi", "xHi"},
                {"Hix", "Hi"},
                {"xaxbx", "axb"},
                {"xx", ""},
                {"x", ""},
                {"", ""},
                {"Hello", "Hello"},
                {"Hexllo", "Hexllo"	}
        };
    }

    @Test(description = "Verify WithoutX Functional", dataProvider = "withoutX")
    public void withoutX_test(String str, String res){
        Assert.assertEquals(withoutX.withoutX(str), res);
    }
}
