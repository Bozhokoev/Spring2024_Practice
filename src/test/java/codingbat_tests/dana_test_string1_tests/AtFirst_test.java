package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.AtFirst;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirst_test {

    AtFirst atFirst = new AtFirst();

    @DataProvider(name = "atFirst")
    public Object[][] dpAtFirst(){
        return new Object[][]{
                {"hello", "he"},
                {"hi", "hi"},
                {"h", "h@"},
                {"", "@@"},
                {"kitten", "ki"	},
                {"java", "ja"},
                {"j", "j@"},
        };
    }

    @Test(description = "Verify AtFirst Functional", dataProvider = "atFirst")
    public void atFirst_test(String str, String res){
        Assert.assertEquals(atFirst.atFirst(str), res);
    }
}
