package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.Diff21;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Diff21_Test {
    Diff21 diff21 = new Diff21();

    @DataProvider(name = "Diff21")
    public Object[][] differ21(){
        return new Object[][]{
                {19,2}, {10,11}, {21,0}, {22,2}, {25,8}, {30,18},
                {0,21}, {1,20}, {2,19}, {-1,22},
        };
    }

    @Test(description = "Verify the Diff21",dataProvider = "Diff21")
    public void DiffTest(int a, int res){
        Assert.assertEquals(diff21.diff21(a),res);
    }
}
