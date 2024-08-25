package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.AtFirst;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirst_Test {

    AtFirst atFirst = new AtFirst();
    @DataProvider(name = "AtFirst")
    public Object [][] dpAtFirst(){
        return new Object[][]{
                {"Hello", "He"},
                {"Hi", "Hi"},
                {"H", "H@"},
                {"", "@@"}
        };
    }
    @Test(description = "Verify AtFirst Test", dataProvider = "AtFirst")
    public void atFirstTest(String str, String  res){
        Assert.assertEquals(atFirst.atFirst(str),res);
    }
}
