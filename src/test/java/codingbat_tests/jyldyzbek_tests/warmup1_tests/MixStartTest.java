package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.MixStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MixStartTest {

    @DataProvider(name = "mixStartDataProvider")
    public Object[][] mixStartDataProvider() {
        return new Object[][]{
                {"mix snacks", true},
                {"pix snacks", true},
                {"piz snacks", false},
                {"nix", true},
                {"ni", false},
                {"n", false},
                {"", false}
        };
    }

    @Test(dataProvider = "mixStartDataProvider")
    public void testMixStart(String input, boolean expected) {
        MixStart mixStart = new MixStart();
        Assert.assertEquals(
                mixStart.mixStart(input),
                expected);
    }
}
