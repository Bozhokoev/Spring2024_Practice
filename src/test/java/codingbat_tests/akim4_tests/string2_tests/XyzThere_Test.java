package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.XyzThere;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XyzThere_Test {
    XyzThere xyzThere = new XyzThere();

    @DataProvider(name = "xyz_there")
    public Object[][] dpXyzThere(){
        return new Object[][]{
                {"abcxyz", true},
                {"abc.xyzxyz", true},
                {"xy", false},
                {"12.xyz", false},
                {"12xyz", true}
        };
    }

    @Test(description = "Verify xyzThere function", dataProvider = "xyz_there")
    public void xyzThereTest(String str, boolean expected){
        Assert.assertEquals(xyzThere.xyzThere(str), expected);
    }
}
