package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.Last2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Last2_Test {
    Last2 last2 = new Last2();

    @DataProvider(name = "last_2")
    public Object[][] dpLast2(){
        return new Object[][]{
                {"hixxhi", 1},
                {"xaxxaxaxx", 1},
                {"axxxaaxx", 2},
                {"xxaxxaxxaxx", 3},
                {"xaxaxaxx", 0},

        };
    }
    @Test(description = "Verify Last2 Function", dataProvider = "last_2")
    public void last2Test(String str, int n){
        Assert.assertEquals(last2.last2(str), n);
    }
}
