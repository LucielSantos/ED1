package Aula5;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        int consoantes=0;

        System.out.print("Frase: ");
        consoantes= alterarConsoantes(read.next());

        System.out.println(consoantes);
    }

    public static int alterarConsoantes(String frase){
        frase.toLowerCase();
        int contador=0;

        String consoantes= "bcdfghjklmnpqrstvxwyz";
        for (int i=0; i<frase.length();i++){
            char x= frase.charAt(i);
            for (int y=0; y<consoantes.length(); y++){
                char z= consoantes.charAt(y);
                if (x==z){
                    contador++;
                }
            }
        }
        return contador;
    }
}
