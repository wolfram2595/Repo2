package IntroducereInProgramare;

public class Array {
    public static void main(String[] args) {
        // declarare si initilizare cand stim valorile
        String[] elevi = {"Gica", "Marius", "George", "Borcea", "Adina"};
        int[] note = {2, 5, 7, 9, 10};
        // contine mai multe elemente de acelasi tip
        // accesam elementele prin index, care incepe de la 0
        // are o dimensiune fixa
        // are proprietatea length care ne da dimensiunea array-ului


        elevi[2] = "Mirel"; // suprascriere
        System.out.println(elevi[2]);
        System.out.println(elevi.length);

        // putem sa ne jucam cu valorile din spate
        System.out.println(elevi[0] + " o fute pe " + elevi[4] + " si obtine nota " + note[0]);
        System.out.println(elevi.length + 5);

        // sa printam tot tp ultimul element indif de marime
        System.out.println("Cel mai prost din curtea scolii este: " + elevi[elevi.length-1]);

        // declarare si alocare de memorie
        int[] numere = new int[5]; // 0, 0, 0, 0, 0
        System.out.println(numere[1]);
    }
}
