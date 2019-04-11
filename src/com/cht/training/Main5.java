package com.cht.training;

public class Main5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mark");
        Employee emp2 = new Employee("John");
        emp1 = emp2;
        System.out.println("emp1 is :"+emp1.getName());
        System.out.println("emp2 is :"+emp2.getName());
        System.out.println(emp1==emp2);
        Main4 main4 = new Main4();
        System.out.println("main4 is here"+main4.toString());
    }
}
