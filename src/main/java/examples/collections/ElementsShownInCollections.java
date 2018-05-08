package examples.collections;

import exercises.collections.Person;

import java.util.Iterator;
import java.util.List;

public class ElementsShownInCollections {
    public void showElementsFromListUsingForLoop(List<Person> people) {
        for(Person currentPerson : people) {
            System.out.println(currentPerson.getId());
        }
    }

    public void showElementsFromListUsingForLoop2(List<Person> people) {
        for(int indexPeopleList = 0; indexPeopleList < people.size(); indexPeopleList++) {
            Person currentPerson = people.get(indexPeopleList);
            System.out.println(currentPerson.getId());
        }
    }

    public void showElementsFromListUsingWhileLoop(List<Person> people) {
        // local variable to get the current element
        int indexPeopleList = 0;
        while(indexPeopleList < people.size()) {
            Person currentPerson = people.get(indexPeopleList);
            System.out.println(currentPerson.getId());
            indexPeopleList++;
        }
    }

    /**
     * Watch to get more details about iterator: https://www.youtube.com/watch?v=53cFp9P9ao8
     */
    public void showElementsFromListUsingIteratorAndForLoop(List<Person> people) {
        for(Iterator<Person> personIterator = people.iterator(); personIterator.hasNext(); ) {
            // get and go to the next element
            Person currentPerson = personIterator.next();
            System.out.println(currentPerson.getId());
        }
    }

    public void showElementsFromListUsingIteratorAndWhileLoop(List<Person> people) {
        Iterator<Person> personIterator = people.iterator();
        while(personIterator.hasNext()) {
            // get and go to the next element
            Person currentPerson = personIterator.next();
            System.out.println(currentPerson.getId());
        }
    }

    /**
     * Only if you use java 8
     */
    public void showElementsFromListUsingForEach(List<Person> people) {
        people.forEach(person -> System.out.println(person.getId()));
    }
}
