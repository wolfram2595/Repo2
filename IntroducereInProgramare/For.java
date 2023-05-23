package IntroducereInProgramare;

public class For { // incepe clasa
    public static void main(String[] args) { // incepe main ul
        // for - loop, str repetititva
        // de unde incepem?
        // pana unde mergem?
        // pasul de parcurgere?
        // problema: printam 101 dalmatieni
//        for (int i = 1; i <= 101; i++) {
//            // i = 1
//            System.out.println("Dalmatianul cu nr " + i);
//        }
//
        // ne ajuta sa parcurgem un array prin intermediul indexului
        int [] arici = {3, 5, 7, 8}; // arici [0] = 3
        for (int i=0; i < arici.length; i++) {
            System.out.println("Ariciul cu numarul " + i + " a trecut linia de finish si a castigat numarul de biscuiti: " + arici[i]);
        }

        // for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar : arici) {
            System.out.println("Numarul este "+ numar);
        }

        // parcurgem array de culori
        String[] culori = {"Rosu", "Alb", "Galben"};
        for (String culoare : culori) {
            System.out.println("Culoarea actuala este " +culoare);
        }

        // suma numerelor din array
        int s = 0;
        for (int numar : arici) { // s=3, s = 3+7, s= 10+10,
            s = s + numar;
        }
        System.out.println(s);

    } // se termina main ul
} // se termina clasa
