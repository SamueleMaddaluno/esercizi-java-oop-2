package Filtrabili;

import Interfacce.Filtrabile;

public class FiltraparoleLunghe implements Filtrabile{
    
    public FiltraparoleLunghe(){}

    @Override

    public boolean accetta(String elemento){
        if (elemento.length()>5){
            return true;
        }else{
            return false;
        }
    }
}
