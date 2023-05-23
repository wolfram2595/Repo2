package oop;

public class ContBancar {
    //program files = definim logica unui cont bancar

    // oop = object oriented programming
    // poo = programare orientata pe obiecte

    // o clasa = este un tip nou
    // este definitia unui concept
    // reteta la paste carbonara, blueprintrul, ADN-ul uman
    // ex: clasa Car

    // un obiect = instanta unei clase
    // paste carbonara, un om
    // ex: 10 obiecte de tip Car

    // fields = proprietati = atribute
    // variabilele
    // ex: culoare, marca, consum, pret

    // metode - actiuni ce pot fi facute de obiecte
    // functii
    // ex: accelereaza() , franeaza() , deschideusa(), vopsire()

    // proprietatile - fields - atributele
    String titularCont; String iban;
    double sold;
    boolean activ = false;
    private int pin = 1234;
    int incercariActivare = 0;

    // constructor = are rolul de a impune date de start
    // ca si * din formulare, required fields

    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    // metode
    public void interogareSold(){
        System.out.println("Honored User "+this.titularCont);
        System.out.println("IBAN No. "+this.iban);
        System.out.println("Sold Curent: "+this.sold);
        System.out.println("Acount is Active? "+this.activ);
        System.out.println("Nr. incercari gresite: "+this.incercariActivare);
        System.out.println("-----------------------------------------------");
    }

    public void activareCont(int pinUtilizator) {
        // modifica activ in true doar daca pin ul e corect
        System.out.println("Hello "+this.titularCont);
        if (pinUtilizator == this.pin) {
            System.out.println("Cont Activat.");
            this.activ = true;
        } else {
            System.out.println("Pin Gresit!");
            this.incercariActivare++; // incrementeaza, creste valoarea cu 1
        }
    }
    public void alimentareCont(int sumaDepusa){
            // la ce aveam in cont (this.sold) se mai adauga suma depusa
            this.sold = this.sold + sumaDepusa;
            System.out.println("Hello "+this.titularCont);
            System.out.println("Ati depus cu succes suma de: " + sumaDepusa + "." + "Sold curent: " + this.sold);
    }
    public void debitareCont(double sumaCheltuita) {
        // pot cheltui doar ce am
        // daca suma cheltuita este <= sold
        if (sumaCheltuita <= this.sold){
            // se modifica soldul
            this.sold = this.sold - sumaCheltuita;
            System.out.println("Ai cheltuit "+sumaCheltuita);
            System.out.println("Sold curent "+this.sold);
        } else {
            System.out.println("Fonduri insuficiente Cabron!");
        }
    }
}
