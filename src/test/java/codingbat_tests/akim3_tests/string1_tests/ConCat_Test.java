package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.ConCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCat_Test {
    ConCat conCat = new ConCat();

    @DataProvider(name = "con_cat")
    public Object[][] dpConCat(){
        return new Object[][]{
                {"abc", "cat", "abcat"},
                {"abc", "",  "abc"},
                {"pig", "g", "pig"},
                {"pig", "doggy", "pigdoggy"}
        };
    }

    @Test(description = "Verify concat function", dataProvider = "con_cat")
    public void conCatTest(String a, String b, String expected){
        Assert.assertEquals(conCat.conCat(a, b), expected);
    }
}
