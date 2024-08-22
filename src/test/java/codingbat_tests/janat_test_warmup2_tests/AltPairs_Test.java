package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.AltPairs;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AltPairs_Test{
    AltPairs altPairs = new AltPairs();

    @DataProvider(name = "alt_pairs")
    public Object[][] dpAltPairs(){
        return new Object[][]{
                {"kitten", "kien"},
                {"Chocolate", "Chole"},
                {"CodingHorror", "Congrr"},
                {"yak", "ya"},
                {"ya", "ya"},
        };
    }

    @Test(description = "Verify Alt_Pairs Function", dataProvider = "alt_pairs")
    public void altPairsTest(String str, String exp){
        Assert.assertEquals(altPairs.altPairs(str), exp);
    }
}
