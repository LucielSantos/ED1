package ListaEncadeada02;

public class Main {
    public static void main(String[] args) {
        Funcoes funcao= new Funcoes();

        funcao.inicializar();

        funcao.inserir(123);
        funcao.inserir(456);
        funcao.inserir(789);
        funcao.exibir();

        funcao.removerMeio(456);
        System.out.println("");
        funcao.exibir();

        funcao.removerInicio();
        System.out.println("");
        funcao.exibir();
    }
}
