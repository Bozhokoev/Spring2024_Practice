package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.Front22;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front22_test {

    Front22 front22 = new Front22();

    @DataProvider(name = "front22")
    public Object[][] dpFront22(){
        return new Object[][]{
                {"kitten", "kikittenki"},
                {"Ha", "HaHaHa"},
                {"abc", "ababcab"},
                {"ab", "ababab"},
                {"a", "aaa"},
                {"", ""},
                {"Logic", "LoLogicLo"},
        };
    }

    @Test(description = "Verify front22 Functional", dataProvider = "front22")
    public void front22_test(String str, String res){
        Assert.assertEquals(front22.front22(str), res);
    }
}
