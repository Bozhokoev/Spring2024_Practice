package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloName_Test {
    HelloName helloName = new HelloName();

    @DataProvider(name = "helloName")
    public Object [][] dpHelloName(){
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"Lin", "Hello Lin!"},
                {"Akbar", "Hello Akbar!"},
                {"Syrgak", "Hello Syrgak!"},
                {"Akim", "Hello Akim!"},
        };
    }

    @Test(description = "Verify helloName function",dataProvider = "helloName")
    public void helloNameTest(String s, String exp){
        Assert.assertEquals(helloName.helloName(s),exp);
    }
}
