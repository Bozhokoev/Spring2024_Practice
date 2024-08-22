package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.ConCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCat_Test {

    ConCat conCat = new ConCat();
    @DataProvider(name = "ConCat")
    public Object[][] dpConCat(){
        return new Object[][]{
                {"abc","cat","abcat"},
                {"abc","","abc"},
                {"","cat","cat"},
                {"pig","g","pig"}
        };
    }
    @Test(description = "Verify ConCat Test", dataProvider = "ConCat")
    public void conCatTest(String str1, String str2, String res){
        Assert.assertEquals(conCat.conCat(str1,str2),res);
    }
}
