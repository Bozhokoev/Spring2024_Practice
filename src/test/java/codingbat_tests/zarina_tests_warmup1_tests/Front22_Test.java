package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.Front22;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front22_Test {

    Front22 front22 = new Front22();

    @DataProvider (name = "Front22")
    public Object [][] dpFront22 (){
        return new Object[][]{
                {"kitten","kikittenki"},
                {"abc","ababcab"},
                {"",""},
                {"Logic","LoLogicLo"},
        };
    }

    @Test (description = "Verify Front22 tes", dataProvider = "Front22")
    public void front22Test (String str, String exp){
        Assert.assertEquals(front22.front22(str),exp);
    }
}
