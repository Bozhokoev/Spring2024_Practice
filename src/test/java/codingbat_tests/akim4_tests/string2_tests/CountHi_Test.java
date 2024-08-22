package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.CountHi;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountHi_Test {
    CountHi countHi = new CountHi();

    @DataProvider(name = "count_hi")
    public Object[][] dpCountHi(){
        return new Object[][]{
                {"abc hi ho", 1},
                {"ABChi hi", 2},
                {"Hi is no HI on ahI", 0},
                {"hi", 1}
        };
    }

    @Test(description = "Verify countHi function", dataProvider = "count_hi")
    public void countHiTest(String str, int expected){
        Assert.assertEquals(countHi.countHi(str), expected);
    }
}
