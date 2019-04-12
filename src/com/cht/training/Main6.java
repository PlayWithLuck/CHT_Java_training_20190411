package com.cht.training;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("do something else...1");
        System.out.println("do something else...2");
        System.out.println("do something else...3");
        Employee employee1 = new Employee("John");
        System.out.println("created:"+Employee.getCounter());
        Employee employee2 = new Employee("Ken");
        System.out.println("created:"+Employee.getCounter());
        Employee employee3 = new Employee("Tim");
        System.out.println("created:"+Employee.getCounter());
        System.out.println("created:"+employee1.getCounter());
        System.out.println("created:"+employee1.getCounter2());
//        System.out.println("created:"+ Employee.getCounter2());
        System.out.println("create 3 employees");
    }
}
