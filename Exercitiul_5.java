public class Electrocasnic {
    private String marca;
    private boolean functioneaza;

    public void porneste() {
        System.out.println("Electrocasnicul a fost pornit");
        functioneaza = true;
    }

    public void opreste() {
        System.out.println("Electrocasnicul a fost oprit");
        functioneaza = false;
    }
}
public class Mobila {
    private String tip;
    private int pret;

    public void asambleaza() {
        System.out.println("Mobilierul a fost asamblat");


    public void demonteaza() {
        System.out.println("Mobilierul a fost demontat");
    }
}
public class Profesie {
    private String nume;
    private int salariu;

    public void lucreaza() {
        System.out.println("Persoana lucrează în domeniul profesiei");
    }

    public void odihneste() {
        System.out.println("Persoana se odihnește după o zi de muncă");
    }
}
public class MijlocDeTransport {
    private String tip;
    private int vitezaMaxima;

    // Metode
    public void accelereaza() {
        System.out.println("Mijlocul de transport accelerează");
    }

    public void franeaza() {
        System.out.println("Mijlocul de transport frânează");
    }
}
public class Aliment {
    private String nume;
    private double pret;

    public void pregateste() {
        System.out.println("Alimentul este pregătit pentru consum");
    }

    public void consuma() {
        System.out.println("Alimentul este consumat");
    }
}
