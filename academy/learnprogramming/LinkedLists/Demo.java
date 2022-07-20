package academy.learnprogramming.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Des Plaines");
        addInOrder(placesToVisit, "Skokie");
        addInOrder(placesToVisit, "Chicago");
        addInOrder(placesToVisit, "Antioch");
        addInOrder(placesToVisit, "Gurnee");

        addInOrder(placesToVisit, "Naperville");
        addInOrder(placesToVisit, "Des Plaines");
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }
    // adds new entries in alphabetical order
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if (comparison > 0) {
                // new City should appear before this one
                // Gurnee -> skokie
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if (comparison < 0) {
                // move on to next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }
}

























