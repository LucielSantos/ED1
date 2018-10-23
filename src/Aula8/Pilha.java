package Aula8;

import java.util.Scanner;

public class Pilha{
    static int vetor[]= new int[10];
    static int topo=0;

    public static void inicializar(){

        topo=-1;
    }
    public static void push(int valor){
        topo++;
        vetor[topo]= valor;
    }
    public static void pop(){
        if (topo==-1){
            System.out.println("Erro, pilha menor que 0!");
        }else {
            topo--;
        }
    }
    public static void exibir(){
        if (topo==-1){
            System.out.println("Erro, pilha menor que 0!");
        }else {
            System.out.println(vetor[topo]);
        }
    }
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String resposta;
        inicializar();

        do {
            System.out.print("Escolha: exibir, push, pop ou sair: ");
            resposta = read.next();
            if (resposta.equals("exibir")) {
                exibir();
            }
            if (resposta.equals("push")) {
                System.out.print("Insira o valor: ");
                int n = read.nextInt();
                push(n);
            }
            if (resposta.equals("pop")) {
                pop();
            }
        } while (!resposta.equals("sair")) ;


    }
}
