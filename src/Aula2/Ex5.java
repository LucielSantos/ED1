package Aula2;

public class Ex5 {
    public static void main(String[] args) {

        int vetor[]= new int[50];
        int n=101;

        for (int i=0; i<vetor.length; i++){
            vetor[i]= n;
            n++;
        }

        for (int b=0; b<vetor.length; b++){
            System.out.println(vetor[b]);
        }
    }
}
