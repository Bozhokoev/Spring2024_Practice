package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.NTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NTwice_Test {
    NTwice nTwice = new NTwice();

    @DataProvider(name = "nTwice")
    public Object[][] dpNTwice(){
        return new Object[][]{
                {"Hello", 2, "Helo"},
                {"Code", 2,"Code"},
                {"Code", 4,"CodeCode"},
                {"Chocolate", 0, ""},
        };
    }

    @Test(description = "Verify NTwice function", dataProvider = "nTwice")
    public void nTwiceTest(String s, int a, String exp){
        Assert.assertEquals(nTwice.nTwice(s,a),exp);
    }
}
