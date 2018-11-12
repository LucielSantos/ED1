package Aula14;

public class Lista {

    Contato inicio;
    Contato fim;
    int qtd;
    int remov;
    int add;

    public void add(Contato contato){
        if (this.inicio==null){
            this.inicio=contato;
            this.fim=contato;
            qtd++;
        }else {
            contato.setAnterior(this.fim);
            this.fim.setProximo(contato);
            this.fim=contato;
            this.qtd++;
        }
    }

    public void listar(int n){
        if (this.inicio==null){
            System.out.print("Lista Vazia");
        }else {
            
        }
    }
}
