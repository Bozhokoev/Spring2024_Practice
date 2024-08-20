package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.MinCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinCat_Test {
    MinCat minCat  = new MinCat();

    @DataProvider(name = "minCat")
    public Object[][] dpMinCat(){
        return new Object[][]{
                {"Hello", "Hi","loHi"},
                {"abc", "", ""},
                {"abc", "x","cx"},
                {"java", "Hello","javaello"},
        };
    }

    @Test(description = "Verify MinCat function",dataProvider = "minCat")
    public void minCatTest(String a, String b, String exp){
        Assert.assertEquals(minCat.minCat(a,b),exp);
    }

}
