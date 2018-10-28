package OrdenacaoDeDados;

import java.util.Arrays;
public class InsertShort {

 public static void main(String[] args) {
        int []vetor= {8,2,4,9,3,6};
        insertShort(vetor);
        System.out.println(Arrays.toString(vetor));
        }

        public static void insertShort(int []vetor){
            int a,b;
            for (int i=1; i<vetor.length;i++){
                a=vetor[i];
                b=i-1;
                while ((b>=0) && vetor[b]>a){
                    vetor[b+1]=vetor[b];
                    b--;
                }
                vetor[b+1]=a;
            }
        }
 }