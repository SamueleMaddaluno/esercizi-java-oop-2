package Animali;

import Interfacce.Animale;

public class Gatto implements Animale{

    public Gatto(){}

    @Override 

public void verso(){
    System.out.println("il gatto fa miaoooo");
}

}
