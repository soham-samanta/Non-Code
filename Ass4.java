package com.soham;

import java.util.Scanner;

import static com.soham.Main.sum;

public class Ass4 {
    static float pi=3.14f;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter 3 Numbers: ");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//
//        System.out.println("The maximum num is: "+maxNum(a,b,c));
//        System.out.println("The minimum num is: "+minNum(a,b,c));

//        System.out.print("Enter a number to check Odd or Even: ");
//        int n=sc.nextInt();
//        checkOddEven(n);

//        System.out.print("Enter you age: ");
//        int n=sc.nextInt();
//        vote(n);

//        System.out.print("Enter 2 numbers: ");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        System.out.println("Sum = "+checkSum(a,b));

//        System.out.print("Enter 2 numbers: ");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        System.out.println("Product = "+prod(a,b));

//        System.out.print("Enter radious of circle: ");
//        int n= sc.nextInt();
//        System.out.println("Area = "+area(n));
//        System.out.println("Circumference = "+circum(n));

//        System.out.print("Enter a number: ");
//        int n=sc.nextInt();
//        checkPrime(n);

//        System.out.print("Enter your marks: ");
//        int n=sc.nextInt();
//        results(n);

//        System.out.print("Enter a number: ");
//        int n=sc.nextInt();
//        System.out.println(fact(n));

//        System.out.print("Enter a number: ");
//        int n=sc.nextInt();
//        palindrome(n);

//        System.out.print("Enter the range for Primes: ");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        printPrime(a,b);

        System.out.print("Enter a number to calc sum: ");
        int n= sc.nextInt();
        System.out.println(sumN(n));


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


}
