package Aula5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        System.out.print("Digite primeiro número (par): ");
        double n1=read.nextInt();

        System.out.print("Digite segundo número (impar): ");
        double n2=read.nextInt();

        double imparParn1, imparParn2=0;
        imparParn1= Ex3.imparPar(n1);
        imparParn2= Ex3.imparPar(n2);

        if (imparParn1==0 && imparParn2==0){
            System.out.println("Soma: "+soma(n1,n2));
        }else {
            System.out.println("Os números não respondem aos requisitos!");
        }

    }

    public static double soma(double a, double b){
        return a+b;
    }
}
