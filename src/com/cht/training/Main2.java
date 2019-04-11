package com.cht.training;

public class Main2 {
    private static String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {
        for (int i = 0; i < dayOfWeek.length; i++) {
            switch (dayOfWeek[i]) {
                case "Sunday":
                    System.out.println("周日");
                    break;
                case "Monday":
                    System.out.println("周一");
                    break;
                case "Tuesday":
                    System.out.println("周二");
                    break;
                case "Wednesday":
                    System.out.println("周三");
                    break;
                case "Thursday":
                    System.out.println("周四");
                    break;
                case "Friday":
                    System.out.println("周五");
                    break;
                case "Saturday":
                    System.out.println("周六");
                    break;
            }
        }

    }
}
