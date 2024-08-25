package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.WordEnds;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordEnds_Test {
    WordEnds wordEnds = new WordEnds();

    @DataProvider(name = "word_ends")
    public Object[][] dpWordEnds(){
        return new Object[][]{
                {"abcXY123XYijk", "XY", "c13i"},
                {"abc1xyz1i1j", "1", "cxziij"},
                {"abc1xyz1abc", "b", "acac"}
        };
    }

    @Test(description = "Verify word ends function", dataProvider = "word_ends")
    public void wordEndsTest(String str, String word, String expected){
        Assert.assertEquals(wordEnds.wordEnds(str, word), expected);
    }
}
