package Aula5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        String frase;

        System.out.println("Frase: ");
        frase= read.next();

        System.out.print(contaVogais(frase));

    }

    public static int contaVogais (String texto){
        int contador= 0;
        texto.toLowerCase();
        for (int i=0; i<texto.length();i++){
            char c= texto.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                contador++;
            }

        }
        return contador;
    }
}
