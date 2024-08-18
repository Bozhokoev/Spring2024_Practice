package codingbat_tests.aidana_test_warmup1_tests;

import codingbat.aidana.warmup1.EndUp;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EndUpTest {
    EndUp endUp = new EndUp();

    @DataProvider(name = "EndUpData")
    public Object[][] EndUpData() {
        return new Object[][]{
                {"hello", "heLLO"},
                { "hel", "HEL" },
                { "abcdefghi", "abcdefGHI" },
                { "", "" },
                { "a", "A" },
                { "ab", "AB" }

        };
    }


    @Test (description = "Verify EndUp",  dataProvider = "EndUpData")
    public void testEndUp(String input, String expected) {
        Assert.assertEquals(endUp.endUp(input), expected);


    }


}
