// Ziying Jian
// APCS
// HW28 -- PPMP
// 2021-11-1
// time spent: 2 hrs

public class cb {

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String doubleChar(String str) {
        String extract = "";
        for (int i = 0; i <= str.length() - 1; i++){
            extract = extract + str.charAt(i) + str.charAt(i);
        } return extract;
    }

    public static int countHi(String str) {
        int counter = 0;
        for (int i=0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("hi")) {
                counter++;
            }
        } return counter;
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String cat = str.substring(i, i + 3);
            String dog = str.substring(i, i + 3);
            if (cat.equals("cat")) {
                catCount++;
            } else if (dog.equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-3; i++){
            String charC = str.substring(i, i+1);
            String charO = str.substring(i+1, i+2);
            String charE = str.substring(i+3, i+4);
            if ( charC.equals("c") && charO.equals("o") && charE.equals("e") ){
                count++;
            }
        } return count;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        String str = b;
        String shorter = a;
        if (a.length() > b.length() ){
            str = a;
            shorter = b;
        }

        int shortLength = shorter.length()-1;
        int stringLength = str.length() - 1;
        String stringExtract = str.substring(stringLength - shortLength);
        return stringExtract.equals(shorter);
    }

    public static boolean xyzThere(String str) {
        String xyz = "xyz";
        if (str.length() >= 3 && str.substring(0, 3).equals(xyz)) {
            return true;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            String extract = str.substring(i, i + 3); // extracts three letters
            if (extract.equals(xyz) && str.charAt(i - 1) != '.') {
                // extract = "xyz" AND letter preceding it ISN'T a period
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(helloName("Bob") + " ...should be Hello Bob!");
        System.out.println(helloName("Alice") + " ...should be Hello Alice!");
        System.out.println(helloName("Alice") + " ...should be Hello Alice!");

        System.out.println(makeAbba("Hi", "Bye") + " ...should be HiByeByeHi");
        System.out.println(makeAbba("Yo", "Alice") + " ...should be YoAliceAliceYo");
        System.out.println(makeAbba("What", "Up") + " ...should be WhatUpUpWhat");

        System.out.println(doubleChar("The") + " ...should be TThhee");
        System.out.println(doubleChar("AAbb") + " ...should be AAAAbbbb");
        System.out.println(doubleChar("Hi-There") + " ...should be HHii--TThheerree");

        System.out.println(countHi("abc hi ho") + "...should be 1" );
        System.out.println(countHi("ABChi hi") + "...should be 2");
        System.out.println(countHi("hihi") + "...should be 2");

        System.out.println(catDog("catdog")); // true
        System.out.println(catDog("catcat")); // false
        System.out.println(catDog("1cat1cadodog")); // true

        System.out.println(countCode("aaacodebbb") + "...should be 1");
        System.out.println(countCode("codexxcode") + "..should be 2");
        System.out.println(countCode("cozexxcope") + "...should be 2");

        System.out.println(endOther("Hiabc", "abc") + "...should be true");
        System.out.println(endOther("AbC", "HiaBc") + "...should be true");
        System.out.println(endOther("abc", "abXabc") + "...should be true");

        System.out.println(xyzThere( "abcxyz") + "...should be true");
        System.out.println(xyzThere("abc.xyz") + "...should be false");
        System.out.println(xyzThere("xyz.abc") + "...should be true");
    }
}
