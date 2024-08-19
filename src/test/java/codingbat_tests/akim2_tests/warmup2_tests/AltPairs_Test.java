package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.AltPairs;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AltPairs_Test {
    AltPairs altPairs = new AltPairs();

    @DataProvider(name = "alt_pairs")
    public Object[][] dpAltPairs(){
        return new Object[][]{
                {"kitten", "kien"},
                {"CodingHorror", "Congrr"},
                {"yak", "ya"},
                {"ThisThatTheOther", "ThThThth"},
                {"", ""}
        };
    }

    @Test(description = "Verify altPairs function", dataProvider = "alt_pairs")
    public void altPairsTest(String str, String expected){
        Assert.assertEquals(altPairs.altPairs(str), expected);
    }
}
