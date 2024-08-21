package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.MinCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MonCat_Test {
    MinCat minCat = new MinCat();

    @DataProvider(name = "MinCat")
    public Object[][] dpMinCat(){
        return new Object[][]{
                {"Hello", "Hi","loHi"},
                {"abc", "x","cx"},
                {"abc", "",""}
        };
    }
    @Test(description = "Verify MinCat Test", dataProvider = "MinCat")
    public void minCatatest(String str1, String str2, String res){
        Assert.assertEquals(minCat.minCat(str1,str2),res);
    }
}
