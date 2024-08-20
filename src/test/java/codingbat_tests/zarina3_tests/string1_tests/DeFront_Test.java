package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.DeFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeFront_Test {

    DeFront deFront = new DeFront();
    @DataProvider(name = "DeFront")
    public Object[][] dpDeFront(){
        return new Object[][]{
                {"Hello","llo"},
                {"ba",""},
                {"his","s"},
                {"abcdef","abcdef"}

        };
    }
    @Test(description = "Verify DEFront Test", dataProvider = "DeFront")
    public void deFrontTest(String str, String res){
        Assert.assertEquals(deFront.deFront(str),res);
    }
}
