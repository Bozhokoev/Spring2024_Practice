package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.XyzMiddle;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class XyzMiddle_Test {
    XyzMiddle xyzMiddle = new XyzMiddle();

    @DataProvider(name = "xyz_middle")
    public Object[][] dpXyzMiddle(){
        return new Object[][]{
                {"AAxyzBB", true},
                {"AAAAAxyzBBB", false},
                {"xyzxyzxyzBxyzxyz", true}
        };
    }

    @Test(description = "Verify xyz middle function", dataProvider = "xyz_middle")
    public void xyzMiddleTest(String str, boolean expected){
        Assert.assertEquals(xyzMiddle.xyzMiddle(str), expected);
    }
}
