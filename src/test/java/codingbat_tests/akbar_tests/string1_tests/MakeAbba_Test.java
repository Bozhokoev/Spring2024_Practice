package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbba_Test {
    MakeAbba makeAbba = new MakeAbba();

    @DataProvider(name = "makeAbba")
    public Object[][] dpMakeAbba(){
        return new Object[][]{
                {"Hi", "Bye","HiByeByeHi"},
                {"Yo", "Alice","YoAliceAliceYo"},
                {"x", "y","xyyx"},
                {"", "y", "yy"},
                {"Ya", "Ya","YaYaYaYa"},
        };
    }

    @Test(description = "Verify makeAbba fuction",dataProvider = "makeAbba")
public void makeAbbaTest(String a, String b, String exp){
        Assert.assertEquals(makeAbba.makeAbba(a,b),exp);
    }
}
