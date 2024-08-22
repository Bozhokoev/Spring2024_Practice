package codingbat_tests.zarina1_tests.warmup1_tests;
import codingbat.zarina1.warmup1.In3050;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In3050_Test {

    In3050 in3050 = new In3050();

    @DataProvider(name = "in3050")
    public Object[][] dpIn3050(){
        return new Object[][]{
                {30, 31, true},
                {30, 41, false},
                {40, 50, true},
                {40, 51, false},
                {39, 50, false},
                {50, 39, false	},
                {40, 39, true},
                {49, 48, true},
                {50, 40, true},
                {50, 51, false},
                {35, 36, true},
                {35, 45, false}
        };
    }

    @Test(description = "Verify in3050 Function", dataProvider = "in3050")
    public void in3050_test(int a, int b, boolean res){
       Assert.assertEquals(in3050.in3050(a,b),res);
    }
}
