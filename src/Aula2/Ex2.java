package Aula2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);


        float soma = 0f;
        float med;
        int x;
        int i = 0;

        System.out.println("Insira o Número de Notas:");
        x = read.nextInt();

        float nota[] = new float[x];

        while (i < x) {
            System.out.println("Insira a nota: ");
            nota[i] = read.nextFloat();
            soma = soma + nota[i];
            i++;
        }

        med = soma / x;

        int j= 0;
        System.out.println("Notas Abaixo da Média: ");
         while (j < x){
            if (nota[j] > med){
                System.out.println(nota[j]);
            }
            j++;
        }

        int k= 0;
        System.out.println("Notas Abaixo da Média:");
         while (k < x){
             if (nota[k] < med){
                 System.out.println(nota[k]);
             }
             k++;
         }
    }
}