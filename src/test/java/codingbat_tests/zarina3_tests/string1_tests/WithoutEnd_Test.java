package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.WithoutENd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEnd_Test {

    WithoutENd withoutENd = new WithoutENd();

    @DataProvider(name = "WithoutEnd")
    public Object[][] dpWithoutEnd(){
        return new Object[][]{
                {"Hello", "ell"},
                {"ab", ""},
                {"kitten", "itte"},
        };
    }
    @Test(description = "Verify WitoutEnd Test", dataProvider = "WithoutEnd")
    public void withoutEndTest(String str, String res){
        Assert.assertEquals(withoutENd.withoutEnd(str),res);
    }

}
