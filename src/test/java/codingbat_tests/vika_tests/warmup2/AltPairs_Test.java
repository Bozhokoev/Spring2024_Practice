package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.AltPairs;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AltPairs_Test {
    AltPairs altPairs = new AltPairs();

    @DataProvider(name = "alt_pairs")
    public Object[][] dpAltPairs() {
        return new Object[][] {
                {"kitten", "kien"},
                {"Chocolate", "Chole"},
                {"yak", "ya"},
                {"y", "y"},
                {"", ""}
        };
    }

    @Test(description = "Verify Alt PairsFunction", dataProvider = "alt_pairs")
    public void altPairsTest (String str, String exp) {
        Assert.assertEquals(altPairs.altPairs(str), exp);
    }
}

