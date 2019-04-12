package com.cht.training;

enum OSType {
    IOS, Android, Linux, ChromeOS
}

class OSDetail {
    private OSType type;

    public OSDetail(OSType type) {
        this.type = type;
    }

    public void vendor() {
        switch (type) {
            case IOS:
                System.out.println("Apple");
                break;
            case Linux:
                System.out.println("RedHat");
                break;
            case Android:
                System.out.println("Google");
                break;
            case ChromeOS:
                System.out.println("Alaphabet");
                break;
        }
    }

}

public class Main14 {
    public static void main(String[] args) {
        OSDetail detail = new OSDetail(OSType.ChromeOS);
        detail.vendor();
    }
}
