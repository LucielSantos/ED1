package Aula9;

import java.util.Scanner;

public class Atividade {

    //comandos rua
    Carro rua[]= new Carro[10];

    public int topoRua=0;

    public void inicializarRua(){
        topoRua=-1;
    }
    public void pushRua(Carro c){
        topoRua++;
        c.cont++;
        rua[topoRua]=c;
    }
    public Carro popRua(){
        if (topoRua==-1){
            System.out.println("Rua Vazia");
            return null;
        }else {
            Carro temp = rua[topoRua];
            topoRua--;
            return temp;
        }
    }
    public void exibirRua(){
        if (topoRua>-1){
            for (int i=0; i<rua.length;i++){
                try {
                    System.out.print(rua[i].placa + ", " + rua[i].cont + " | ");
                }catch (Exception e){
                    System.out.print("Vaizo | ");
                }
            }
            System.out.println("");
            System.out.println(rua[topoRua].placa);
        }else{
            System.out.println("Rua Vazia");
        }
    }
    //comandos carro
    Carro estacionamento[]= new Carro[10];

    public int topo=0;


    public void inicializar(){

        topo= -1;
    }

    public void push(Carro c) {
        if (topo < 10){
            topo++;
            estacionamento[topo]= c;
        }else {
            System.out.println("Estacionamento Cheio!");
        }
    }

    public Carro pop(){
        if (topo==-1) {
            System.out.println("Estacionamento vazio!");
            return null;
        }else {
            Carro temp = estacionamento[topo];
            topo--;
            return temp;
        }
    }

    public void exibir(){
        if (topo>-1) {
            for (int i=0; i<estacionamento.length;i++){
                try {
                    System.out.print(estacionamento[i].placa + ", " + estacionamento[i].cont + " | ");
                }catch (Exception e){
                    System.out.print("Vaizo | ");
                }
            }
            System.out.println("");
            System.out.println(estacionamento[topo].placa);
        }else {
            System.out.println("Estacionamento Vazio");
        }
    }



    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String resposta="";
        String placa="";

        Atividade estacionamento= new Atividade();

        estacionamento.inicializar();
        estacionamento.inicializarRua();

        do {
            System.out.println("push - Adicionar Carro\n" +
                    "pop - Remover\n" +
                    "exibir - exibir\n" +
                    "q - Sair");
            System.out.print("Insira o Comando: ");
            resposta= read.next();

            switch (resposta){
                case "push":
                    System.out.print("Digite a placa: ");
                    placa= read.next();
                    Carro c= new Carro();
                    c.placa= placa;
                    estacionamento.push(c);
                    System.out.println("------------------------------");
                    break;
                case "pop":
                    if (estacionamento.topo>-1) {
                        System.out.print("Digite a placa: ");
                        placa = read.next();
                        int temp = estacionamento.topo;
                        for (int i = temp; i >= 0; i--) {
                            Carro retorno = estacionamento.pop();
                            if (!retorno.placa.equals(placa)) {
                                estacionamento.pushRua(retorno);
                            } else {
                                i = -1;
                                System.out.println("Placa Carro Removido: " + retorno.placa);
                                System.out.println("Manobras: " + retorno.cont);
                            }
                        }
                        int temp2 = estacionamento.topoRua;
                        for (int i = temp2; i >= 0; i--) {
                            Carro retorno = estacionamento.popRua();
                            estacionamento.push(retorno);
                        }
                    }else {
                        System.out.println("------------------------------");
                        System.out.println("Estacionamento Vazio!");
                    }
                    System.out.println("------------------------------");

                    break;
                case "exibir":
                    System.out.println("------------------------------");
                    estacionamento.exibir();
                    System.out.println("------------------------------");
                    estacionamento.exibirRua();
                    System.out.println("------------------------------");
                    break;
            }
        }while (!resposta.equals("q"));
        System.out.println("Você Saiu do Programa!");
    }
}