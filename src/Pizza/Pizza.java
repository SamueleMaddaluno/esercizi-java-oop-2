package Pizza;

public class Pizza {

    private String ingredienti="";

    public Pizza() {
    }

    public Pizza aggiungiPomodoro(){
        ingredienti+=" pomodoro ";
        return this;
    }

    public Pizza aggiungiMozzarella(){
        ingredienti += " mozzarella ";
        return this;
    }

    public Pizza aggiungiProdciutto(){
        ingredienti += " prosciutto ";
        return this;
    }

    public String getIngredienti() {
        return "la pizza è comoposta da: "+ingredienti;
    }
    
    
    


}
// Esercizio 1 - Costruzione di un oggetto con metodi fluenti
// Crea una classe `Pizza` che permetta di aggiungere ingredienti con metodi come:
// `Pizza aggiungiMozzarella();`, `Pizza aggiungiPomodoro();`, `Pizza aggiungiProsciutto();`
// Ogni metodo deve restituire lo stesso oggetto `Pizza` per permettere catene di chiamate come:
// `Pizza p = new Pizza().aggiungiMozzarella().aggiungiPomodoro();`
// L'obiettivo è far comprendere il concetto di metodi che ritornano `this`, spesso utilizzati in Java
// per implementare il pattern 'fluent interface'