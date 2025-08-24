package Interi;



public class Interi {

    private int[] elencoInteri;
    private int indiceCorrente;

    public Interi(int [] elencoInteri){
        this.elencoInteri=elencoInteri;
    }
    public void setInteri(int indice, int intero){
        elencoInteri[indice]=intero;
    }

    public void ciclo(){
        for(int i=0;i<elencoInteri.length;i++){
            System.out.println(elencoInteri[i]);
        }
    }
        

    
    public int getElementoSuccessivo(){
        return elencoInteri[indiceCorrente++];
    }
    public boolean hasAncoraElementi(){
        if (indiceCorrente<elencoInteri.length){
            return true;
        }
        else{
            return false;
        }
    }
}
