package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//      Grocery grocery = new Grocery();
//      grocery.startGrocery();

        List<Contact> contacts = new ArrayList<>();

        Contact c1 = new Contact("John Doe", "123123123");
        Contact c2 = new Contact("Jane Doe", "124124124");
        Contact c3 = new Contact("Baby Doe", "125125125");

        contacts.add(c1);
        contacts.add(c2);
        contacts.add(c3);
        MobilePhone myPhone = new MobilePhone("12345678910", contacts);

        System.out.println(myPhone.getMyContacts());

    }
}
