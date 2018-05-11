package exercises.collections;

import java.util.List;

/**
 * Here it will be necessary to use your own logic. It requires to use 'for' loop to resolve the exercise.
 */
public class ListUsingCustomMethodsSolution implements ListUsingCustomMethodsExercise {

    @Override
    public Person findPersonById(List<Person> people, long id) {
        for (Person currentPerson : people) {
            long currentId = currentPerson.getId();
            if (currentId == id){
                return currentPerson;
            }
        }
        return null;
    }

    @Override
    public boolean existsPersonWithThatId(List<Person> people, long id) {
        for (Person currentPerson : people) {
            long currentId = currentPerson.getId();
            if (currentId == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void removePersonByItsId(List<Person> people, long id) {
        Person personToBeRemoved = null;
        for (Person currentPerson : people) {
            long currentPersonId = currentPerson.getId();
            if (currentPersonId == id) { //use local variablc person type
                personToBeRemoved = currentPerson; //
            }
        }
        people.remove(personToBeRemoved);
    }
}
