package IntroducereInProgramare;

public class While { // incepe clasa
    public static void main(String[] args) { // incepe main ul
        // while - loop, cliclu repetitiv
        // zona de cod care se repeta atat timp cat o conditie e true

        // problema: masina merge cat timp inca are benzina
        int litri_benzina = 10;
        while (litri_benzina >0) {
            // acceleram
            System.out.println("Masina merge");
            // scadem benzina
            litri_benzina = litri_benzina - 1;
            // aprindem beculetul de benzina cand e <= 3 litri
            if (litri_benzina <= 3) {
                System.out.println("Ding, ding, ding");
            }
        }
        System.out.println("Am ramas fara benzina!");
    } // se termina main ul
}// se termina clasa