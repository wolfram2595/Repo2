package IntroducereInProgramare;

public class Variabile {
    public static void main(String[] args) {
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed - trebuie sa specificam tipul de date al variabilelor cu care lucram

        //System.out.println("Am cumparat o masina marca " + marcaMasina);
        //System.out.println("Este modelul " + modelMasina);

        // suprascrierea / override
        modelMasina = "XC 60 facelift";
        marcaMasina = "Volvo V1";

        //System.out.println("Am cumparat o masina marca " + marcaMasina);
        //System.out.println("Este modelul " + modelMasina);

        //declarare
        String nume;
        String prenume;
        //initializare
        prenume = "Sebastian";
        nume = "Corleone";
        int varsta = 27;
        // concatenare de stringuri
        System.out.println(nume + " " + prenume + " cu varsta de " + varsta + " de ani.");
    }
}
