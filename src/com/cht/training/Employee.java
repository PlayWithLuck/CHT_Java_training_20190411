package com.cht.training;

public class Employee {
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Kevin");
        System.out.println("keven name="+emp1.getName());
        emp1.setName("Kevin Wang");
        System.out.println("keven name="+emp1.getName());
    }
}
