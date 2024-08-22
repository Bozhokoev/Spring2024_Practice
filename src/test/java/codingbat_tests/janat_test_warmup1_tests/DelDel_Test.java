package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.DelDel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DelDel_Test {
    DelDel delDel= new DelDel();

    @DataProvider(name = "del_del")
    public Object[][] dpDelDel(){
        return new Object[][]{
                {"adelbc", "abc"},
                {"adelHello", "aHello"},
                {"adedbc", "adedbc"},
                {"abcdel", "abcdel"},
                {"add", "add"},
        };
    }

    @Test(description = "Verify Del_Del Function", dataProvider = "del_del")
    public void delDelTest(String str, String exp){
        Assert.assertEquals(delDel.delDel(str), exp);
    }
}
