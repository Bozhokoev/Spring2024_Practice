package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.Diff21;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Diff21_Test {
  Diff21 diff21 = new Diff21();

  @DataProvider (name = "diff21")
    public Object [][] dpDiff21(){
      return new Object[][]{
              {19,2}, {10,11}, {21,0}, {22,2}, {25,8}, {30,18},
              {0,21}, {1,20}, {2,19}, {-1,22},
      };
  }

  @Test(description = "Verify Diff21 Test", dataProvider = "diff21")
    public void diff21_test (int a, int res){
      Assert.assertEquals(diff21.diff21(a),res);
  }
}
