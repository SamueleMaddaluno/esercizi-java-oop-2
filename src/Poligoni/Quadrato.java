package Poligoni;

import Interfacce.Calcolabile;

public class Quadrato implements Calcolabile {
    private int lato;
    private int area;

    public Quadrato(int lato){
        this.lato=lato;
    }

    @Override

    public int calcola(){
        return area=lato+lato;
    }

  public String risultato(Calcolabile calcolabile){
        return "il risultato del calcolo è " +area;
    }

}