package Aula13;

import java.util.Scanner;

public class Elemento {
    Scanner read=new Scanner(System.in);
    public Elemento anterior;
    public int valor;
    public Elemento proximo;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Elemento ler(){
        Elemento elemento= new Elemento();
        System.out.print("Digite o Elemento: ");
        elemento.setValor(read.nextInt());
        return elemento;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "valor=" + valor +
                '}';
    }
}
