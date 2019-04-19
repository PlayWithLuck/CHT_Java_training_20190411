package com.cht.training;

class TagMasker<T> {
    private T object;

    public TagMasker(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return String.format("[%s]\n", object);
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}

public class Main49 {
    public static void main(String[] args) {
        TagMasker<Integer> t1 = new TagMasker<>(100);
        TagMasker<String> t2 = new TagMasker<>("hello world");
        System.out.println(t1);
        System.out.println(t2);
        Integer i1 = t1.getObject();
        String i2 = t2.getObject();
        System.out.println("i1="+i1);
        System.out.println("i2="+i2);
    }
}
