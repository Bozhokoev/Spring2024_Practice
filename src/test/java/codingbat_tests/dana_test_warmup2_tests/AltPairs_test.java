package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.AltPairs;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AltPairs_test {

    AltPairs altPairs = new AltPairs();

    @DataProvider(name = "altPairs")
    public Object[][] dpAltPairs(){
        return new Object[][]{
                {"kitten", "kien"},
                {"Chocolate", "Chole"},
                {"CodingHorror", "Congrr"},
                {"yak", "ya"},
                {"ya", "ya"},
                {"y", "y"},
                {"", ""},
                {"ThisThatTheOther", "ThThThth"}
        };
    }

    @Test(description = "Verify AltPairs Functional", dataProvider = "altPairs")
    public void altPairs_test(String str, String res){
        Assert.assertEquals(altPairs.altPairs(str), res);
    }
}
