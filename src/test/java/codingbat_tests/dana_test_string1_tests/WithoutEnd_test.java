package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEnd_test {

    WithoutEnd withoutEnd = new WithoutEnd();

    @DataProvider(name = "withoutEnd")
    public Object[][] dpWithoutEnd(){
        return new Object[][]{
                {"Hello", "ell"},
                {"java", "av"},
                {"coding", "odin"},
                {"code", "od"},
                {"ab", ""},
                {"Chocolate!", "hocolate"},
                {"kitten", "itte"},
                {"woohoo", "ooho"}
        };
    }

    @Test(description = "Verify WithoutEnd Functional", dataProvider = "withoutEnd")
    public void withoutEnd_test(String str, String res){
        Assert.assertEquals(withoutEnd.withoutEnd(str), res);
    }
}
