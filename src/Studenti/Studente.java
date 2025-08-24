package Studenti;

import java.util.Random;

public class Studente {
    private String nome;
    private String matricola;

    public Studente(String nome){
        this.nome=nome;
        String matricola="";
        Random ran=new Random();
        for(int i =0;i<15;i++){
            int cifra=ran.nextInt(9);
            matricola+=cifra;
        }
        this.matricola=matricola;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Studente{");
        sb.append("nome=").append(nome);
        sb.append(", matricola=").append(matricola);
        sb.append('}');
        return sb.toString();
    }


}



// Crea due classi: `Studente` e `Corso`.
// La classe `Studente` contiene informazioni come nome e matricola.
// La classe `Corso` deve avere un metodo `iscrivi(Studente studente)` che stampa un messaggio
// come:
// `Studente Mario iscritto al corso di Matematica`.
// Questo  esercizio  serve  per  esercitarsi  con  metodi  che  ricevono  oggetti  di  classi  custom  come
// argomenti