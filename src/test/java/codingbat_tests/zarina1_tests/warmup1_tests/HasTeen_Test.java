package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.HasTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasTeen_Test {

    HasTeen hasTeen = new HasTeen();

    @DataProvider(name = "hasTeen")
    public Object[][] dpHasTeen() {
        return new Object[][]{
                {13, 20, 10, true},
                {20, 19, 10, true},
                {20, 10, 13, true},
                {1, 20, 12, false},
                {19, 20, 12, true}
        };
    }

    @Test(description = "Verify Has Teen Functional", dataProvider = "hasTeen")
    public void hasTeen_test(int a, int b, int c, boolean res) {
        Assert.assertEquals(hasTeen.hasTeen(a, b, c), res);
    }
}
