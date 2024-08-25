package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.ExtraFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFront_test {

    ExtraFront extraFront = new ExtraFront();

    @DataProvider(name = "extraFront")
    public Object[][] dpExtraFront(){
        return new Object[][]{
                {"Hello", "HeHeHe"},
                {"ab", "ababab"},
                {"H", "HHH"},
                {"", ""},
                {"Candy", "CaCaCa"},
                {"Code", "CoCoCo"}
        };
    }

    @Test(description = "Verify ExtraFront Functional", dataProvider = "extraFront")
    public void extraFront_test(String str, String res){
        Assert.assertEquals(extraFront.extraFront(str), res);
    }
}
