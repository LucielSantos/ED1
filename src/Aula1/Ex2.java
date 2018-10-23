package Aula1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double aluno []= new double[5];
        double notas = 0;
        double med = 0;

        for (int i = 0; i< aluno.length; i++){
            System.out.println("Digite a Nota do Aluno "+i+":");
            aluno[i]= read.nextDouble();
            notas= notas + aluno[i];
        }

        for(int a=0; a<aluno.length; a++){
            for (int b= a+1; b<aluno.length; b++){
                if (aluno[a]>aluno[b]){
                    double temp=aluno[b];
                    aluno[b]=aluno[a];
                    aluno[a]=temp;
                }
            }
        }

        System.out.println("Notas dos alunos em ordem de decrescente:");
        for (int c=0; c< aluno.length; c++){
            System.out.println(aluno[c]);
        }
        med= notas / 5;

        System.out.println("Média artimética das notas: " +med);


    }
}
