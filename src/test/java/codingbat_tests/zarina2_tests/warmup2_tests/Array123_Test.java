package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.Array123;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array123_Test {

    Array123 array123 = new Array123();

    @DataProvider (name = "Array123")
    public Object [][] dpArray123(){
        return new Object[][]{
                {new int[]{1, 1, 2, 3, 1},true},
                {new int[]{1, 1, 2, 4, 1},false},
                {new int[]{1, 2, 3},true},
                {new int[]{},false},
        };
    }
    @Test(description = "Verify Array123 Function", dataProvider = "Array123")
    public void array123Test(int nums [],boolean res){
        Assert.assertEquals(array123.array123(nums),res);
    }
}
