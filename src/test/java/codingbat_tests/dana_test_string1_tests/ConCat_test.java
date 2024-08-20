package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.ConCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCat_test {

    ConCat conCat = new ConCat();

    @DataProvider(name = "conCat")
    public Object[][] dpConCat(){
        return new Object[][]{
                {"abc", "cat", "abcat"},
                {"dog", "cat", "dogcat"},
                {"abc", "", "abc"},
                {"", "cat", "cat"},
                {"pig", "g", "pig"},
                {"pig", "doggy", "pigdoggy"}
        };
    }

    @Test(description = "Verify ConCat Functional", dataProvider = "conCat")
    public void conCat_test(String str1, String str2, String res){
        Assert.assertEquals(conCat.conCat(str1, str2), res);
    }
}
