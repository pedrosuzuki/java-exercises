package exercises.collections;

import java.util.List;

public class ListUsingTheirMethodsSolution implements ListUsingTheirMethodsExercise {

    @Override
    public void addPerson(List<Person> people, Person personToAdd) {
        if (!people.contains(personToAdd)) {
            people.add(personToAdd);
        }
    }

    @Override
    public void removePerson(List<Person> people, Person personToRemove) {
        if (people.contains(personToRemove)) {
            people.remove(personToRemove);
        }
    }

    @Override
    public boolean existsPersonInList(List<Person> people, Person personToAdd) {
        return people.contains(personToAdd);
    }
}
