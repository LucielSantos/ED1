package Aula14v2;

public class Lista {
    Contato inicio;
    Contato fim;
    int qtd;

    int adicoes;
    int edicoes;
    int remocoes;

    public void infoGeral(){
        System.out.println("Total de Contatos na agenda: "+this.qtd);
        System.out.println("Total de Adições: "+this.adicoes);
        System.out.println("Total de Edições: "+this.edicoes);
        System.out.println("Total de Remoções: "+this.remocoes);
    }

    public boolean addInicio (Contato c){
        if (this.inicio == null){
            this.inicio = c;
            this.fim = c;
            this.qtd ++;
            this.adicoes++;
            return true;
        } else {
            c.proximo = this.inicio;
            inicio.anterior = c;
            this.inicio = c;
            this.qtd++;
            return true;
        }

    }
    public boolean addFim(Contato c){
        if (this.inicio == null){
            return addInicio(c);
        }else{
            this.fim.proximo = c;
            c.anterior = this.fim;
            this.fim = c;
            this.qtd++;
            return true;
        }
    }

    public boolean addPosicao(Contato c, int p){
        if(this.inicio==null || p<=0){
            return addInicio(c);
        }
        if(p>=this.qtd){
            return addFim(c);
        }
        Contato aux = this.inicio;
        for(int i=0;i<p;i++){
            aux=aux.proximo;
        }
        c.anterior=aux.anterior;
        aux.anterior.proximo=c;
        c.proximo=aux;
        this.qtd++;
        return true;
    }

    public boolean editar(int n){
        if (this.inicio==null || n>this.qtd || n<0){
            return false;
        }else {
            Contato aux = this.inicio;
            for (int i = 0; i < n; i++) {
                aux = aux.proximo;
            }
            this.delPos(n);
            Contato novo= new Contato();
            novo.ler();
            this.addOrdem(novo);
            this.edicoes++;
            return true;
        }
    }

    public void mostrar(){
            Contato aux = this.inicio;
            if (aux==null){
                System.out.println("Lista Vazia");
            }else {
                for (int i = 0; i < this.qtd; i++) {
                    System.out.println("Nome: " + aux.getNome());
                    System.out.println("Endereço: " + aux.getEndereco());
                    System.out.println("Profissao: " + aux.getProfissao());
                    aux.email.listar();
                    aux.telefones.listar();
                    aux = aux.getProximo();
                }
            }

    }

    public int posicao(String nome){
        if (this.inicio==null){
            return -1;
        }else {
            Contato aux = inicio;
            int i = 0;
            while (aux.getNome().compareToIgnoreCase(nome) != 0 && i < qtd-1) {
                aux = aux.getProximo();
                i++;
            }
            if (aux.getNome().compareToIgnoreCase(nome) == 0) {
                return i;
            } else {
                return -1;
            }
        }
    }

    public void mostrarPosicao(int n){
        if (this.inicio==null || n>this.qtd || n<0){
            System.out.println("Contato não encontrado!");
        }else {
            Contato aux = this.inicio;
            for (int i = 0; i < n; i++) {
                aux = aux.proximo;
            }
            System.out.println(aux.toString());
            aux.email.listar();
            aux.telefones.listar();
        }
    }

    public boolean delInicio(){
        if (this.fim==null){
            return false;
        }
        if (this.inicio.proximo==null){
            this.inicio=null;
            this.fim=null;
            qtd--;
            this.remocoes++;
            return true;
        }else {
            Contato aux = inicio.proximo;
            this.inicio = aux;
            aux.anterior = null;
            qtd--;
            this.remocoes++;
            return true;
        }
    }

    public boolean delFim(){
        if (this.inicio==null || this.qtd==1){
            return delInicio();
        }else {
            Contato aux=this.fim;
            aux.anterior.proximo=null;
            fim=aux.anterior;
//            this.fim.proximo=null;
//            this.fim=this.fim.anterior;
            qtd--;
            this.remocoes++;
            return true;
        }
    }

    public boolean delPos(int p) {
        if (this.inicio == null || this.qtd == 1 || p >= qtd-1) {
            return delFim();
        } else {
            Contato aux = this.inicio;
            for (int i = 0; i < p; i++) {
                aux = aux.proximo;
            }
            if (p<0){
                return false;
            }else if (aux.getNome()==inicio.getNome()){
                inicio=inicio.getProximo();
                qtd--;
                this.remocoes++;
            }else {
                aux.proximo.anterior=aux.anterior;
                aux.anterior.proximo=aux.getProximo();
                qtd--;
                this.remocoes++;
            }
            return true;
        }
    }

    public boolean addOrdem(Contato c){
        int tamanho=0;
        Contato aux=this.inicio;

        if(this.inicio==null){
            return addInicio(c);
        }
        while(c.getNome().compareTo(aux.getNome()) >= 0 && tamanho != this.qtd){
            aux = aux.getProximo();
            tamanho++;
            if(tamanho == this.qtd)
                return addFim(c);
        }
        return addPosicao(c, tamanho);
    }

}


