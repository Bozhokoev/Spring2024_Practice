package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.AtFirst;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirst_Test {
    AtFirst atFirst = new AtFirst();

    @DataProvider(name = "atFirst")
    public Object[][] dpAtFirst(){
        return new Object[][]{
                {"hello","he"},
                {"","@@"},
                {"j","j@"},
                {"kitten", "ki"},
        };
    }

    @Test(description = "Verify AtFirst function",dataProvider ="atFirst")
    public void atFirstTest(String str,String exp){
        Assert.assertEquals(atFirst.atFirst(str),exp);
    }
}
