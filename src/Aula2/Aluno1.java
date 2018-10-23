package Aula2;

import java.util.Scanner;

public class Aluno1 {
    Scanner read= new Scanner(System.in);

    String nome;
    float nota;

    public void mostra(){
        System.out.println(this.nome);
        System.out.println(this.nota);
    }

    public  void leia (){
        System.out.println("Insira o nome do Aluno: ");
        this.nome= read.next();
        System.out.println("Insira a nota do aluno: ");
        this.nota= read.nextFloat();
    }
}
