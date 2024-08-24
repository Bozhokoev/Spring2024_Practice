package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.BobThere;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BobThere_Test {
    BobThere bobThere = new BobThere();

    @DataProvider(name = "bob_there")
    public Object [][] dpBobThere(){
        return new Object[][]{
                {"abcbob", true},
                {"123abcbcdbabxyz", true},
                {"bbc", false},
                {"abcdefb", false}
        };
    }

    @Test(description = "Verify bobThere function", dataProvider = "bob_there")
    public void bobThereTest(String str, boolean expected){
        Assert.assertEquals(bobThere.bobThere(str), expected);
    }
}
