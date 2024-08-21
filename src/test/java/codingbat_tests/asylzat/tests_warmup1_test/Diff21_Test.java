package codingbat_tests.asylzat.tests_warmup1_test;

import codingbat.asylzat.wapmup1.Diff21;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Diff21_Test {
    Diff21 diff21 = new Diff21();

    @DataProvider(name = "diff21Data")
    public  Object[][] diff21Data() {
        return new Object[][]{
                {19,2},
                {10,11},
                {21,0},
                {25,8},
                {30,18}
        };
    }
    @Test(dataProvider = "diff21Data")
    public void testDiff21(int n, int expected) {

        Assert.assertEquals(diff21.diff21(n),expected);
    }
    }

