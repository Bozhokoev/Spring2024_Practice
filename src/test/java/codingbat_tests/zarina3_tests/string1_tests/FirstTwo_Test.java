package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwo_Test {

    FirstTwo firstTwo = new FirstTwo();

    @DataProvider(name = "FirstTwo")
    public Object[][] dpFirstTwo(){
        return new Object[][]{
                {"Hello", "He",},
                {"a", "a",},
                {"hi", "hi",}
        };
    }
    @Test(description = "Verify FirstTwo Test",dataProvider = "FirstTwo")
    public void firstTwoTest(String str, String res){
        Assert.assertEquals(firstTwo.firstTwo(str),res);
    }
}
