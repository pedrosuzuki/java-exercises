package exercises.collections;

import java.util.List;

/**
 * Here it will be necessary to use your own logic. It requires to use 'for' loop to resolve the exercise.
 */
public class ListUsingCustomMethodsSolution implements ListUsingCustomMethodsExercise {
    /**
     * Find a person by its id (Person has a method called 'getId'. It should be used to resolved this exercise.
     * Keep in mind that long is a primitive type, then you have to use '==' instead of equals method.
     * It will require to use for loop to find that person and when it's found, it should be returned.
     * In case that a person is not in the list, null should be returned.
     */
    @Override
    public Person findPersonById(List<Person> people, long id) {
        // TODO: implements this method, remove that return null and use your return logic
        return null;
    }

    /**
     * Check if a person by its id (Person has a method called 'getId'. It should be used to resolved this exercise.
     * Keep in mind that long is a primitive type, then you have to use '==' instead of equals method.
     * It will require to use for loop to find that person and when it's found, 'true' should be returned.
     * In case that a person is not in the list, 'false' should be returned.
     */
    @Override
    public boolean existsPersonWithThatId(List<Person> people, long id) {
        // TODO: implements this method, remove that return false and use your return logic
        return false;
    }

    /**
     * Remove a person by its id (Person has a method called 'getId'). It should be used to resolved this exercise.
     * Keep in mind that long is a primitive type, then you have to use '==' instead of equals method.
     * It will require to use for loop to find that person and when it's found, it should be removed from people list (using remove method provided by List).
     * In case that a person is not in the list, 'people' should stay as it is.
     */
    @Override
    public void removePersonByItsId(List<Person> people, long id) {
        // TODO: implements this method
    }
}
