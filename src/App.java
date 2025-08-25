
import Filtrabili.FiltraIniziaConA;
import Filtrabili.FiltraparoleLunghe;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
    //   Interi i1= new Interi(new int[]{1,2,3,4,5,6,7});
    //   i1.ciclo();
    //   System.out.println("il primo elemento è "+i1.getElementoSuccessivo());
    //   System.out.println("l'elemento successivo è "+i1.getElementoSuccessivo());
    //   System.out.println("l'elemento successivo è "+i1.getElementoSuccessivo());
    //   System.out.println("l'elemento successivo è "+i1.getElementoSuccessivo());
    //   System.out.println(i1.hasAncoraElementi());
    //   System.out.println("l'elemento successivo è "+i1.getElementoSuccessivo());
    //   System.out.println("l'elemento successivo è "+i1.getElementoSuccessivo());
    //   System.out.println("l'elemento successivo è "+i1.getElementoSuccessivo());
    //   System.out.println(i1.hasAncoraElementi());



     //  Pizza p=new Pizza().aggiungiMozzarella().aggiungiPomodoro().aggiungiProdciutto();
     //  System.out.println(p.getIngredienti());

        

      // Studente s1=new Studente("Marco Decimo");
      // Corso c1=new Corso("Biomeccanica");
      // c1.iscrivi(s1);
        

      // Quadrato q1=new Quadrato(5);
      // q1.calcola();
      // Rettangolo r1=new Rettangolo(5, 10);
      // r1.calcola();
      // System.out.println(q1.risultato(q1));


      // Macchina m1 = new Macchina();
      // m1.parti();
      // Macchina m2 = new Macchina();
      // m2.parti();

      // Utente u1 = new Utente();
      // u1.setNome("Fabio Grandi");
      // u1.setEmail("Fabio.grandi@gtat.com");
      // System.out.println(u1);
      

      // Animale [] animali = new Animale[2];
      // animali[0] = new Cane();
      // animali[1] = new Gatto();

      // for (int i = 0; i<animali.length;i++){
      //   animali[i].verso();
      // }


      // Contatore c1 = new Contatore();
      // c1.incrementa();
      // Controllore controllore = new Controllore();
      // controllore.eseguiIncremento(c1);
      // System.out.println("il numero del contatore è "+ c1.getContatore());

      List<String> l1=new ArrayList<>();
      FiltraparoleLunghe filtraparoleLunghe = new FiltraparoleLunghe();
      FiltraIniziaConA filtraA =new FiltraIniziaConA();
      l1.add("Cane");
      l1.add("Albero");
      l1.add("Amore");
      l1.add("Scimmia");
      l1.add("Carcere");
      l1.add("Uno");
      l1.add("Ancora");
      l1.add("Amo");

      System.out.println(l1);


      System.out.println( FiltraIniziaConA.filtraParola(l1, filtraparoleLunghe));
      System.out.println( FiltraIniziaConA.filtraParola(l1, filtraA));
      


      
    }
   
    
}