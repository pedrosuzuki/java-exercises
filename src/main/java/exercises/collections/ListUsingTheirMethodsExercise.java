package exercises.collections;

import java.util.List;

public interface ListUsingTheirMethodsExercise {
    void addPerson(List<Person> people, Person personToAdd);

    void removePerson(List<Person> people, Person personToRemove);

    boolean existsPersonInList(List<Person> people, Person personToAdd);
}
