package com.cht.training;

import java.util.Vector;

public class Main48 {
    public static void main(String[] args) {
        Vector floatVector = new Vector();
        floatVector.add(23.4f);
        floatVector.add(567.89f);
        System.out.println("vector" + floatVector);
        for (int i=0; i<floatVector.size(); i++){
            System.out.printf("[%d]%f\n",i,floatVector.get(i));
            Float variable = (Float) floatVector.get(i);
        }
    }
}
