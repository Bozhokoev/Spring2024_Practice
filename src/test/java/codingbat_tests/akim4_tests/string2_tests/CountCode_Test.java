package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.CountCode;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountCode_Test {
    CountCode countCode = new CountCode();

    @DataProvider(name = "count_code")
    public Object[][] dpCountCode(){
        return new Object[][]{
                {"aaacodebbb", 1},
                {"AAcodeBBcoleCCccoreDD", 3},
                {"ode", 0},
                {"code", 1}
        };
    }

    @Test(description = "Verify countCode function", dataProvider = "count_code")
    public void countCodeTest(String str, int expected){
        Assert.assertEquals(countCode.countCode(str), expected);
    }
}
