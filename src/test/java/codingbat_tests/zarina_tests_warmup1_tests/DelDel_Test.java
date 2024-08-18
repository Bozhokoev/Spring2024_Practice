package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.DelDel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DelDel_Test {
    DelDel delDel = new DelDel();

    @DataProvider (name = "DelDel")
    public Object[][] dpDelDel(){
        return new Object[][]{
                {"abcdel","abcdel"},
                {"a","a"},
                {"del","del"},
        };
    }

    @Test (description = "Verify Del Del Test",dataProvider = "DelDel")
    public void delDelTest(String str,String exp){
        Assert.assertEquals(delDel.delDel(str),str);
    }
}
