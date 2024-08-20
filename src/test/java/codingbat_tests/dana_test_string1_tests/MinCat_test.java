package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.MinCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinCat_test {

    MinCat minCat = new MinCat();

    @DataProvider(name = "minCat")
    public Object[][] dpMinCat(){
        return new Object[][]{
                {"Hello", "Hi", "loHi"},
                {"Hello", "java", "ellojava"},
                {"java", "Hello", "javaello"	},
                {"abc", "x", "cx"},
                {"x", "abc", "xc"},
                {"abc", "", ""}
        };
    }

    @Test(description = "Verify MinCat Functional", dataProvider = "minCat")
    public void minCat_test(String str1, String str2, String res){
        Assert.assertEquals(minCat.minCat(str1, str2), res);
    }
}
