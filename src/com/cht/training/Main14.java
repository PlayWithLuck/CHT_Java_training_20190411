package com.cht.training;

enum OSType {
    IOS(10), Android(20), Linux(30), ChromeOS(40);
    private int id;

    private OSType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class OSDetail {
    private OSType type;

    public OSDetail(OSType type) {
        this.type = type;
    }

    public void vendor() {
        switch (type) {
            case IOS:
                System.out.println("Apple:" + type.getId());
                break;
            case Linux:
                System.out.println("RedHat:" + type.getId());
                break;
            case Android:
                System.out.println("Google:" + type.getId());
                break;
            case ChromeOS:
                System.out.println("Alaphabet:" + type.getId());
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
