package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.NTwice;
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
                {"Chocolate", 0, ""},
                {"Hello", 4, "Hellello"},
        };
    }

    @Test(description = "Verify N_Twice Function", dataProvider = "n_twice")
    public void nTwiceTest(String str, int n, String exp){
        Assert.assertEquals(nTwice.nTwice(str, n), exp);
    }
}
