public class makeAbba {

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static void main(String[] args){
        System.out.println(makeAbba("Hi", "Bye") + " ...should be HiByeByeHi");
        System.out.println(makeAbba("Yo", "Alice") + " ...should be YoAliceAliceYo");
        System.out.println(makeAbba("What", "Up") + " ...should be WhatUpUpWhat");
    }

}
