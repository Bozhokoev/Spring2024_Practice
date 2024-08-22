package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleThree_Test {
    MiddleThree middleThree = new MiddleThree();

    @DataProvider(name = "middle_three")
    public Object[][] dpMiddleThree(){
        return new Object[][]{
                {"Candy", "and"},
                {"and", "and"},
                {"solving", "lvi"},
                {"Hi yet Hi", "yet"},
                {"java yet java", "yet"},
        };
    }
    @Test(description = "Verify Middle_Three Function", dataProvider = "middle_three")
    public void middleThreeTest(String str, String exp){
        Assert.assertEquals(middleThree.middleThree(str), exp);
    }
}
