package IntroducereInProgramare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste { // incepe clasa
    public static void main(String[] args) { // incepe mainul
        // declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // au o dimensiune dinamica

        // adaugam elemente in lista
        fructe.add("Mar");
        fructe.add("Pruna");
        fructe.add("Para");

        // cum se iau elemente
        fructe.get(0);
        System.out.println(fructe.get(0));

        // cum se afla indexul unui element
        System.out.println(fructe.indexOf("Pruna"));

        // este lista goala? raspuns: false, nu
        System.out.println(fructe.isEmpty());

        /* verificam daca avem stoc de fructe
           daca avem stock nu aprovizionam
           daca stockul este gol, facem aprovizionarea
        */
//        // eliminam lista
//        fructe.clear();

        // scoatem un element
        fructe.remove("Mar");

        // listam elementele
        System.out.println(fructe);

        // aflam dimensiunea listei
        System.out.println(fructe.size());

        if (!fructe.isEmpty()) {
            System.out.println("Avem stoc de fructe");
        } else
            System.out.println("Facem aprovizionarea");

        // declaram o lista imutabila si o initializam cu valori
        List<String> prenume = Arrays.asList(new String[]{"Mircea", "Radu"});
        List<Integer> numere = Arrays.asList(new Integer[]{1, 2});
        System.out.println(numere);

        // declaram o lista dinamica
        String[] flori = {"Trandafiri", "Violete", "Papadii", "Lalele"};
        List<String> listaflori = new ArrayList<>(Arrays.asList(flori)); // parcurge sirul de flori si le transforma in lista
        listaflori.add("Crizanteme"); // adaugam crizanteme pe lista cu flori
        System.out.println(listaflori);

        // aflam unde este Papadii
        int papadii_index = listaflori.indexOf("Papadii");
        // stergem ce este in acea pozitie
        listaflori.remove(papadii_index);

        // scoatem in functie de valoare
        System.out.println(listaflori);
    } // se termina mainul
} // se termina clasa
