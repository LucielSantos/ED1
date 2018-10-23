import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Padrao {
    public static void main(String[] args) {
        int tam=200;
        int matriz[][]= new int[tam][tam];
        int l, c=0;
        int contador=0;
        Random rand= new Random();

        for (l=0; l<matriz.length;l++){
            for (c=0; c<matriz.length; c++){
                matriz[l][c]= rand.nextInt(2);
            }
        }

        for (l=0; l<matriz.length;l++){
            for (c=0; c<matriz.length; c++){
                System.out.print(matriz[l][c]+"|");
            }
            System.out.println("");
        }

        long t = System.nanoTime();
        for (l=0; l<matriz.length-1;l++){
            for (c=0; c<matriz.length-1; c++){
                if (matriz[l][c] == 1 && matriz[l][c+1] == 1 && matriz[l+1][c] == 1 && matriz[l+1][c+1]== 0){
                    contador++;
                }
            }
        }
        long x= System.nanoTime()-t;

        System.out.println("Padrões: "+contador);
        System.out.println("Tempo: "+x);

    }
}