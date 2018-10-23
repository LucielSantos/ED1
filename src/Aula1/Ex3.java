package Aula1;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Random gerador= new Random();

        String mes []= new String[12];

        int a=0;

        mes[0]= "Janeiro1";
        mes[1]= "Fevereiro";
        mes[2]= "Março";
        mes[3]= "Abril";
        mes[4]= "Maio";
        mes[5]= "Junho";
        mes[6]= "Julho";
        mes[7]= "Agosto";
        mes[8]= "Setembro";
        mes[9]= "Outubro";
        mes[10]= "Novembro";
        mes[11]= "Dezembro";

        a= gerador.nextInt(mes.length);

        System.out.println(mes[a]);


    }
}
