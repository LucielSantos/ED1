package Aula04;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {


        ClassEx3 classe= new ClassEx3();

        Scanner read= new Scanner(System.in);

        String saida;
        do {
            System.out.println("Menu do Programa \n" +
                    "a- Adicionar Carro\n" +
                    "b- Remover Carro\n" +
                    "c- Limpar Estacionamento\n" +
                    "d- Mostrar Estacionamento\n" +
                    "e- Sair");
            saida= read.next();

            switch (saida){
                case "a":
                    classe.saidaA();
            }
        }while (!saida.equals("e"));
    }
}
