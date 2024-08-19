package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.AltPairs;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AltPairs_Test {
    AltPairs altPairs = new AltPairs();

    @DataProvider(name = "altPairs")
    public Object[][] dpAltPairs() {
        return new Object[][]{
                {"kitten", "kien"},
                {"y", "y"},
                {"", ""},
                {"ThisThatTheOther", "ThThThth"},
        };
    }

    @Test(description = "Verify AltPairs function",dataProvider = "altPairs")
    public void altPairsTest(String str, String exp){
        Assert.assertEquals(altPairs.altPairs(str),exp);
    }
}
