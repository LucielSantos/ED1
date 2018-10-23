package Aula5;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        System.out.print("Número: ");
        double resposta= imparPar(read.nextDouble());

        if (resposta == 0){
            System.out.println("0");
        }else {
            System.out.println("1");
        }

    }
     public static double imparPar(double numero){
        double n=0;
        n= numero % 2;
        return n;
     }
}
