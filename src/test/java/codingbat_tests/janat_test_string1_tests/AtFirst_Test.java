package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.AtFirst;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirst_Test {
    AtFirst atFirst = new AtFirst();

    @DataProvider(name = "at_first")
    public Object[][] dpAtFirst(){
        return new Object[][]{
                {"hello", "he"},
                {"hi", "hi"},
                {"h", "h@"},
                {"", "@@"},
                {"kitten", "ki"},
        };
    }
    @Test(description = "Verify At_First Function", dataProvider = "at_first")
    public void atFirstTest(String str, String exp){
        Assert.assertEquals(atFirst.atFirst(str), exp);
    }
}
