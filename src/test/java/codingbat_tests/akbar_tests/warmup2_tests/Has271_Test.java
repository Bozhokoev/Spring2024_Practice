package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.Has271;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Has271_Test {
    Has271 has271 = new Has271();

    @DataProvider(name = "has271")
    public Object[][] dpHas271(){
        return new Object[][]{
                {new int []{1, 2, 7, 1}, true},
                {new int []{2, 7, -1},true},
                {new int []{2, 7, -2},false},
                {new int []{2, 7, -2, 4, 9, 3}, true},
                {new int []{1, 1, 4, 9, 0}, false},
        };
    }

    @Test(description = "Verify Has271 function", dataProvider = "has271")
    public void has271Test(int [] num, boolean exp){
        Assert.assertEquals(has271.has271(num),exp);
    }
}
