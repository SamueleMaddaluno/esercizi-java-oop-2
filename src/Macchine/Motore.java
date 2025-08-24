package Macchine;

public class Motore {

    public Motore() {
    }
    public void accendi(){
        System.out.println("Motore acceso");
    }
}




// Crea due classi: `Motore` e `Macchina`.
// La classe `Motore` deve avere un metodo `accendi()` che stampa "Motore acceso".
// La  classe  `Macchina`  deve  avere  un  metodo  `parti()`  che  crea  un  oggetto  `Motore`  e  chiama
// `accendi()`.
// Scopo:  comprendere  come  una  classe  può  collaborare  con  un’altra  per  svolgere  una  funzione
// più complessa