package Studenti;

public class Corso {
    private String facoltà;

    public Corso(String facoltà){
        this.facoltà=facoltà;
    }

    public void iscrivi(Studente studente){
        System.out.println("lo "+ studente+" è iscritto al corso di "+facoltà);
    }
}
