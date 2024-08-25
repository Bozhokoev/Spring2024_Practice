package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.StringTimes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringTimes_Test {

    StringTimes stringTimes = new StringTimes();

    @DataProvider(name = "string_times")
    public Object[][] dpStringTimes(){
        return new Object[][]{
                {"Hi", 2, "HiHi"},
                {"Hi", 3, "HiHiHi"},
                {"Hi", 1, "Hi"},
                {"Hi", 0, ""},
                {"Hi", 5, "HiHiHiHiHi"},
        };
    }

    @Test(description = "Verify String_Times Function", dataProvider = "string_times")
    public void stringTimesTest(String str, int n, String exp){
        Assert.assertEquals(stringTimes.stringTimes(str, n), exp);
    }

}
