package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.AltPairs;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AltPairs_Test {

    AltPairs altPairs = new AltPairs();
    @DataProvider (name = "AltPairs")
    public Object[][] dpAltPairs(){
        return new Object[][]{
                {"kitten", "kien"},
                {"yak", "ya"},
                {"y", "y"},
                {"", ""},
        };
    }

    @Test(description = "Verify AltPairs Function", dataProvider = "AltPairs")
    public void altPairsTest(String str, String res){
        Assert.assertEquals(altPairs.altPairs(str),res);
    }
}
