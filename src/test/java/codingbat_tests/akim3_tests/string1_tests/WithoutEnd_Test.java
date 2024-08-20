package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEnd_Test {
    WithoutEnd withoutEnd = new WithoutEnd();

    @DataProvider(name = "without_end")
    public Object[][]dpWithoutEnd(){
        return new Object[][]{
                {"Hello", "ell"},
                {"Hello", "ell"},
                {"Hello", "ell"},
                {"Hello", "ell"},
                {"Hello", "ell"},
        };
    }

    @Test(description = "Verify withoutEnd function", dataProvider = "without_end")
    public void withoutEndTest(String str, String expected){
        Assert.assertEquals(withoutEnd.withoutEnd(str), expected);
    }
}
