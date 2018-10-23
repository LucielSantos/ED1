package Aula5;

public class classTestes {
    public static void main(String[] args) {
        int vetor[]= {1,2,3,4,5};
        mostraMensagem();
        mostraMensagem("Luciel");
        System.out.println(soma(2,3));
        mostraVetor(vetor);
    }

    public static int soma(int a, int b){
        return a+b;
    }

    public static void mostraMensagem(){
        System.out.println("Boa noite");
    }

    public static void mostraMensagem(String nome){
        System.out.println("Boa noite "+nome);
    }

    public static void mostraVetor(int [] valores){
        for (int i=0;i<valores.length; i++){
            System.out.print(valores[i]);
        }
    }
}
