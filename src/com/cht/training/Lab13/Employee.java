package com.cht.training.Lab13;

public class Employee {

    static {
        counter = 200;
    }

    private static int counter;

    public Employee(){
        counter++;
    }

    public static int getCounter() {//若可以宣告為staic的函數或變數盡量宣告為staic，因為會被直接放入固定記憶體，存取較快速
        return counter;
    }

    public static void main(String[] args) {
        for(int i=0; i<10;i ++){
            Employee e1 =new Employee();
            System.out.println(Employee.getCounter());
        }

    }
}
