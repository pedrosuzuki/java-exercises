package exercises.collections;

import java.util.List;

/**
 * You can use the methods provided by List class.
 * Keep in mind that they can be used because Person has implemented equals and hashcode methods.
 */
public class ListUsingTheirMethodsSolution implements ListUsingTheirMethodsExercise {
    /**
     * This method should add that Person (personToAdd) into the list (people).
     * You should use the method add provided in List.
     */
    @Override
    public void addPerson(List<Person> people, Person personToAdd) {
        // TODO: implements this method
    }

    /**
     * This method should remove that Person (personToAdd) from the list (people).
     * You should use the method remove provided in List.
     */
    @Override
    public void removePerson(List<Person> people, Person personToRemove) {
        // TODO: implements this method
    }

    /**
     * This method should check if that Person (personToAdd) is part of the list (people).
     * You should use the method contains provided in List.
     */
    @Override
    public boolean existsPersonInList(List<Person> people, Person personToAdd) {
        // TODO: implements this method, remove that return false and use your return logic
        return false;
    }
}
