package com.company;

public class NonSyMethod {
    public synchronized void printNumber(){
        System.out.println("Start print numbers for: " + Thread.currentThread().getName());
        for(int i = 0 ; i<= 10 ; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("End print nymbers for: " + Thread.currentThread().getName());
    }
}
