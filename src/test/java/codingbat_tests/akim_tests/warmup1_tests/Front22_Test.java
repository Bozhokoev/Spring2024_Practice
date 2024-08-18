package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.Front22;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front22_Test {
    Front22 front22 = new Front22();

    @DataProvider(name = "Front_22")
    public Object[][] dpFront22(){
        return new Object[][]{
                {"kitten", "kikittenki"},
                {"Ha", "HaHaHa"},
                {"abc", "ababcab"},
                {"a", "aaa"},
                {"", ""},
                {"Logic", "LoLogicLo"}
        };
    }

    @Test(description = "Verify front22 function", dataProvider = "Front_22")
    public void front22Test(String str, String expected){
        Assert.assertEquals(front22.front22(str), expected);
    }
}
