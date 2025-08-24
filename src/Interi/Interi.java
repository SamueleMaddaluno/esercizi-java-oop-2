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


// Vogliamo realizzare una classe che contenga un elenco di interi e che ci permetta di ciclarli (dal primo all’ultimo).
// Dovrà offrire due metodi :
// - int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto all’ultima volta che è stato invocato. Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)
// - boolean hasAncoraElementi() (che deve restituire true se ci sono ancora elementi da restituire)
// La classe deve avere un costruttore che prende come parametro un array di interi (che sarà l’elenco che viene gestito internamente)
// Internamente alla classe vogliamo mantenere l’elenco di interi come array, no ArrayList o simili.
// Bonus :
// prevedere anche un costruttore che non prenda parametri e un metodo addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.
