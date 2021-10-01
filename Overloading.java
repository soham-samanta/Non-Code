package com.soham;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
//        fun("soham");
//        fun(24);

//        demo() // it wont work because of ambiguous | Cant decide during overloading which one to take
        demo(3,6,9,2,6,4,2);

    }

     static int sumN(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    static void printPrime(int a, int b) {
        int i;
        for(int n=a;n<=b;n++){
            for(i=2;i<=n;i++){
                if(n%i==0){
                    break;
                }
            }
            if(i==n)
                System.out.print(n+" ");
        }
    }

    static void palindrome(int n){
        int original=n;
        int rev=0;
        while(n>0){
            int last=n%10;
            n=n/10;
            rev=rev*10+last;
        }
        if(rev==original)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    static int fact(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    static void results(int n) {
        if(n>90)
            System.out.println("A+");
        else if(n>80 && n<=90)
            System.out.println("A");
        else if(n>70 && n<=80)
            System.out.println("B");
        else if(n>60 && n<=70)
            System.out.println("C");
        else if(n>50 && n<=60)
            System.out.println("D");
        else if(n>40 && n<=50)
            System.out.println("E");
        else
            System.out.println("Fail !");
    }

    static boolean checkPrime(int n) {
        boolean f=false;
        if(n<=1){
            System.out.println("Not Prime");
            f= true;
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                f = true;
                System.out.println("Not Prime");
                break;
            }
        }
        if(f==false)
            System.out.println("Prime");

        return f;
}

    static float area(int n){
        return pi*n*n;
    }

    static float circum(int n){
        return 2*pi*n;
    }

    static int prod(int a, int b) {
        return a*b;
    }

    static int checkSum(int a, int b) {
        return a+b;
    }

    static void vote(int n) {
        if(n<18)
            System.out.println("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    static void checkOddEven(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    static int maxNum(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
    static int minNum(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }


    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
