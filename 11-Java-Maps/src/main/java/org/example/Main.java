package org.example;


import org.example.entity.Employee;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(4, "Burak", "Cevizli"));
        employees.add(null);


        System.out.println(findDuplicates(employees).get(0).getFirstname());
        System.out.println(findUniques(employees).size());
        System.out.println(findUniques(employees).get(1).getFirstname());

        System.out.println(removeDuplicates(employees).size());
        System.out.println(removeDuplicates(employees).get(0).getFirstname());

        System.out.println(WordCounter.calculatedWord().get("turkish"));

    }

    public static List<Employee> findDuplicates(List<Employee> employees) {

        List<Employee> repeatedEmployees = new LinkedList<>();
        Map<Employee, Integer> seen = new LinkedHashMap<>();

        for (int i = 0; i < employees.size(); i++) {
            Employee curEmp = employees.get(i);

            if (curEmp == null) continue;

            if (seen.containsKey(curEmp)) {
                seen.put(curEmp, seen.get(curEmp) + 1);
            } else {
                seen.put(curEmp, 1);
            }
        }

        Set<Employee> keys = seen.keySet();

        for (Employee key : keys) {
            if (seen.get(key) > 1) {
                repeatedEmployees.add(key);
            }
        }

        return repeatedEmployees;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> employees) {

        Map<Integer, Employee> uniqueEmployees = new LinkedHashMap<>();


        for (int i = 0; i < employees.size(); i++) {
            Employee curEmp = employees.get(i);
            if (curEmp == null) continue;
            if (uniqueEmployees.containsValue(curEmp)) {
                continue;
            } else {
                uniqueEmployees.put(i + 1, curEmp);
            }
        }

        return uniqueEmployees;
    }

    public static List<Employee> removeDuplicates(List<Employee> employees) {
        Map<Employee, Integer> seen = new LinkedHashMap<>();

        List<Employee> cleanList = new LinkedList<>();

        for (int i = 0; i < employees.size(); i++) {
            Employee curEmp = employees.get(i);
            if (curEmp == null) continue;

            if (seen.containsKey(curEmp)) {
                seen.put(curEmp, seen.get(curEmp) + 1);
            } else {
                seen.put(curEmp, 1);
            }
        }

        Set<Employee> keys = seen.keySet();

        for (Employee key : keys) {
            if (seen.get(key) == 1) {
                cleanList.add(key);
            }
        }

        return cleanList;
    }

}