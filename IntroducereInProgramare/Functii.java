package IntroducereInProgramare;

import java.util.Scanner;

public class Functii { // incepe clasa
    // functie/metoda = logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem defini o f in alta f

    // o f simpla care ne printeaza ceva pe ecran
    // nu ne da nici un raspuns (nu are return)
    // nu are parametri

    public static void printGreeting() {
        System.out.println("Welcome Honored Guest!");
    }

    // o f care saluta clientul in f de numele lui
    // o f simpla care ne printeaza ceva pe ecran
    // nu ne da nici un raspuns (nu are return)
    // are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Welcome Honored "+ nume + " "+ prenume +" !");
    }

    // o f care calculeaza suma a 3 numere
    // ne da un raspuns suma nr, va avea return
    // are nevoie de parametri
    // ce tip de date va avea raspunsul? 3 + 5 = 8
    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    // o f care ne da valoarea lui pi
    // ne da un raspuns? da
    // are nevoie de parametri? nu
    // raspunsul va fi double
    public static double piValue() {
        // constanta - variabila care nu poate fi suprascrisa
        // o constanta se scrie cu litere MARI
        final double PI = 3.14;
        return PI;
    }

        // suma a 2 nr
        // raspunsul va fi int
        // ne da un raspuns
        // are nevoie de parametri? nu
    public static int sumaNr(int a, int b) {
        int sumaNrTotala = a + b;
        return sumaNrTotala;
    }

        // aria cercului, A = PI * r2 (pi ori raza la patrat) / PI * 3 la patrat = 28.26 corect
    public static double ariaCercului(double r2 ){
        final double PI = piValue();
        double aria = PI * (r2 * r2);
        return aria;
    }

        // aria unui dreptungi, Arie dreptunghi = L * l ; L = 15, l = 9
    public static int ariaDreptunghiului(int Lungime, int latime){
        int arieD = Lungime * latime;
        return arieD;
    }

        // identifica si rezolva o problema folosind o functie
        // cat este Delta stiind formula
        // D = b*b - 4ac
        // D > 0 : x1,2 = -b +- rad D / 2a
        // D = 0: x1 = x2 = -b / 2a
        // D < 0: !=
        // afla delta x*x + x - 6 = 0
        // a = 1 , b = 1, c = -6 = D 25

        // avand 3 numere, returnati pe cel mai mare
    public static int sumaNr(int a, int b, int c){
        int max = Math.max(a, Math.max(b, c));
        return max;
    }
    public static int aflaDelta(int a, int b, int c){
        int delta = (b*b) - 4 * a * c;
        return delta;
    }

    public static void main(String[] args) { // incepe functia main
        // intra clientul 1
        printGreeting(); // se acceseaza functia

        // intra clientul 2
        printGreeting(); // CTRL + Click pe f => ne duce la linia ei

        // apelam o functie cu parametri oferind argumente
        printGreetingByName("Bejenaru", "Sebastian");
        printGreetingByName("Bejenaru", "Silviu");

        System.out.println(mediaNr(3, 3, 4));
        double media1 = mediaNr(345645, 345645, 48679);
        double media2 = mediaNr(658, 678, 145);
        double media3 = mediaNr(35, 98, 56);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());
        System.out.println(piValue());

        // o f care returneaza cate caractere are numele + prenumele tau = 17 V
        String nume = "Bejenaru";
        String prenume = "Sebastian";
        System.out.println(nume.length()+prenume.length());
        System.out.println(sumaNr(9,7));
        System.out.println(ariaCercului(3));
        System.out.println(ariaDreptunghiului(15,9));
        System.out.println(aflaDelta(1,1,-6));
        System.out.println("The maximum number is: "+sumaNr(5,6,7));
    } // se termina functia
} // se termina clasa
