package com.cht.training.Lab11;

public class Main11 {
    public static void main(String[] args) {
        Engineer engineer1 =new Engineer();
        engineer1.working();
        engineer1.debug();
        PM pm1 = new PM();
        pm1.working();

//        Employee emp1 = new Employee(); //不可以這樣宣告
        Employee emp1 = new Engineer();
//        emp1.debug;
        Employee emp2 = new Engineer();
        Employee emp3 = new PM();
        Employee[] allStaffs = {emp1, emp2, emp3};
        for (Employee staff : allStaffs){
            staff.working();
        }

    }
}
