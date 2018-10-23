package MetodosMath;

import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        double numero, potencia;

        System.out.print("Digite o número: ");
        numero= read.nextDouble();
        System.out.print("Digite a potência: ");
        potencia= read.nextDouble();

        System.out.println("Resultado: "+Math.pow(numero, potencia));

    }
}
