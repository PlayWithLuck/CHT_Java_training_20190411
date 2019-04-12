package com.cht.training.Lab11;

public abstract class Employee {
    public int getSalary(){
        return 0;
    }

    abstract void working(); //若 class下有方法被宣告為abstract，calss也必須為abstract
}
