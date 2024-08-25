package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.Has271;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Has271_Test {

    Has271 has271 = new Has271();

    @DataProvider(name = "Has271")
    public Object[][] dpHas271(){
        return new Object[][]{
                {new int[]{1,2,7,1},true},
                {new int[]{2,7,5,10,4},true},
                {new int[]{2,7,-2},false},
                {new int[]{},false},
        };
    }
    @Test(description = "Verify Has271 Function", dataProvider = "Has271")
    public void has271Test(int nums[],boolean res){
        Assert.assertEquals(has271.has271(nums),res);
    }
}
