package Aula14v2;

import java.util.Scanner;

public class Contato {
    Scanner read= new Scanner(System.in);

    String nome;
    String endereco;
    String profissao;

    Contato proximo;
    Contato anterior;

    public ListaMeios email;
    public ListaMeios telefones;

    public Contato(){
        email=new ListaMeios();
        telefones=new ListaMeios();
    }


    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
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

    /*public void ler(){
        System.out.print("Digite o Nome: ");
        this.setNome(read.next());
        System.out.print("Digite o Endereço: ");
        this.setEndereco(read.next());
        System.out.print("Digite a Profissão: ");
        this.setProfissao(read.next());

        System.out.print("Digite quantos E-mails terá: ");
        int p=read.nextInt();
        for (int i =0; i<p; i++) {
            Meios aux= new Meios();
            aux.ler("email");
            email.addMeios(aux);
        }

        System.out.print("Digite quantos Telefones terá: ");
        p=read.nextInt();
        for (int i=0; i<p; i++) {
            Meios aux= new Meios();
            aux.ler("telefone");
            telefone.addMeios(aux);
        }*/

    public boolean pergunta(){
        System.out.print("deseja adicionar mais(s/n)?");
        String resp= read.next();
        if (resp.equals("s")){
            return true;
        }else {
            return false;
        }
    }

    public void ler(){
        System.out.print("Digite o nome: ");
        this.setNome(read.next());
        System.out.print("Digite Endereço: ");
         this.setEndereco(read.next());
         System.out.print("Digite a Profissao: ");
         this.setProfissao(read.next());
        do {
            Meios mail= new Meios();
            mail.ler("email");
            email.add(mail);
        }while (this.pergunta());
        do {
            Meios fone= new Meios();
            fone.ler("fone");
            telefones.add(fone);
        }while (this.pergunta());

    }
}
