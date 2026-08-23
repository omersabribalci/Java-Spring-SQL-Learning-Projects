package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    public void work(double salary) {
        System.out.println(getName() +  " starts to working...");
        this.setSalary(salary);
    }
}
