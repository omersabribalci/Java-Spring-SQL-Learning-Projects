package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
/*
        System.out.println("Hello world!");

        Set<Task> annsTasks = new HashSet<>();
        Set<Task> bobsTasks = new HashSet<>();
        Set<Task> carolsTasks = new HashSet<>();
        Set<Task> unassignedTasks = new HashSet<>();

        Task task1 = new Task("Hospital-App", "Login page creation", "Ann", Status.ASSIGNED, Priority.HIGH);
        Task task2 = new Task("Hospital-App", "Patient registration module", "Bob", Status.IN_PROGRESS, Priority.MED);
        Task task3 = new Task("Hospital-App", "Doctor dashboard UI", "Carol", Status.IN_QUEUE, Priority.HIGH);
        Task task4 = new Task("Hospital-App", "Billing system integration", "Ann", Status.IN_PROGRESS, Priority.LOW);
        Task task5 = new Task("Hospital-App", "Appointment scheduling feature", "Bob", Status.ASSIGNED, Priority.MED);
        Task task6 = new Task("Hospital-App", "Notification service setup", null, Status.IN_QUEUE, Priority.HIGH);

        annsTasks.add(task1);
        annsTasks.add(task4);
        bobsTasks.add(task2);
        bobsTasks.add(task5);
        carolsTasks.add(task3);
        unassignedTasks.add(task6);

        TaskData taskData = new TaskData(annsTasks,bobsTasks,carolsTasks,unassignedTasks);

        System.out.println(taskData.getTasks("ann"));
        System.out.println(taskData.getUnion(annsTasks,bobsTasks,carolsTasks,unassignedTasks));
*/

        StringSet.findUniqueWords();


    }
}