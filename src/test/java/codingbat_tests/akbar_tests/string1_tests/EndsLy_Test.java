package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.EndsLy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLy_Test {
    EndsLy endsLy = new EndsLy();

    @DataProvider(name = "endsLy")
    public Object[][] dpEndsLy(){
        return new Object[][]{
                {"oddly",true},
                {"",false},
                {"falsey",false},
                {"evenly",true},
        };
    }

    @Test(description = "Verify EndsLy function",dataProvider = "endsLy")
    public void endsLyTest(String str, boolean exp){
        Assert.assertEquals(endsLy.endsLy(str),exp);
    }
}
