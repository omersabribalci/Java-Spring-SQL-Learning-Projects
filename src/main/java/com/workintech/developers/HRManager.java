package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void work(double salary) {
        System.out.println(getName() + " starts to working...");
        this.setSalary(salary);
    }

    public void addEmployee(int index, JuniorDeveloper JuniorDeveloper) {
        try {
            if(juniorDevelopers[index] == null) {
                juniorDevelopers[index] = JuniorDeveloper;
            } else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper MidDeveloper) {
        try {
            if(midDevelopers[index] == null) {
                midDevelopers[index] = MidDeveloper;
            } else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper SeniorDeveloper) {
        try {
            if(seniorDevelopers[index] == null) {
                seniorDevelopers[index] = SeniorDeveloper;
            } else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found " + index);
        }
    }
}
