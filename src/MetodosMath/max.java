package MetodosMath;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        double num1, num2;

        System.out.print("Primeiro número: ");
        num1= read.nextDouble();
        System.out.print("Segundo Número: ");
        num2= read.nextDouble();

        System.out.println("Maior Número: "+Math.max(num1, num2));
    }
}
