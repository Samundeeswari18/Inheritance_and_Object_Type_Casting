package com.sam.inheritance;

public class ExamplStatic {
    int a =10;
    int b =20;
    static int s=5;
    static String s2="hello";
    ExamplStatic(int a,int b) {
        System.out.println("Constructor Started");
        s++;
    }
    ExamplStatic(String s1) {
        System.out.println("Constructor Started 2nd time " +s1);
        s++;
    }
    static void display(int c){
        System.out.println("the value of c + a: " +(c));


    }
    public void display(int a,int b){
        System.out.println("The value of a + b + s: " +(a+b+s));
        System.out.println(s2);
    }
    static {
        System.out.println("Static Started");
        System.out.println();
        s++;

    }
    public static void main(String[] args) {
        System.out.println("Main Started");
        ExamplStatic obj = new ExamplStatic(10,20);
        ExamplStatic obj2 = new ExamplStatic("hell");
        System.out.println("Static variable count: "+ExamplStatic.s);
        obj.display(10);
        obj2.display(20,20);
    }
}
