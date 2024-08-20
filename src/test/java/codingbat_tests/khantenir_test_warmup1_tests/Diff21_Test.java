package codingbat_tests.khantenir_test_warmup1_tests;

import codingbat.khantenir.warmup1.Diff21;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Diff21_Test {
    Diff21 diff21 = new Diff21();
    @DataProvider(name = "Diff21Test")
    public Object [][] testDiff21(){
        return new Object[][]{
                {19, 2},
                {10, 11},
                {21, 0}
        };
    }
    @Test(dataProvider = "Diff21Test")
    public void Diff21data(int n, int res){
        int action = diff21.diff21(n);
        assertEquals(action, res);
    }

}
