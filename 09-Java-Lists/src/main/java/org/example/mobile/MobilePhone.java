package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public boolean addNewContact(Contact contact) {
        if (contact == null || contact.getName() == null || contact.getPhoneNumber() == null) {
            return false;
        }

        int index = findContact(contact);

        if (index != -1) {
            System.out.println("Contact already exists.");
            return false;
        }

        return myContacts.add(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);

        if (index == -1) {
            System.out.println("Contact not found.");
            return false;
        }

        myContacts.set(index, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (contact == null || contact.getName() == null || contact.getPhoneNumber() == null) {
            return false;
        }

        int index = findContact(contact);

        if (index == -1) {
            System.out.println("Contact not found.");
            return false;
        }

        return myContacts.remove(contact);

    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact); // equals metodunu kullanır...
    }

    public int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact c = myContacts.get(i);
            if (c.getName().equalsIgnoreCase(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        for (Contact c : myContacts) {
            if (c.getName().equalsIgnoreCase(contactName)) {
                return c;
            }
        }

        return null;
    }

    public void printContact() {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact c = myContacts.get(i);
            System.out.println(i + 1 + "." + c.getName() + " -> " + c.getPhoneNumber());
        }
    }
}
