package Aula13;

public class Test {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista= new ListaDuplamenteEncadeada();
        Elemento elemento= new Elemento();

        lista.add(elemento.ler());
        lista.add(elemento.ler());
        lista.add(elemento.ler());

        lista.mostrar();

        lista.addPosicao(elemento.ler(), 1);

        lista.mostrar();

        lista.dePos(10);

        System.out.println("--");
        lista.mostrar();


    }
}
