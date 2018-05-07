package exercises.collections;

import java.util.List;

public interface ListUsingCustomMethodsExercise {
    Person findPersonById(List<Person> people, long id);

    boolean existsPersonWithThatId(List<Person> people, long id);

    void removePersonByItsId(List<Person> people, long id);
}
