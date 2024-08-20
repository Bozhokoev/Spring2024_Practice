package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.NTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NTwice_Test {
    NTwice nTwice = new NTwice();

    @DataProvider(name = "n_twice")
    public Object[][] dpNTwice(){
        return new Object[][]{
                {"Hello", 2, "Helo"},
                {"Chocolate", 3, "Choate"},
                {"Chocolate", 1, "Ce"},
                {"Code", 4, "CodeCode"}
        };
    }

    @Test(description = "Verify nTwice function", dataProvider = "n_twice")
    public void nTwiceTest(String str, int num, String expected){
        Assert.assertEquals(nTwice.nTwice(str, num), expected);
    }
}
