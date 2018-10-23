package MetodosMath;

import java.util.Scanner;

public class cbrt {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        double num;

        System.out.print("Digite o número: ");
        num= read.nextDouble();
        System.out.println("Raiz cúbica: "+ Math.cbrt(num));
    }
}
