package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.MinCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinCat_Test {
    MinCat minCat = new MinCat();

    @DataProvider(name = "min_cat")
    public Object[][] dpMinCat(){
        return new Object[][]{
                {"Hello", "Hi", "loHi"},
                {"Hello", "java", "ellojava"},
                {"abc", "x", "cx"},
                {"abc", "", ""}
        };
    }

    @Test(description = "Verify minCat function", dataProvider = "min_cat")
    public void minCatTest(String a, String b, String expected){
        Assert.assertEquals(minCat.minCat(a, b), expected);
    }
}
