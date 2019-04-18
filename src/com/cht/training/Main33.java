package com.cht.training;

interface Running{
    boolean race(int x);
}

class Tiger implements Running{
    public void eating(){
        System.out.println("I like meat!");
    }
    @Override
    public boolean race(int x){
        System.out.println("tiger is fast");
        return true;

    }
}

class Bike implements Running{
    public void polish(){
        System.out.println("bling bling");
    }
    @Override
    public boolean race(int x) {
        System.out.println("bike depends on driver!");
        return true;
    }
}

public class Main33 {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        tiger1.eating();
        tiger1.race(100);
        Running r1 = new Tiger();
        r1.race(100);
//        r1.eating();
        Bike b1 = new Bike();
        Running r2 =b1;
        b1.polish();
        b1.race(100);
        r2.race(100);

        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = new Tiger();
        Bike t4 = new Bike();
        Bike t5 = new Bike();
        Running[] teams ={t1, t2, t3, t4, t5};
        for (Running r: teams){
            r.race(50);
        }

    }
}
