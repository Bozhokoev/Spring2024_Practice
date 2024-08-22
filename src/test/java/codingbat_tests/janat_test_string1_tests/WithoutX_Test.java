package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.WithoutX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX_Test {
    WithoutX withoutX = new WithoutX();

    @DataProvider(name = "without_x")
    public Object[][] dpWithoutX(){
        return new Object[][]{
                {"xHix", "Hi"},
                {"xHi", "Hi"},
                {"Hxix", "Hxi"},
                {"Hi", "Hi"},
                {"xxHi", "xHi"},
        };
    }
    @Test(description = "Verify Without_X Function", dataProvider = "without_x")
    public void withoutXTest(String str, String exp){
        Assert.assertEquals(withoutX.withoutX(str), exp);
    }

}
