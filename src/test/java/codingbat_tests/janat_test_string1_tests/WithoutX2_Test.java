package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.Without2;
import codingbat.janat.string1.WithoutX2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX2_Test {
    WithoutX2 withoutX2 = new WithoutX2();

    @DataProvider(name = "without_x_2")
    public Object[][] dpWithoutX2(){
        return new Object[][]{
                {"xHi", "Hi"},
                {"Hxi", "Hi"},
                {"Hi", "Hi"},
                {"xxHi", "Hi"},
                {"Hix", "Hix"},
        };
    }
    @Test(description = "Verify Without_X_2 Function", dataProvider = "without_x_2")
    public void withoutX2Test(String str, String exp){
        Assert.assertEquals(withoutX2.withoutX2(str), exp);
    }
}
