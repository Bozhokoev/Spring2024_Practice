package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.DeFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeFront_Test {
    DeFront deFront = new DeFront();

    @DataProvider(name = "deFront")
    public Object[][] dpDeFront(){
        return new Object[][]{
                {"Hello","llo"},
                {"xby", "by"},
                {"ax","a"},
                {"xbc", "bc"},
        };
    }

    @Test(description = "Verify DeFront function", dataProvider = "deFront")
    public void deFrontTest(String str, String exp){
        Assert.assertEquals(deFront.deFront(str),exp);
    }
}
