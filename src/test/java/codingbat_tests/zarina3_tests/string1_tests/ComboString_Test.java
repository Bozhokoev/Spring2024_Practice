package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboString_Test {

    ComboString comboString = new ComboString();

    @DataProvider(name = "ComboString")
    public Object[][] dpComboString(){
        return new Object[][]{
                {"Hello","hi","hiHellohi"},
                {"","bb","bb"},
                {"aaa","1234","aaa1234aaa"}
        };
    }
@Test(description = "Verify ComboString Test",dataProvider = "ComboString")
    public void comboStringTest(String str, String str2, String res){
    Assert.assertEquals(comboString.comboString(str,str2),res);

}
}
