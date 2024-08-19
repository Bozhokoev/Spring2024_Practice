package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.StringTimes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringTimes_Test {
    StringTimes stringTimes = new StringTimes();

    @DataProvider (name = "StringTimes")
    public Object [][] dpSpringTimes(){
        return new Object[][]{
                {"Hi",2, "HiHi"},
                {"Hi",1, "Hi"},
                {"x",4, "xxxx"},
                {"Hi",0, ""},
        };
    }

    @Test (description = "Verify StringTimes function", dataProvider = "StringTimes")
    public void stringTimesTest(String hi, int n, String res){
        Assert.assertEquals(stringTimes.stringTimes(hi,n),res);
    }
}
