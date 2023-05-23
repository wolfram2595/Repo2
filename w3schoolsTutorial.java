public class w3schoolsTutorial { // incepe clasa
    public static void main(String[] args) { // incepe metoda main
/*
        float f1 = 35e1f; // "e" dintre numere inseamna 10, cifra de dupa  arata cate zerouri iar "f" vine de la float intimp ce "d" vine de la double
        double d1 = 12e4d;
        System.out.println(f1);
        System.out.println(d1);

        char x = 36;
        System.out.println("Bo"+x+x+"!");

        int a = 5;
        a &= 3;
        System.out.println(a);
*/
/*        int rnr = (int)(Math.random()*101);
        System.out.println(rnr);*/

        /*int timp = -10;
        if (timp <= 0){
            System.out.println("Ora nu poate fi negativa sau 0. Introdu o ora valida.");
        } else if (timp <= 12){
            System.out.println("Buna dimineata stapane. Sper ca ti-ai luat micul dejun.");
        } else if (timp <= 18){
            System.out.println("Buna ziua onorabile. spor la $$!");
        } else if (timp <=24) {
            System.out.println("Noapte buna venerabile. Vise umede!");
        } else {
            System.out.println("Unde doamne iarta-ma ai invatat sa citesti ceasul? Cu baietii de la salubris?");
        }*/
        // working if else if statement

        // simple if else statement
        /*int nr = -11;
        if (nr >= 0){
            System.out.println("Numarul este pozitiv.");
        } else {
            System.out.println("Numarul este negativ.");
        }*/

        // simplified if else
        /*int nr = -10;
        String rezultat = (nr > 0) ? "Numarul este pozitiv": "Numarul este negativ";
        System.out.println(rezultat);*/

        // Java For Loop
        // Cand cunosti exact de cate ori vrei sa treci prin loop
        // Foloseste un for loop in loc de un while loop
        /*for (int i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        }*/

        // nested loops
        // este posibil sa plasam un loop intr-un alt loop iar asta se numeste nested loops
        // outer loop
        /*for (int i = 1; i <= 2; i++){
            System.out.println("-------------");
            System.out.println("Outer: " + i);

            // inner loop
            for (int j = 1; j <= 3; j++){
                System.out.println("Inner: " + j);
            }
        }*/

        // exista un for each loop, care este folosit exclusiv pentru a trece prin elementele dintr-un array
        /*for (type variableName : arrayName) {
            // bloc de cod
        }*/
        /*String [] cars = {"Volvo", "BMW", "Mercedes-Benz", "Volkswagen"};
        for (String i : cars){
            System.out.println(i);
        }*/

        // java break and continue
        // am vazut deja afirmatia break in exemplele cu for.
        // acolo l-am folosit sa sarim dintr-o fraza switch
        // dar afirmatia break poate fi folosita si sa sarim dintr-un loop
        // exemplul de jos opreste loop-ul atunci cand i este egal cu 4
        /*for (int i = 0; i < 10; i++){
            if (i == 4){
                break;
            }
            System.out.println(i);
        }*/
        // expresia continue rupe o repetare dintr-un loop daca conditia specificata este atinsa
        // si continua cu urmatoarea repetare din loop
        // exemplul acesta sare peste valoarea 4 so continua loop-ul
        // astfel va returna 0,1,2,3,5,6,7,8,9
        /*for (int i = 0; i < 10; i++){
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }*/
        // break and continue in while loop
        // expresiile break si continue pot fi folosite si in while loops
        /*int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
            if (i == 4){
                break;
            }
        }*/
        // se va returna 0,1,2,3
        /*int i = 0; // declaram integerul i = 0
        while (i < 10){ // atata timp cat i este mai mic decat 10 continua loop-ul
            if (i == 4){ // daca i este egal cu 4 atunci
                i++; // creste valoarea lui i cu 1
                continue; // scoate conditia din loop si continua loop-ul
            }
            System.out.println(i); // printeaza-i valoarea lui i
            i++; // creste valoarea lui i cu 1
        }*/
        // initial i va fi 0 deci este mai mic decat 10 si va continua loop-ul
        // ajungem la if si conditia nu este indeplinita fiindca i nu este egal cu 4
        // sarim peste if si ajungem la final unde printam valorea lui i si ii crestem valoarea cu 1
        // loop-ul o ia de la capat
        // cand i ajunge la valoarea egala cu 4 intra in blocul de cod a lui if
        // aici ii creste o data valoarea lui i cu 1 astfel i devine 5
        // continua loop-ul neprintand conditia adevarata
        // il printeaza pe 5 si ii creste valoarea lui i cu 1
        // loop-ul o ia de la capat pana ajunge sa printeze 9
        // dupa ce a printat 9 i se creste valoarea lui i cu 1 iar cand loop-ul incepe de la capat
        // i nu mai este mai mic decat 10 astfel se opreste loop-ul

        // Java Arrays
        // Arrays sunt folosite sa stockeze mai multe valori intr-o singura variabila
        // in loc declaram variabile diferite pentru fiecare valoare.
        // Pentru a declara un array, defineste tipul de variabila cu paranteze patrate []
        /*String [] masini;*/
        // Tocmai am declarat o variabila care tine un Array de Strings.
        // Ca sa ii dam valori, pune valorile intre paranteze tuguiate {}
        /*String [] masini = {"BMW", "Dacia", "Volkswagen", "Honda"};
        // Pentru un Array de Integer, poti scrie:
        int[] aniProductie = {2003, 1989, 1999, 2005};

        // Accesam un element din Array prin intermediul indexului sau
        // Indexul din array incepe cu 0, [0]acesta fiind primul ement, [1]al doilea element
        System.out.println(masini[0]);
        // Va returna BMW

        // Suprascrierm un element dintr-un array folosindu-ne de indexul elementului
        masini [0] = "Mazda";
        System.out.println(masini[0]);

        // Afla cate elemente sunt intr-un array, folosind proprietatea "length" :
        System.out.println(masini.length);
        // Va returna 4*/

        // Poti parcurge elementele unui Array cu un for loop,
        // utilizand proprietatea length sa specifici de cate ori sa ruleze
        // Exemplul urmator returneaza toate elementele din Array-ul masini
        /*for (int i = 0; i < masini.length; i++) {
            System.out.println(masini[i]);
        }
        System.out.println("----------------------");
        // Scris mai simplu cu un for each:
        for (String m : masini){
            System.out.println(m);
        }
        // Returneaza Mazda, Dacia, Volkswagen si Honda
*/
        // Array multidimensional care este un Array intr-un array.
        // Array ul multidimensional este folositor cand vrei sa stochezi date intr-un format tabel cu randuri si coloane
        // Sa creezi un two-dimensional array, adauga fiecare array in propriul set de {}:
        /*int [][] numere = {{1,3,5,7,9}, {2,4,6,8}};
        // numere este acum un array cu doua arrays ca si elementele sale

        // Acceseaza elementele array-ului numere specificand doi indexi:
        // unul pentru array si celalalt pentru elementul din interiorul acelui array.
        // Exemplul acceseaza al treilea element (2) in al doilea array (1) din numere
        System.out.println(numere[1][2]);

        // Suprascriem valoarea unui element:
        numere[1][2] = 5;
        System.out.println(numere[1][2]);
*/
        // Loop printr-un array multidimensional
        // Cu ajutorul unui for loop intr-un alt for loop
        int [][] numere = {{1,3,5,7,9}, {2,4,6,8}};
        for (int i = 0; i < numere.length; ++i){
            for (int j = 0; j < numere[i].length; ++j){
                System.out.println(numere[i][j]);
            }
        }
    } // se termina metoda main
} // se termina clasa
