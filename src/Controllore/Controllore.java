package Controllore;

import Contatori.Contatore;

public class Controllore {

    public Controllore() {
    }
    
    public void eseguiIncremento(Contatore contatore){
        contatore.incrementa();
        contatore.incrementa();
        contatore.incrementa();
    }
}
