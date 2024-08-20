package codingbat_tests.zarina3_tests.string1_tests;
import codingbat.zarina3.string1.MiddleTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleTwo_Test {

    MiddleTwo middleTwo = new MiddleTwo();
    @DataProvider(name = "MiddleTwo")
    public Object[][] dpMiddleTwo(){
        return new Object[][]{
                {"string","ri"},
                {"ab","ab"},
                {"0123456789", "45"}
        };
    }
    @Test(description = "Verify MiddleTwo Test",dataProvider = "MiddleTwo")
    public void middleTwoTest(String str1, String res){
        Assert.assertEquals(middleTwo.middleTwo(str1),res);
    }
}
