package Aula04;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        ClassEx1 matriz[][]= new ClassEx1[4][4];

        int l,c;
        for (l=0;l<4;l++){
            for (c=0;c<4;c++){
                ClassEx1 nota= new ClassEx1();
                nota.mostra();
                matriz[l][c]=nota;
            }
        }

        for (l=0; l<4; l++){
            for (c=0; c<4; c++){
                if (matriz[l][c].media >= 7){
                    System.out.println("Média: "+matriz[l][c].media+" | APROVADO");
                }else if (matriz[l][c].media >= 6 && matriz[l][c].media < 7){
                    System.out.println("Média: "+matriz[l][c].media+" | EXAME");
                } else {
                    System.out.println("Média: "+matriz[l][c].media+" | REPROVADO");
                }
            }
        }
    }
}
