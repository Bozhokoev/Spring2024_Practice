package codingbat_tests.zarina3_tests.string1_tests;
import codingbat.zarina3.string1.WithoutEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEnd2_Test {

    WithoutEnd2 withoutEnd2 = new WithoutEnd2();

    @DataProvider(name = "WithoutEnd2")
    public Object[][] dpWithoutEnd2(){
        return new Object[][]{
                {"Hello", "ell"},
                {"abc", "b"},
                {"", ""},
        };
    }
    @Test(description = "Verify WitoutEnd2 Test", dataProvider = "WithoutEnd2")
    public void withoutEnd2Test(String str, String res){
        Assert.assertEquals(withoutEnd2.withouEnd2(str),res);
    }

}

