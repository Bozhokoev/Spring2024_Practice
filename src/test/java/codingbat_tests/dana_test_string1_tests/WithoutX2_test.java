package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.WithoutX2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX2_test {

    WithoutX2 withoutX2 = new WithoutX2();

    @DataProvider(name = "withoutX2")
    public Object[][] dpWithoutX2(){
        return new Object[][]{
                {"xHi", "Hi"},
                {"Hxi", "Hi"},
                {"Hi", "Hi"},
                {"xxHi", "Hi"},
                {"Hix", "Hix"},
                {"xaxb", "axb"},
                {"xx", ""},
                {"x", ""},
                {"", ""},
                {"Hello", "Hello"},
                {"Hexllo", "Hexllo"},
                {"xHxllo", "Hxllo"}
        };
    }

    @Test(description = "Verify WithoutX2 Functional", dataProvider = "withoutX2")
    public void withoutX2_test(String str, String res){
        Assert.assertEquals(withoutX2.withoutX2(str), res);
    }
}
