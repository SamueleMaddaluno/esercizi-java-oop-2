package Utenti;

public class Utente {
    private String nome;
    private String email;

    public Utente (){}

    public String setNome(String nome){
        return this.nome=nome;
    }
    public String setEmail(String email){
        return this.email=email;
    }

    @Override
    public String toString() {
        return "L'utente registrato è "+nome+" tramite l'account mail "+email;
    }

  
    

    
    
}
