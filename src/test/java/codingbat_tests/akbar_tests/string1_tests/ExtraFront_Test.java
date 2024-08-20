package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.ExtraFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFront_Test {
    ExtraFront extraFront = new ExtraFront();

    @DataProvider(name = "extraFront")
    public Object[][] dpExtraFront(){
        return new Object[][]{
                {"Hello","HeHeHe"},
                {"H","HHH"},
                {"Candy","CaCaCa"},
                {"",""},
        };
    }

    @Test(description = "Verify ExtraFront function",dataProvider = "extraFront")
    public void extraFrontTest(String str,String exp){
        Assert.assertEquals(extraFront.extraFront(str),exp);
    }
}
