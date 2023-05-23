package IntroducereInProgramare;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class Maps { // incepem clasa
    public static void main(String[] args) { // incepem main-ul
        // map = reprezentare de date in sistem cheie valoare
        // exemplu: Mircea are nota 10, Catalin are nota 5

        // declaram un map
        Map<String,Integer> nr_agent = new HashMap<>();

        // adaugam elemente
        nr_agent.put("Gabriel", 1);
        nr_agent.put("Sebastian", 2);
        nr_agent.put("Elena", 3);

        // sa aflu notele
        System.out.println("Gabriel este agentul nr " + nr_agent.get("Gabriel"));

        // actualizam topul agentilor
        nr_agent.replace("Gabriel", 2);
        System.out.println("Gabriel este agentul nr "+nr_agent.get("Gabriel"));

        // aflam dimensiunea
        nr_agent.remove("Sebastian");
        System.out.println(nr_agent.get("Sebastian"));

        // declaram si initializam cu valori
        // map ul nu este ordonat
        Map<String,Integer> Luni = new HashMap<>();
         Luni.put("Jan", 1);
         Luni.put("Feb", 2);
         Luni.put("Mar", 3);
        System.out.println(Luni);
    } // se termina main-ul
} // se termina clasa
