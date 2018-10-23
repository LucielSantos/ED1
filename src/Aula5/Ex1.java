package Aula5;

public class Ex1 {
    public static void main(String[] args) {
        int vetor []= {1,2,3,4,5};
        soma(vetor);

    }

    public static void soma(int a []){
        int resultado=0 ;
        for (int i=0; i<a.length; i++){
            resultado= resultado+ a[i];
        }
        System.out.println(resultado);
    }
}
