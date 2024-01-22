package p1;


import java.util.ArrayList;

class Thread4 extends Thread{
    public void run(){
        while (true){
        System.out.println("Welcome");
    }
    }
}
class Thread9 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}
public class A {
    public static void main(String[] args) {
        Thread1 t4= new Thread1();
        Thread2 t9= new Thread2();
        t4.start();
        t9.start();
    }
}