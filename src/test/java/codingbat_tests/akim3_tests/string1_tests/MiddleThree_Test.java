package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleThree_Test {
    MiddleThree middleThree = new MiddleThree();

    @DataProvider(name = "middle_three")
    public Object[][] dpMiddleThree(){
        return new Object[][]{
                {"Candy", "and"},
                {"java yet java", "yet"},
                {"Chocolate", "col"},
                {"XabcxyzabcX", "xyz"}
        };
    }

    @Test(description = "Verify middleThree function", dataProvider = "middle_three")
    public void middleThreeTest(String str, String expected){
        Assert.assertEquals(middleThree.middleThree(str), expected);
    }
}
