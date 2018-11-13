package Aula14v2;


import java.util.Scanner;

public class Meios {
    Scanner read =new Scanner(System.in);

    Meios proximo;
    Meios anterior;

    String dado;
    String tipo;

    public Meios getProximo() {
        return proximo;
    }

    public void setProximo(Meios proximo) {
        this.proximo = proximo;
    }

    public Meios getAnterior() {
        return anterior;
    }

    public void setAnterior(Meios anterior) {
        this.anterior = anterior;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Meios{" +
                "dado='" + dado + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public void ler(String tipo){

        if (tipo.equals("email")){
            this.setTipo("email");
            System.out.print("Digite o email: ");
            this.setDado(read.next());
        }else {
            this.setTipo("Telefone");
            System.out.print("Digite o telefone: ");
            this.setDado(read.next());
        }

    }
}

