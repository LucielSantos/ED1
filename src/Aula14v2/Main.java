package Aula14v2;

public class Main {
    public static void main(String[] args) {
     Lista lista= new Lista();
     Contato um= new Contato();
     Contato dois= new Contato();
     Contato tres= new Contato();

     um.ler();
     dois.ler();
     tres.ler();

     lista.add(um);
     lista.add(dois);
     lista.add(tres);

     lista.mostrar();

      System.out.println(lista.posicao("b"));

      lista.delPos(lista.posicao("c"));

      lista.mostrar();
    }
}
