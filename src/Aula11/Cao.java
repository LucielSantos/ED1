package Aula11;

import java.util.Scanner;

public class Cao {
    Scanner read= new Scanner(System.in);

    private String nome;
    private int idade;
    private String raca;
    private Cao proximo;

    public Cao getProximo() {
        return proximo;
    }

    public void setProximo(Cao proximo) {
        this.proximo = proximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cao{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                '}';
    }

    public Cao ler(){
        Cao cao= new Cao();
        System.out.print("Insira o nome do Cão: ");
        cao.setNome(read.next());
        System.out.print("Insira a idade do Cão: ");
        cao.setIdade(read.nextInt());
        System.out.print("Insira a raça do Cão: ");
        cao.setRaca(read.next());
        return cao;
    }
}
