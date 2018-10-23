package Aula04;

import java.util.Scanner;

public class ClassEx3 {
    Scanner read= new Scanner(System.in);

    String modelo;
    String placa;
    String cor;

    int l,c;

    ClassEx3 [][] estacionamento= new ClassEx3[3][3];

    public void saidaA(){
        System.out.println("Dgite a Linha que deseja adicionar: ");
        l= read.nextInt();
        System.out.println("Dgite a Coluna que deseja adicionar: ");
        c= read.nextInt();
//        if (!estacionamento[l][c].equals(null))) {
//            System.out.println("Já existe o carro de placa "+estacionamento[l][c].placa+"nesta posição.");
//        }
        System.out.println("Insira o modelo do Carro: ");
        estacionamento[l][c].modelo = read.next();
        System.out.println("Insira a Cor do Carro: ");
        estacionamento[l][c].cor = read.next();
        System.out.println("Insra a placa do Carro: ");
        estacionamento[l][c].placa = read.next();
    }
}
