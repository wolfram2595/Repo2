package IntroducereInProgramare;

import java.util.Random;
import java.util.Scanner;

public class FlowControl {

    //public static void main(String[] args) {
        // Flow control - if else
        // evalueaza conditii si bifurca codul in functie de rezultat
        //System.out.println("pornim radio");
        //boolean piesa_faina = false; // invat calculatorul daca piesa e faina sau nu
        // daca imi place piesa, dau mai tare
        //if (piesa_faina == true) {
            //System.out.println("dau mai tare");
            //System.out.println("ne place, ne place, ne place place place");
        //}
       // System.out.println("oprim radio");

    public static void main(String[] args) {
        // if else
        //int nr = 4;
        //if (nr % 2 == 0) {
            //System.out.println("nr par");
        //} //else {
            //System.out.println("nr impar");
        //}
        // if, else if, else
        // luam date de la tastatura
        /*String dimineata = "Pup la ecler, sa fie tare maciuca!";
        String amiaza = "Traiasca sefu, sa-l iubeasca amanta!";
        String seara = "Doar protejat sefu! Ca asa e la necunoscute!";
        String noaptea = "Bossu, vezi ca te asteapta sotia nu fi nebun.";
        Scanner sc = new Scanner(System.in);
        System.out.println("Cat e un ceas Boss?");
        int ora = sc.nextInt();
        if (ora < 0) {
            System.out.println("Ora este invalida. Introdu o valoare mai mare de 0");
        } else if (ora <= 11) {
            System.out.println(dimineata);
        } else if (ora <= 18) {
            System.out.println(amiaza);
        } else if (ora <= 21) {
            System.out.println(seara);
        } else if (ora <= 24) {
            System.out.println(noaptea);
        } else {
            System.out.println("Ora este invalida. Introdu o valoare mai mica de 25");
        }*/
        // O masina se afla in localitate
        //Daca masina sta pe loc si are viteza 0 atunci ea este oprita si stationeaza
        //Daca masina merge cu o viteza mai mica sau egala cu 50 atunci ea este in viteza legala
        //Daca masina depaseste viteza de 50 si este in localitate atunci a depasit viteza legala si poate lua amenda

//        String Stationeaza = "Masina este oprita si stationeaza";
//        String VitezaLegala = "Masina merge cu viteza legala";
//        String VitezaIlegala = "Masina a depasit viteza legata! Risti sa iei amenda!";
//        Scanner sd = new Scanner(System.in);
//        System.out.println("Ce viteza are masina?");
//        int viteza = sd.nextInt();
//        if (viteza <= 0) {
//            System.out.println(Stationeaza);
//        } else if (viteza <= 50) {
//            System.out.println(VitezaLegala);
//        } else if (viteza <= 100) {
//            System.out.println(VitezaIlegala);
//        } else if (viteza <= 130) {
//            System.out.println("Ba boule vezi ca mori!");
//        } else {
//            System.out.println("Pa pula te duci");
//        }
        // switch - se foloseste cand se stie valoarea posibila
        System.out.println("Alege Optiunea:");
        Scanner sd = new Scanner(System.in);
        int optiunea = sd.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("Revino la meniu anterior");
                break;
            case 1:
                System.out.println("Ati optat pentru limba porcilor");
                break;
            case 2:
                System.out.println("Alegeti Limba smecherilor");
                break;
            default:
                System.out.println("Invalid ba coaie!");
        }
    } // inchide functia main
} // inchide clasa
