package com.cht.training.Lab12;

//public final class Employee { //final的類別不能被繼承
//}

public class Employee {

    final int gradLevel;

    public Employee(){
        gradLevel = 0;
    }

    public Employee(int grade){
        gradLevel = grade;
    }

    public final int getGradLevel(){
        return gradLevel;
    } //函數可以宣告成final，建構子不能

    public void onBoard(){//若宣告成final不能被子類別super
        System.out.println("Hi I am a newbee");
    }
}
