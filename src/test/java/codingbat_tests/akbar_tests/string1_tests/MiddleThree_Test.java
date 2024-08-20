package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleThree_Test {
    MiddleThree middleThree = new MiddleThree();

    @DataProvider(name = "middleThree")
    public Object[][] dpMiddleThree(){
        return new Object[][]{
                {"Candy","and"},
                {"Chocolate","col"},
                {"Hi yet Hi","yet"},
                {"solving","lvi"},
        };
    }

    @Test(description = "Verify middleThree function",dataProvider = "middleThree")
    public void middleThreeTest(String s, String exp){
        Assert.assertEquals(middleThree.middleThree(s),exp);
    }
}
