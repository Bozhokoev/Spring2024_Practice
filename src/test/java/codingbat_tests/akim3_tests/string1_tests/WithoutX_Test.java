package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.WithoutX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX_Test {
    WithoutX withoutX = new WithoutX();

    @DataProvider(name = "without_X")
    public Object[][] dpWithoutX(){
        return new Object[][]{
                {"xHix",  "Hi"},
                {"xaxbx",  "axb"},
                {"x",  ""}
        };
    }

    @Test(description = "Verify withoutX function", dataProvider = "without_X")
    public void withoutXTest(String str, String expected){
        Assert.assertEquals(withoutX.withoutX(str), expected);
    }
}
