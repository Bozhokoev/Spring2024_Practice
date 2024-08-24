package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.RepeatSeparator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RepeatSeparator_Test {
    RepeatSeparator repeatSeparator = new RepeatSeparator();

    @DataProvider(name = "repeat_separator")
    public Object[][] dpRepeatSeparator(){
        return new Object[][]{
                {"Word", "X", 3, "WordXWordXWord"},
                {"AAA", "", 1, "AAA"},
                {"A", "B", 5, "ABABABABA"},
                {"abc", "XX", 3, "abcXXabcXXabc"}
        };
    }

    @Test(description = "Verify repeat separator function", dataProvider = "repeat_separator")
    public void repeatSeparatorTest(String a, String b, int index, String expected){
        Assert.assertEquals(repeatSeparator.repeatSeparator(a, b, index), expected);
    }
}
