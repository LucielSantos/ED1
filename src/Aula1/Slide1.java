package Aula1;

import java.util.Scanner;

public class Slide1 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        double temp[]= new double[8];
        double soma= 0;
        double med = 0;

        for (int i = 1; i<= 7; i++){
            System.out.println("Digite a temperatura do dia "+i+": " );
            temp[i]= read.nextDouble();
            soma= soma+temp[i];
        }

        med= soma/7;
        System.out.println(med);

        for (int a=0; a<temp.length; a++){
            if (temp[a] > med){
                System.out.println(temp[a]);
            }
        }
    }
}

