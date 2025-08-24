package Poligoni;

import Interfacce.Calcolabile;

public class Rettangolo implements Calcolabile{
    private int base;
    private int altezza;
    private int area;
    public Rettangolo(int base,int altezza) {
        this.base=base;
        this.altezza=altezza;
    }

    @Override

    public int calcola(){
        return area=base+altezza;
    }
    public String risultato(Calcolabile calcolabile){
        return "il risultato del calcolo è " +area;
    }

}
