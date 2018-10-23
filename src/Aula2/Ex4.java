package Aula2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        int x= 0;
        System.out.println("insira a quantidade de números:");
        x= read.nextInt();
        int num[]= new int[x];

        for (int i=0; i < x; i++){
            System.out.println("Insira o número: ");
            num[i]= read.nextInt();
        }
        System.out.println("Números em oredem Inversa: ");
        for (int b=num.length - 1; b >= 0; b--){
            System.out.println(num[b]);
        }
    }
}