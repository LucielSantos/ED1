package Aula2;

import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
        int[][] matriz= new int[5][5];
        int l,c;
        int [] vetor= new int[25];

        for (l=0; l<5; l++){
            for (c=0;c<5;c++){
                Random rand= new Random();
                matriz[l][c]= rand.nextInt(10);
            }
        }

        int total=0;
        for (l=0;l<5;l++){
            for (c=0;c<5;c++){
                total+=matriz[l][c];
                System.out.print(matriz[l][c]+" | ");
            }
            System.out.println("");
        }
        System.out.println("média"+(total/25));
    }
}
