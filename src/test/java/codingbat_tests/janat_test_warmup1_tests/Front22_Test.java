package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.Front22;
import codingbat.janat.warmup1.Front3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front22_Test {

    Front22 front22 = new Front22();

    @DataProvider(name = "front_22")
    public Object[][] dpFront22(){
        return new Object[][]{
                {"kitten", "kikittenki"},
                {"Ha", "HaHaHa"},
                {"abc", "ababcab"},
                {"ab", "ababab"},
                {"a", "aaa"},
        };
    }

    @Test(description = "Verify Front22 Function", dataProvider = "front_22")
    public void front22Test(String str, String exp){
        Assert.assertEquals(front22.front22(str), exp);
    }
}
