package examples.sortingalgorithm;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class BubbleSortTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    private Object[][] integerArrayToSort() {
        return new Object[][] {
                {
                        null,
                        null,
                        IllegalArgumentException.class
                },
                {
                        new Integer[] {},
                        new Integer[] {},
                        null
                },
                {
                        new Integer[] {60, 30, 45, 0, -15, 75, 15, -45, -30},
                        new Integer[] {-45, -30, -15, 0, 15, 30, 45, 60, 75},
                        null
                },
                {
                        new Integer[] {5, 8, 1, 3, 7, 2, 4, 6},
                        new Integer[] {1, 2, 3, 4, 5, 6, 7, 8},
                        null
                }
        };
    }

    @Test
    @Parameters(method = "integerArrayToSort")
    public void sortTest(Integer[] array, Integer[] expected, Class<? extends Exception> expectedException) {
        // given
        SortingAlgorithm<Integer> bubbleSort = new BubbleSort<>();
        if(expectedException != null) {
            exception.expect(expectedException);
        }

        // when
        Integer[] actual = bubbleSort.sort(array);

        // then
        assertArrayEquals(expected, actual);
    }
}
