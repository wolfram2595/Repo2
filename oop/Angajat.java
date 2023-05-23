package oop;

//# tema
//        # clasa Angajat // done
//        # nume, prenume, salariu, vechime, functie // done
//        # constructor : nume, prenume, salariu, functie, vechime // done
//        # metode // concediu, crestere salariu in functie vechime, statusul angajatului, angajarea, anunt de angajare // done
//        # descriere => // done
//        # marire salariu in f de vechime // done
//        # actualizare vechime (param noua vechime) // done
//        # self.vechime = noua_vechime // done


import java.util.Scanner;

public class Angajat {
    String nume, prenume, functie;
    int aniVechime = 0;
    int nrConcedii = 0;
    double salariu;
    boolean inConcediu = false;

    public Angajat(String nume, String prenume, String functie) {
        this.nume = nume;
        this.prenume = prenume;
        this.functie = functie;
        if (functie.equals("Manipulant")) {
            System.out.println("Bine ai venit in firma " + this.nume + " " + this.prenume);
            this.salariu = 1500d;
            System.out.println("Pentru inceput " + this.nume + " " + this.prenume + " va fi remunerat cu " + this.salariu + " Euro, cu posibilitate de crestere peste 1 an.");
            System.out.println("---------------------------------------------------------------------");
        } else if (functie.equals("Curier")) {
            System.out.println("Bine ai venit in firma " + this.nume + " " + this.prenume);
            this.salariu = 2000d;
            System.out.println("Pentru inceput " + this.nume + " " + this.prenume + " va fi remunerat cu " + this.salariu + " Euro, cu posibilitate de crestere peste 1 an.");
            System.out.println("---------------------------------------------------------------------");
        } else if (functie.equals("TehnicianIT")) {
            System.out.println("Bine ai venit in firma " + this.nume + " " + this.prenume);
            this.salariu = 5000d;
            System.out.println("Pentru inceput " + this.nume + " " + this.prenume + " va fi remunerat cu " + this.salariu + " Euro, cu posibilitate de crestere peste 2 ani.");
            System.out.println("---------------------------------------------------------------------");
        } else if (functie.equals("Manager")) {
            System.out.println(this.nume+" "+this.prenume+" este Managerul Firmei noastre Instant Delivery 4You.");
            System.out.println("Managerul are 25% procent din incasarile firmei.");
            System.out.println("---------------------------------------------------------------------");
        } else {
            System.out.println("Cautam doar Curieri, Manipulanti si un TehnicianIT.");
            System.out.println("Nu il putem angaja pe " + this.nume + " " + this.prenume + " in functia de " + this.functie);
            System.out.println("---------------------------------------------------------------------");
        }
    }
    public void statusAngajat(){
        System.out.println("Angajat "+this.nume+" "+this.prenume+".");
        System.out.println("In functia de "+this.functie+".");
        System.out.println("Cu un salariu net de "+this.salariu+".");
        System.out.println("Cu o vechime de "+this.aniVechime +" ani lucrati in firma.");
        System.out.println("Status concediu "+inConcediu+".");
        System.out.println(this.nume+" "+this.prenume+" a fost in concediu de "+this.nrConcedii+" ori.");
        System.out.println("--------------------------------------------------------------------------");
        }
    public void vechime(int aniLucrati){
        if (aniLucrati == 1){
            System.out.println("Avand in vedere ca esti alaturi de noi de 1 an de zile "+this.nume+" "+this.prenume+".");
            System.out.println("Am hotarat sa iti crestem salariul cu 300 Euro.");
            this.aniVechime = 1;
            this.salariu = 1800;
            System.out.println("Astfel salariul tau net este de "+this.salariu+" si acum ai "+this.aniVechime+" ani vechime in firma noastra.");
            System.out.println("--------------------------------------------------------------------------");
        } else if (aniLucrati >= 2) {
            System.out.println("Pentru devotamentul tau "+this.nume+" "+this.prenume+".");
            System.out.println("Iti multumim ca esti alaturi de noi de atat de mult timp astfel salariul tau va fi de 2000 de Euro lunar.");
            this.aniVechime = 2;
            this.salariu = 2000;
            System.out.println("Astfel salariul tau net este de "+this.salariu+" si acum ai "+this.aniVechime+" ani vechime in firma noastra.");
            System.out.println("--------------------------------------------------------------------------");
        } else {
            System.out.println("Mai ai de munca pana sa ai si pretentii la marire "+this.nume+" "+this.prenume+".");
            System.out.println("--------------------------------------------------------------------------");
        }
    }
    public void cerereConcediu(String aprobiCererea){
        if (aprobiCererea.equals("Da")){
            System.out.println("Concediu placut "+this.nume+" "+this.prenume+", meriti.");
            this.inConcediu = true;
            this.nrConcedii = 1;
        } else {
            System.out.println("Du-te ba la munca puturosule!");
        }
    }
    public void anuntAngajare(String peCeSitePromovezi){
        if (peCeSitePromovezi.equals("olx")){
            System.out.println("Firma de curierat Instant Delivery 4You! cu renume international angajeaza noi colegi.");
            System.out.println("Suntem in cautare de Curieri Soferi, Manipulanti si un TehnicianIT");
            System.out.println("---------------------------------------------------------------------");
        } else {
            System.out.println("Angajez Curieri, Manipulanti pentru o firma de curierat cu renume international.");
            System.out.println("---------------------------------------------------------------------");
        }
    }
    public void concediere(){
        System.out.println(this.nume+" "+this.prenume+" a fost concediat din firma Instant Delivery 4You!");
    }
}
