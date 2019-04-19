package com.cht.training;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("will use this equal");
        if (obj == null) {
            return false;
        }
        if (obj instanceof Rectangle) {
            Rectangle rect = (Rectangle) obj;
            if ((this.x == rect.x)
                    && (this.y == rect.y)
                    && (this.width == rect.width)
                    && (this.height == rect.height)
            ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return x | y << 8 | width << 16 | height <<24;
    }

    @Override
    public String toString() {
        return String.format("{Origin:[%d,%d], width=%d, height=%d", x, y, width, height);
    }
}

public class Main59 {
    public static void main(String[] args) {
        Set<Rectangle> rectangles = new HashSet<>();
        Rectangle r1 = new Rectangle(0, 0, 10, 10);
        rectangles.add(r1);
        System.out.println("[step1]:" + rectangles);
        Rectangle r2 = r1;
        rectangles.add(r2);
        System.out.println("[step2]:" + rectangles);
        Rectangle r3 = new Rectangle(5, 5, 5, 10);
        rectangles.add(r3);
        System.out.println("[step3]:" + rectangles);
        Rectangle r4 = new Rectangle(0, 0, 10, 10);
        rectangles.add(r4);
        System.out.println("[step4]:" + rectangles);
        //除非指到相同的物件，否則不會有相同的hashCode
        System.out.println("r1 hash" + r1.hashCode());
        System.out.println("r2 hash" + r2.hashCode());
        System.out.println("r3 hash" + r3.hashCode());
        System.out.println("r4 hash" + r4.hashCode());

    }
}
