package Aula04;

public class Matriz {
    public static void main(String[] args) {
        int [] vetor = new int[10];
        int [][] matriz = new int[100][100];
        int l,c;

        int tam=10;
        l=0;
        c=0;
        for (l=0;l<tam;l++){
            for (c=0;c<tam;c++){
                matriz [l][c]=0;
            }
        }

        for (l=0;l<tam;l++){
            for (c=0;c<tam;c++){
                System.out.print(matriz[l][c]+" | ");
            }
        }
        matriz[l][c]=0;
        matriz[3][3]=10;



    }
}
