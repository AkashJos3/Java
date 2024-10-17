package javalab;

import java.util.*;

class EvenNum implements Runnable {
    public int a;

    public EvenNum(int a) {
        this.a = a;
    }

    public void run() {
        System.out.println("The Thread " + a + " is Even and Square of " + a + " is: " + (a * a));
    }
}

class OddNum implements Runnable {
    public int a;

    public OddNum(int a) {
        this.a = a;
    }

    public void run() {
        System.out.println("The Thread " + a + " is Odd and Cube of " + a + " is: " + (a * a * a));
    }
}

class RandomNumGenerator extends Thread {
    public void run() {
        Random r = new Random();

        try {
            for (int i = 0; i < 10; i++) { 
                int n = r.nextInt(20);
                System.out.println("Generated Number is " + n);

                if (n % 2 == 0) {
                    Thread t1 = new Thread(new EvenNum(n));
                    t1.start();
                    t1.join();
                } else {
                    Thread t2 = new Thread(new OddNum(n));
                    t2.start();
                    t2.join(); 
                }

                Thread.sleep(1000); 
                System.out.println("------------");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        RandomNumGenerator rn = new RandomNumGenerator();
        rn.start();
    }
}
