package Aula2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        Aluno1 alunos[]= new Aluno1[5];

        float soma= 0f;
        float med;
        int i=0;

        while (i<5){
            Aluno1 a= new Aluno1();
            a.leia();
            soma= soma+a.nota;
            alunos [i]= a;
            i++;
        }

        med= soma / 5;
        System.out.println("Média das Notas: "+med);
        for (int b= 0; b<5; b++){
            if (alunos[b].nota>med){
                alunos[b].mostra();
            }
        }
    }
}