package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleThree_Test {

    MiddleThree middleThree = new MiddleThree();

    @DataProvider(name = "MiddleThree")
    public Object[][] dpMiddleThree(){
        return new Object[][]{
                {"Candy", "and"},
                {"Hi Yet Hi", "Yet"},
                {"XabcxyzabcX", "xyz"}
        };
    }
    @Test(description = "Verify MiddleThree Test",dataProvider = "MiddleThree")
    public void middleThreeTest(String str, String res){
        Assert.assertEquals(middleThree.middleThree(str),res);
    }
}
