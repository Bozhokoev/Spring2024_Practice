package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.DeFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeFront_test {

    DeFront deFront = new DeFront();

    @DataProvider(name = "deFront")
    public Object[][] dpDeFront(){
        return new Object[][]{
                {"Hello", "llo"},
                {"java", "va"},
                {"away", "aay"},
                {"axy", "ay"},
                {"abc", "abc"},
                {"xby", "by"},
                {"ab", "ab"},
                {"ax", "a"},
                {"aaa", "aa"},
                {"xbc", "bc"},
                {"bazz", "zz"},
                {"ba", ""},
                {"hi", ""},
                {"his", "s"},
                {"zzz", "z"}
        };
    }

    @Test(description = "Verify DeFront Functional", dataProvider = "deFront")
    public void deFront_test(String str, String res){
        Assert.assertEquals(deFront.deFront(str), res);
    }
}
