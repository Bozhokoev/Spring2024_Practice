package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.ExtraFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFront_Test {
    ExtraFront extraFront = new ExtraFront();

    @DataProvider(name = "extra_front")
    public Object[][] dpExtraFront(){
        return new Object[][]{
                {"Hello", "HeHeHe"},
                {"ab", "ababab"},
                {"H", "HHH"},
                {"", ""},
                {"Candy", "CaCaCa"},
        };
    }

    @Test(description = "Verify Extra_Front Function", dataProvider = "extra_front")
    public void extraFrontTest(String str, String exp){
        Assert.assertEquals(extraFront.extraFront(str), exp);
    }

}
