package oop;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanResources {
    public static void main(String[] args) {
        List<Angajat> angajati = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Pe cine angajam astazi Boss?");
/*
        System.out.println("Introdu Numele persoanei:");
        String nume = input.nextLine();
        System.out.println("Introdu Prenumele persoanei:");
        String prenume = input.nextLine();
        System.out.println("In ce functie il angajezi?");
        String functie = input.nextLine();

        Angajat manager = new Angajat(nume, prenume, functie);

        System.out.println("Pe ce site promovam anuntul de angajare?");
        String peCeSitePromovezi = input.nextLine();
        manager.anuntAngajare(peCeSitePromovezi);
*/

        System.out.println("Introdu Numele Noului Angajat:");
        String nume = input.nextLine();
        System.out.println("Introdu Prenumele Noului Angajat:");
        String prenume = input.nextLine();
        System.out.println("Ce functie va ocupa "+nume +" "+ prenume+" ?");
        String functie = input.nextLine();
        Angajat manipulant1 = new Angajat(nume, prenume, functie);

        angajati.add(manipulant1);
        System.out.println("Mai vrei sa performezi si alta operatiune?");
        String decizie = input.nextLine();
        if (decizie.equals("da")) {
            System.out.println("Ce vrei sa facem cu angajatul?");
            System.out.println("Optiunile sunt:");
            System.out.println("Concediere, Interogare, Vechime, Cerere de Concediu");
            String optiune = input.nextLine();
            switch (optiune) {
                case "concediere" -> manipulant1.concediere();
                case "interogare" -> manipulant1.statusAngajat();
                case "vechime" -> {
                    System.out.println("Cati ani de vechime are " + nume + " " + prenume + " ?");
                    int aniLucrati = input.nextInt();
                    manipulant1.vechime(aniLucrati);
                }
                case "cerere de concediu" -> {
                    System.out.println("Aprobi cererea lui " + nume + " " + prenume + " de concediu?");
                    String aprobiCererea = input.nextLine();
                    manipulant1.cerereConcediu(aprobiCererea);
                }
                default -> {
                    System.out.println("Nu ai introdus o optiune valida!");
                    System.out.println("Incearca din nou!");
                }
            }
        } else {
            System.out.println("Have a nice day Sir!");
        }
        input.close();
    }
}
