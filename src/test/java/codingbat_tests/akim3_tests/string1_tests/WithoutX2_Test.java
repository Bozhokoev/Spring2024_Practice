package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.WithoutX2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX2_Test {
    WithoutX2 withoutX2 = new WithoutX2();

    @DataProvider(name = "withoutX2")
    public Object[][] dpWithoutX2(){
        return new Object[][]{
                {"xHi", "Hi"},
                {"xx", ""},
                {"Hexllo", "Hexllo"}
        };
    }

    @Test(description = "Verify withoutX2 function", dataProvider = "withoutX2")
    public void withoutX2Test(String str, String expected){
        Assert.assertEquals(withoutX2.withoutX2(str), expected);
    }
}
