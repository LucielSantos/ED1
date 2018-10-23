package Aula04;

import java.util.Scanner;

public class ClassEx1 {

    Scanner read= new Scanner(System.in);

    double g1=0;
    double g2=0;
    double media=0;

    public void mostra (){
        System.out.println("Digite a nota do G1: ");
        this.g1= read.nextDouble();
        System.out.println("Digite a nota do G2: ");
        this.g2= read.nextDouble();
        this.media= (this.g1+(this.g2*2))/3;
    }

}
