package com.cht.training;

public class Main9 {
    public Main9() {//建構子
        System.out.println("this line should be called");
//        return 500; //建構子無法return
    }
    public void Main9(){//不建議使用與建構子相同名字的Method
        System.out.println("this method should not exist");
    }
    public void writeSomething(){
        System.out.println("empty...");
    }
    public void writeSomething(String content){
        System.out.println("content=" + content);
    }
    public void writeSomething(String content, int times){
        String result = "";
        for (int i=0;i<times;i++){
            result += content;
        }
        System.out.println("content" + result);
    }

    public static void main(String[] args) {
        Main9 m9 =new Main9();
        m9.writeSomething();
        m9.writeSomething("Hello world");
        m9.writeSomething("Hi",5);
        m9.Main9(); //雖然可執行，不建議使用
    }
}
