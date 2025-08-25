package Filtrabili;

import Interfacce.Filtrabile;
import java.util.ArrayList;
import java.util.List;
    public class FiltraIniziaConA implements Filtrabile {

        public FiltraIniziaConA(){}
        @Override
        public boolean accetta(String elemento){
            String iniziale=elemento.substring(0,1);
            if(iniziale.equalsIgnoreCase("a")){
                return true;
            }else{
                return false;
            }
        }
        
             public static List<String> filtraParola(List <String> parola,Filtrabile filtro){
                List<String> risultato = new ArrayList<>();
                for(String parole : parola){
                    if (filtro.accetta(parole)){
                        risultato.add(parole);
                    }
                }
                return risultato;
             }
        
       
        
    }
