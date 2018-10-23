package Aula2;

import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {

        int vetor[]= new int[50];

        Random gerador= new Random();

        for (int i = 0; i<vetor.length;i++){
            vetor[i]= gerador.nextInt(vetor.length);
            System.out.println(vetor[i]);
        }
    }
}