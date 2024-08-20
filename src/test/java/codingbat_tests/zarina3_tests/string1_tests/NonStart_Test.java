package codingbat_tests.zarina3_tests.string1_tests;
import codingbat.zarina3.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStart_Test {

    NonStart nonStart = new NonStart();

    @DataProvider(name = "NonStart")
    public Object[][] dpNonStart(){
        return new Object[][]{
                {"Hello", "There","ellohere"},
                {"ab", "x","b"},
                {"mart", "dart","artart"}
        };
    }
    @Test(description = "Verify NonStart Test",dataProvider = "NonStart")
    public void nonStartTest(String str1,String str2,String res){
        Assert.assertEquals(nonStart.nonStart(str1,str2),res);
    }
}
