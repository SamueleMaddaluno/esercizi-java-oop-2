package Contatori;

public class Contatore {
    private int contatore;

    public Contatore() {
    }

    

    public int incrementa(){
       return  contatore++;
    }

    public int getContatore(){
        return contatore;
    }
}




// Crea due classi: `Contatore` con un metodo `incrementa()` che aumenta un contatore interno,
// e  `Controllore`  con  metodo  `eseguiIncremento(Contatore  c)`  che  chiama  `c.incrementa()`  tre
// volte.
// Obiettivo: far vedere come una classe può operare su un'altra classe custom e modificare il suo
// stato