package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.Last2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Last2_Test {

    Last2 last2 = new Last2();

    @DataProvider(name = "Last2")
    public Object [][] dpLast2(){
        return new Object[][]{
                {"hixxhi", 1},
                {"xaxaxaxx", 0},
                {"", 0},
        };
    }

    @Test(description = "Verify Last2 Function", dataProvider = "Last2")
    public void last2Test(String str, int x){
        Assert.assertEquals(last2.last2(str),x);
    }
}
