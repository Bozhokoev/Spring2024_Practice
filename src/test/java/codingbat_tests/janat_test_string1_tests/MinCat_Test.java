package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.MinCat;
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
                {"java", "Hello", "javaello"},
                {"abc", "x", "cx"},
                {"x", "abc", "xc"},
        };
    }
    @Test(description = "Verify Min_Cat Function", dataProvider = "min_cat")
    public void minCatTest(String str, String str1, String exp){
        Assert.assertEquals(minCat.minCat(str, str1), exp);
    }
}
