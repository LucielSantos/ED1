package Aula04;

import java.util.Scanner;

public class ClassEx2 {
    Scanner read= new Scanner(System.in);

    int matriz[][]= new int[4][4];
    int l,c,n;
    String resposta;

    public void a(){
        System.out.println("Digite a linha:");
        l= read.nextInt();
        System.out.println("Digite a Coluna: ");
        c= read.nextInt();
        if (matriz[l][c]!=0){
            System.out.println("Já existe o valor " + matriz[l][c]+ " nesta posição");
            System.out.println("Insira o número que irá subustituir: ");
            n = read.nextInt();
            matriz[l][c] = n;
        }else {
            System.out.println("Insira o número que irá subustituir: ");
            n = read.nextInt();
            matriz[l][c] = n;
        }
    }

    public void b(){
        System.out.println("Digite a linha:");
        l= read.nextInt();
        System.out.println("Digite a Coluna: ");
        c= read.nextInt();
        matriz[l][c]=0;
    }

    public void c(){
        for (l=0; l<4; l++){
            for (c=0; c<4; c++){
                matriz[l][c]=0;
            }
        }
    }

    public void d(){
        for (l=0; l<4; l++){
            for (c=0; c<4; c++){
                System.out.print(matriz[l][c]+" | ");
            }
            System.out.println("");
        }
    }
}