package Aula04;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        ClassEx2 matriz= new ClassEx2();

        String saida;

        do {
            System.out.println("Menu do Programa \n" +
                    "a- Adicionar elemento\n" +
                    "b- Remover elemento(coloca o valor 0)\n" +
                    "c- Limpar Matriz\n" +
                    "d- Mostrar Matriz\n" +
                    "e- Sair");
            saida= read.next();
            switch (saida){
                case "a":
                    matriz.a();
                    break;

                case "b":
                    matriz.b();
                    break;

                case "c":
                    matriz.c();

                case "d":
                    matriz.d();
                    break;
            }
            System.out.println("---------------------");
        }while (!saida.equals("e"));
    }
}
