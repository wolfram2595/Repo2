package IntroducereInProgramare;/*
Recap
variabile
tipuri de date: String, int, char, float/double, boolean

 IntroducereInProgramare.Operatori:
 aritmetici: +, -, *, /, %
 de comparare: <, >, ==, !=(diferit de), >=, <=
 logici: && , || , !

 Flow control - if else
 evalueaza conditii si bifurca codul in functie de rezultat
 */

public class Operatori {
    public static void main(String[] args) {
        int a = 3; // o declarare && initializare
        int b = 5;
        a = b; //suprascriere
        //System.out.println(a != b); // 5 diferit de 5? => false
        //System.out.println(a % b); // 5 modul de 5 este 0
        //System.out.println(a == b); // 5 egal cu 5? => true
        //System.out.println(7>b && 8>b); // 7 > 5 SI 8 > 5
        //System.out.println(7>b && 3>b); // 7 > 5 SI 3 > 5
        //System.out.println(7>b || 3>b); // 7 > 5 SAU 3 > 5
        //System.out.println(7>b && 8>b || 3>b); //7>5 SI 8>5 SAU 3>5
        System.out.println(!(7>b)); // 7 > 5? !(true) = false; ! inversearza raspunsul


    }
}
