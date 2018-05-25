package examples.sortingalgorithm;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class BubbleSortTest extends AbstractSortingAlgorithm {
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
