package exercises.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListUsingCustomMethodsSolutionTest {
    private ListUsingCustomMethodsExercise listUsingCustomMethodsExercise = new ListUsingCustomMethodsSolution();

    @Test
    public void findPersonByIdTest() {
        // given
        Person person = new Person(1L, "Juan", "Perez");
        List<Person> people = Collections.singletonList(person);

        // when
        Person actual = listUsingCustomMethodsExercise.findPersonById(people, 1L);

        // then
        assertEquals(actual, person);
    }

    @Test
    public void existsPersonWithThatIdTest() {
        // given
        Person person = new Person(1L, "Juan", "Perez");
        List<Person> people = Collections.singletonList(person);

        // when
        boolean actual = listUsingCustomMethodsExercise.existsPersonWithThatId(people, 1L);

        // then
        assertEquals(true, actual);
    }

    @Test
    public void removePersonByItsIdTest() {
        // given
        Person person1 = new Person(1L, "Juan", "Perez");
        Person person2 = new Person(2L, "Jose", "Gomez");

        List<Person> expected = Collections.singletonList(person1);
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);

        // when
        listUsingCustomMethodsExercise.removePersonByItsId(people, 2L);

        // then
        assertEquals(expected, people);
    }
}