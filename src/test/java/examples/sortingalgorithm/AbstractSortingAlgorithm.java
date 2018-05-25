package examples.sortingalgorithm;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

public abstract class AbstractSortingAlgorithm {
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
}
