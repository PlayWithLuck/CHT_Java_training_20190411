package com.cht.training;

public class Main4 {
    public static void main(String[] args) {
        Employee emp1;
        Employee emp2;
        Employee emp3;
        Employee emp4;
        emp1 = new Employee("Mark");
        emp2 = new Employee("James");
        emp3 = new Employee("Mark");
        emp4 = emp1;
        Employee emp5 = new Employee();
        emp5.setName("Ken");
        System.out.println("emp1="+emp1.getName());
        System.out.println("emp2="+emp2.getName());
        System.out.println("emp3="+emp3.getName());
        System.out.println("emp4="+emp4.getName());
        System.out.println("emp5="+emp5.getName());
    }
}
