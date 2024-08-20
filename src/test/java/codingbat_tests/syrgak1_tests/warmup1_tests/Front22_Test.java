package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.Front22;
import codingbat.syrgak1.warmup1.Front3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front22_Test {
    Front22 front22_t = new Front22();

    @DataProvider(name = "Front22")
    public Object[][] dpFront22(){
        return new Object[][]{
                {"kitten", "kikittenki"},
                {"Ha", "HaHaHa"},
                {"abc", "ababcab"}
        };
    }

    @Test(description = "Verify Front22 Function", dataProvider = "Front22")
    public void front22Test(String str, String exp){
        Assert.assertEquals(front22_t.front22(str), exp);
    }
}
