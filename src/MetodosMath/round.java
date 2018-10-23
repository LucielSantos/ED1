package MetodosMath;

import java.util.Scanner;

public class round {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        double num;

        System.out.print("Digite o número: ");
        num=read.nextDouble();

        System.out.println("Arredondado: "+Math.round(num));
    }
}
