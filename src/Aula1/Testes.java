package Aula1;

public class Testes {

    public static void main(String[] args) {


        double salarios[]= new double[10];
        String alunos[]= {"Josiel", "Daniela","Rafaela"};
        int idades[];
        idades=new int[10];

        System.out.println(alunos.length);
        System.out.println(salarios.length);
        salarios[0]=1000;
        salarios[1]=2000;

        for (int i=0;i< salarios.length; i++){
            salarios[i]=1000;//scanner
        }

        for (int i=0;i< salarios.length; i++){
            System.out.println(salarios[i]);
        }


    }
}
