package Aula14v2;

import java.util.Scanner;

public class Contato {
    Scanner read= new Scanner(System.in);

    String nome;
    String endereco;
    String profissao;

    Contato proximo;
    Contato anterior;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderço() {
        return endereco;
    }

    public void setEndereco(String enderço) {
        this.endereco = enderço;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Contato getProximo() {
        return proximo;
    }

    public void setProximo(Contato proximo) {
        this.proximo = proximo;
    }

    public Contato getAnterior() {
        return anterior;
    }

    public void setAnterior(Contato anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }

    public void ler(){
        System.out.print("Digite o Nome: ");
        this.setNome(read.next());
        System.out.print("Digite o Endereço: ");
        this.setEndereco(read.next());
        System.out.print("Digite a Profissão: ");
        this.setProfissao(read.next());
    }
}
