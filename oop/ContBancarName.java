package oop;

public class ContBancarName {
    public static void main(String[] args) {
        // desktop

        // initializam obiecte de tip ContBancar
        // instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Sebastian", "RO0001");
        ContBancar cont2 = new ContBancar("Elena", "Ro0002");


        // activam conturile si apelam metoda descrie
        cont1.activareCont(1234);
        cont1.alimentareCont(180);
        cont1.alimentareCont(50);
        cont1.interogareSold();
        cont2.activareCont(1325);
        cont2.activareCont(5555);
        cont2.activareCont(1234);
        cont2.alimentareCont(300);
        cont2.alimentareCont(500);
        cont2.interogareSold();

        // negative testing, cheltuim mai mult decat avem // corect
        cont1.debitareCont(500);

        // pozitiv cu suma exacta = sold 0 // pass
        cont1.debitareCont(230);
        cont1.interogareSold();

        // positive x2
        cont2.debitareCont(100);
        cont2.debitareCont(300);
        cont2.interogareSold();
    }
}
