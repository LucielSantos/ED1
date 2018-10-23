package Aula1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Slide2 {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);

        double num[]= new double[5];
        int cod=0;

        for (int i=0; i<num.length; i++) {
            System.out.println("Digite o número "+i+": ");
            num[i]= read.nextDouble();
        }
        System.out.println("Cod. 0: Finaliza o programa \nCod. 1: Mostra vetor na ordem direta \n" +
                "Cod. 3: Mostra vetor na ordem inversa");
        System.out.println("Digite o Código: ");
        cod= read.nextInt();

        if (cod==1) {
            for (int a = 0; a < num.length; a++) {
                System.out.println(num[a]);
            }
        }

        if (cod==2){
            for (int b=5; b>0; b--){
                System.out.println(num[b]);
            }
        }
    }
}
