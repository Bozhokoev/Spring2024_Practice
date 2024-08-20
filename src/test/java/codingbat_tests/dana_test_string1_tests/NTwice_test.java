package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.NTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NTwice_test {

    NTwice nTwice = new NTwice();

    @DataProvider(name = "nTwice")
    public Object[][] dpNTwice(){
        return new Object[][]{
                {"Hello", 2, "Helo"},
                {"Chocolate", 3, "Choate"},
                {"Chocolate", 1, "Ce"},
                {"Chocolate", 0, ""},
                {"Hello", 4, "Hellello"},
                {"Code", 4, "CodeCode"},
                {"Code", 2, "Code"}
        };
    }

    @Test(description = "Verify NTwice Functional", dataProvider = "nTwice")
    public void nTwice_test(String str, int n, String res){
        Assert.assertEquals(nTwice.nTwice(str, n), res);
    }
}
