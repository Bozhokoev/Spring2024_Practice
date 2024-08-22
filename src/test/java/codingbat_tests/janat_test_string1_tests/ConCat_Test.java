package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.ConCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCat_Test {
    ConCat conCat = new ConCat();

    @DataProvider(name = "con_cat")
    public Object[][] dpConCat(){
        return new Object[][]{
                {"abc", "cat", "abcat"},
                {"dog", "cat", "dogcat"},
                {"abc", "", "abc"},
                {"", "cat", "cat"},
                {"pig", "g", "pig"},
        };
    }
    @Test(description = "Verify Con_Cat Function", dataProvider = "con_cat")
    public void conCatTest(String str, String str1, String exp){
        Assert.assertEquals(conCat.conCat(str, str1), exp);
    }
}
