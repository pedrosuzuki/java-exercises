package examples.collections;

import exercises.collections.Person;

import java.util.Comparator;
import java.util.List;

public class MaxElementFromList {
    /*
    Compare will return:
    - negative number if o1 < o2
    - zero if o1 == o2
    - positive if o1 > o2

    In java 7:
    private Comparator<Person> personComparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return Long.compare(o1.getId(), o2.getId());
        }
    };
     */

    // In java 8 using lambda
    private Comparator<Person> personComparator = (o1, o2) -> Long.compare(o1.getId(), o2.getId());

    public Person maxUsingFor(List<Person> people) {
        Person maxPerson = null;
        for (Person currentPerson : people) {
            if (maxPerson == null) {
                maxPerson = currentPerson;
            } else {
                int compareResult = personComparator.compare(maxPerson, currentPerson);
                if (compareResult < 0) {
                    maxPerson = currentPerson;
                }
            }
        }
        return maxPerson;
    }

    // Only available in java 8
    // max returns an Optional<Person>
    // Optional can have a Person or not
    // Optional has a method which is called orElse
    //  - if it has a Person, it will return it
    //  - if it has not a Person, will return null
    public Person maxUsingStream(List<Person> people) {
        return people.stream()
                .max(personComparator)
                .orElse(null);
    }

    public Person maxUsingForWithIndex(List<Person> people) {
        Person maxPerson = null;
        for (int personIndex = 0; personIndex < people.size(); personIndex++) {
            Person currentPerson = people.get(personIndex);
            if (maxPerson == null) {
                maxPerson = currentPerson;
            } else {
                int compareResult = personComparator.compare(maxPerson, currentPerson);
                if (compareResult < 0) {
                    maxPerson = currentPerson;
                }
            }
        }
        return maxPerson;
    }

    public Person maxUsingForWithIndexWhile(List<Person> people) {
        Person maxPerson = null;
        int indexPeopleList = 0;
        while (indexPeopleList < people.size()) {
            Person currentPerson = people.get(indexPeopleList);
            if (maxPerson == null) {
                maxPerson = currentPerson;
            } else {
                int compareResult = personComparator.compare(maxPerson, currentPerson);
                if (compareResult < 0) {
                    maxPerson = currentPerson;
                }
            }
            indexPeopleList++;
        }
        return maxPerson;
    }
}