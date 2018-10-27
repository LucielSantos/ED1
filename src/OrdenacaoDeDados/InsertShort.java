package OrdenacaoDeDados;

import java.util.Arrays;
public class InsertShort {


 public static void main(String[] args) {
        int []vetor= {8,2,4,9,3,6};
        insertShort(vetor);
        System.out.println(Arrays.toString(vetor));
        }

        public static void insertShort(int vetor[]){
            int a,b;
            for (int i=1; i<vetor.length; i++){
                a=vetor[i];
                b=i-1;
                while ((b>=0) && vetor[b]>a){
                    vetor[b+1]=vetor[b];
                    b--;
                }
                vetor[b+1]=a;
            }
        }

//        private static void insertionSort(int []v) {
//            int x,j;
//            for (int i=1; i<v.length; i++){
//                x = v[i];
//                j = i-1;
//                while ((j>=0) && v[j]>x){
//                    v[j+1]=v[j];
//                    j=j-1;
//                }
//                v[j+1]=x;
//            }
//        }
    }