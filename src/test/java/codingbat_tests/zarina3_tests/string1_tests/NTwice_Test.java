package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.NTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NTwice_Test {

    NTwice nTwice = new NTwice();

    @DataProvider(name = "NTwice")
    public Object[][] dpNTwice(){
        return new Object[][]{
                {"Hello", 2, "Helo"},
                {"Chocolate", 3, "Choate"},
                {"Hello", 4, "Hellello"},
                {"Code", 2, "Code"}
        };
    }
    @Test(description = "Verify NTwice Test",dataProvider = "NTwice")
    public void nTwiceTest(String str, int n, String res){
        Assert.assertEquals(nTwice.nTwice(str,n),res);
    }
}
