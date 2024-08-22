package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloName_Test {

    HelloName helloName = new HelloName();

    @DataProvider(name = "hello_name")
    public Object[][] dpHelloName(){
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly", "Hello Dolly!"},
                {"Alpha", "Hello Alpha!"},
        };
    }
    @Test(description = "Verify Hello_Name Function", dataProvider = "hello_name")
    public void helloNameTest(String str, String exp){
        Assert.assertEquals(helloName.helloName(str), exp);
    }
}
