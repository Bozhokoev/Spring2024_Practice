package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.DeFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeFront_Test {
    DeFront deFront = new DeFront();

    @DataProvider(name = "de_front")
    public Object[][] dpDeFrontTest(){
        return new Object[][]{
                {"Hello", "llo"},
                {"java", "va"},
                {"away", "aay"},
                {"axy", "ay"},
                {"abc", "abc"},
        };
    }
    @Test(description = "Verify De_Front Function", dataProvider = "de_front")
    public void deFrontTest(String str, String exp){
        Assert.assertEquals(deFront.deFront(str), exp);
    }
}
