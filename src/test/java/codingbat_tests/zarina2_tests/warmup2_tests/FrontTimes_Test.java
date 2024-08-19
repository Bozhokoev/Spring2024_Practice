package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.FrontTimes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontTimes_Test {
    FrontTimes frontTimes = new FrontTimes();

    @DataProvider (name = "FrontTimes")
    public Object [][] dpFrontTimes(){
        return new Object[][]{
                {"Chocolate", 2,"ChoCho"},
                {"Abc", 3,"AbcAbcAbc"},
                {"", 4,""},
                {"Abc", 0,""},
        };
    }

    @Test (description = "Verify FrontTimes function", dataProvider = "FrontTimes")
    public void frontTimesTest(String str, int n, String res){
        Assert.assertEquals(frontTimes.frontTimes(str,n),res);
    }

}
