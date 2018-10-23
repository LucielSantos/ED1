package MetodosMath;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        double num;

        System.out.print("Digite o número: ");
        num= read.nextDouble();

        System.out.println("Raiz Quadrada do número: "+Math.sqrt(num));
    }
}