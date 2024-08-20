package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.WithoutX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX_Test {
    WithoutX withoutX = new WithoutX();

    @DataProvider(name = "WithoutX")
    public Object[][] dpWithoutX() {
        return new Object[][]{
                {"xHix", "Hi"},
                {"bye", "bye"},
                {"x", ""},
                {"Hexllo", "Hexllo"}
        };
    }

    @Test(description = "Verify WithoutX Test", dataProvider = "WithoutX")
    public void withoutXTest(String str, String res) {
        Assert.assertEquals(withoutX.withoutX(str), res);
    }
}
