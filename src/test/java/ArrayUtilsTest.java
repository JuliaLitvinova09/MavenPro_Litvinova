import org.junit.jupiter.api.*;
import ua.ithillel.ArraysUtils;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {
    int[][] array;

    @BeforeEach
    public void setUpBeforeEach() {
        int countRows = 2;// + (int) (Math.random() * 3);
        int countCol = 2;// + (int) (Math.random() * 3);

        array = new int[countRows][countCol];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 1 + (int) (Math.random() * 11);
            }

        }
    }

    @Test
    public void testAssertTrueGetElementIndex() {
        assertTrue(ArraysUtils.isMatrixSquare(array) == true);
    }

    @Test
    public void testAssertEqualseGetElementIndex() {
        assertEquals(true, ArraysUtils.isMatrixSquare(array));
    }
}