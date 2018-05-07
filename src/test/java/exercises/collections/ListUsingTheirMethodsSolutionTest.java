package exercises.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListUsingTheirMethodsSolutionTest {
    private ListUsingTheirMethodsExercise listUsingTheirMethodsExercise = new ListUsingTheirMethodsSolution();

    @Test
    public void addPersonInEmptyListTest() {
        // given
        Person personToAdd = new Person(1L, "Juan", "Perez");
        List<Person> expected = Collections.singletonList(personToAdd);
        List<Person> people = new ArrayList<>();

        // when
        listUsingTheirMethodsExercise.addPerson(people, personToAdd);

        // then
        assertEquals(expected, people);
    }

    @Test
    public void removePersonTest() {
        // given
        Person person1 = new Person(1L, "Juan", "Perez");
        Person person2 = new Person(2L, "Jose", "Gomez");

        List<Person> expected = Collections.singletonList(person1);
        List<Person> people = Arrays.asList(person1, person2);

        // when
        listUsingTheirMethodsExercise.removePerson(people, person2);

        // then
        assertEquals(expected, people);
    }

    @Test
    public void existsPersonInListTest() {
        // given
        Person personToSearch = new Person(1L, "Juan", "Perez");
        List<Person> people = Collections.singletonList(personToSearch);

        // when
        boolean actual = listUsingTheirMethodsExercise.existsPersonInList(people, personToSearch);

        // then
        assertEquals(true, actual);
    }
}