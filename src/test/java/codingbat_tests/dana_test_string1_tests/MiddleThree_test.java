package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleThree_test {

    MiddleThree middleThree = new MiddleThree();

    @DataProvider(name = "middleThree")
    public Object[][] dpMiddleThree(){
        return new Object[][]{
                {"Candy", "and"},
                {"and", "and"},
                {"solving", "lvi"},
                {"Hi yet Hi", "yet"},
                {"java yet java", "yet"},
                {"Chocolate", "col"},
                {"XabcxyzabcX", "xyz"}
        };
    }

    @Test(description = "Verify MiddleThree Functional", dataProvider = "middleThree")
    public void middleThree_test(String str, String res){
        Assert.assertEquals(middleThree.middleThree(str), res);
    }
}
