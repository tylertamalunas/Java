package academy.learnprogramming.ArrayLists;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact newContact) {
        if (myContacts.contains(newContact)) {
            System.out.println("Contact already in list.");
            return false;
        }
        myContacts.add(newContact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactExists = findContact(oldContact);
        if (!myContacts.contains(oldContact)) {
            System.out.println(oldContact + " not found");
            return false;
        } else if (myContacts.contains(newContact)) {
            System.out.println("Contact with name " + newContact + " already exists");
            return false;
        }
        this.myContacts.set(contactExists, newContact);
        System.out.println(oldContact + " replaced with " + newContact);
        return true;
    }

    public boolean removeContact(Contact oldContact) {
        if (myContacts.contains(oldContact)) {
            myContacts.remove(oldContact);
            System.out.println(oldContact + " was removed");
            return true;
        }
        System.out.println(oldContact + " not found");
        return false;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >- 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
