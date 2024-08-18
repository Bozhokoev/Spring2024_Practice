package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.Front22;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front22_Test {
    Front22 front22 = new Front22();

    @DataProvider(name = "front22")
    public Object[][] dpFront22() {
        return new Object[][]{
                {"kitten", "kikittenki"},
                {"Ha", "HaHaHa"},
                {"abc", "ababcab"},
                {"", ""},
                {"a", "aaa"}
        };
    }

    @Test(description = "Verify Front22 function", dataProvider = "front22")
    public void front22Test(String s, String exp) {
        Assert.assertEquals(front22.front22(s), exp);
    }


}