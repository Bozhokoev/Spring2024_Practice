package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.XyBalance;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XyBalance_Test {
    XyBalance xyBalance = new XyBalance();

    @DataProvider(name = "xy_balance")
    public Object[][] dpXyBalance(){
        return new Object[][]{
                {"aaxbby", true},
                {"xaxxbbyx", false},
                {"bxyb", true},
                {"yxyxyxyx", false}
        };
    }

    @Test(description = "Verify xy balance function", dataProvider = "xy_balance")
    public void xyBalanceTest(String str, boolean expected){
        Assert.assertEquals(xyBalance.xyBalance(str), expected);
    }
}
