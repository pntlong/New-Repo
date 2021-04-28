package com.company;

public class Main {

    public static void main(String[] args) {
        NonSyMethod n = new NonSyMethod();
        ThreadOne thread1 = new ThreadOne(n);
        thread1.setName("Thread One");
        ThreadTwo thread2 = new ThreadTwo(n);
        thread2.setName("Thread Two");
        thread1.start();
        thread2.start();
    }
}
class ThreadOne extends Thread {
    NonSyMethod process;

    public ThreadOne(NonSyMethod process) {
        this.process = process;
    }

    @Override
    public void run() {
        process.printNumber();
    }
}
class ThreadTwo extends Thread{
    NonSyMethod process;

    public ThreadTwo(NonSyMethod process) {
        this.process = process;
    }

    @Override
    public void run() {
        process.printNumber();
    }
}