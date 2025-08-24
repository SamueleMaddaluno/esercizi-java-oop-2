package Interfacce;

public interface Filtrabile {
    public boolean accetta(String elemento);
}



// Definisci un’interfaccia `Filtrabile` con un metodo `boolean accetta(String elemento);`
// Implementa due classi:
// - `FiltraParoleLunghe` che accetta solo parole con più di 5 lettere.
// - `FiltraIniziaConA` che accetta solo parole che iniziano con 'A'.
// Scrivi un metodo che prende una lista di parole e un oggetto `Filtrabile`,
// e restituisce una nuova lista con solo le parole accettate.
// Serve a capire come le interfacce possono essere usate per personalizzare il comportamento