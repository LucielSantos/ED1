package Aula14;

import java.util.Scanner;

public class Contato {
    Scanner read= new Scanner(System.in);

    Contato anterior;
    Contato proximo;
    public String nome;
    public String profissao;
    public String endereço;
    public String email;
    public String telefone;

    public Contato getAnterior() {
        return anterior;
    }

    public void setAnterior(Contato anterior) {
        this.anterior = anterior;
    }

    public Contato getProximo() {
        return proximo;
    }

    public void setProximo(Contato proximo) {
        this.proximo = proximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Contato ler(){
        Contato contato= new Contato();
        System.out.print("Digite o Nome: ");
        contato.setNome(read.next());
        System.out.print("Digite o E-mail: ");
        contato.setEmail(read.next());
        System.out.print("Digite o Endereço: ");
        contato.setEndereço(read.next());
        System.out.print("Digite o telefone: ");
        contato.setTelefone(read.next());
        return contato;
    }
}
