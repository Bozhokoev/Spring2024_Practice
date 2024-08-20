package codingbat_tests.amir.tests.array1_tests;

import codingbat.amir.array1.CommonEnd;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class СommonEndTest {

    @Test
    public void testCommonEnd_FirstElementSame() {
        CommonEnd commonEnd = new CommonEnd();

        // Проверка, когда последний элемент совпадает
        assertTrue(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}),
                "The last elements should be the same.");

        // Проверка, когда ни первый, ни последний элемент не совпадают
        assertFalse(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}),
                "Neither the first nor the last elements should match.");

        // Проверка, когда первый элемент совпадает
        assertTrue(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}),
                "The first elements should be the same.");

    }
}
