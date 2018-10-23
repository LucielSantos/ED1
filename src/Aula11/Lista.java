package Aula11;

public class Lista {
    public Cao inicio;
    public Cao fim;
    public int qtd= 0;

    public void listar(){
        Cao aux= inicio;
        if (aux==null){
            System.out.println("Lista Vazia!");
        }else {
            do {
                System.out.println(aux.toString());
                aux = aux.getProximo();
            } while (aux != null);
        }
    }

    public void adicionar(Cao cao){
        Cao aux;
        aux=this.fim;
        if (inicio==null){
            inicio=cao;
            fim=inicio;
            qtd++;
        }else {
            aux.setProximo(cao);
            this.fim=cao;
            qtd++;
        }
    }


    public boolean addPosicao(Cao cao, int p){
        Cao aux;
        aux=inicio;
        try {
            if (p > qtd) {
                adicionar(cao);
            } else {
                if (p == 1) {
                    cao.setProximo(inicio);
                    inicio = cao;
                    qtd++;
                } else {
                    for (int i = 1; i < p - 1; i++) {
                        aux = aux.getProximo();
                    }
                    cao.setProximo(aux.getProximo());
                    aux.setProximo(cao);
                    qtd++;
                }
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }


    public boolean remover(String nome){
        boolean verif=true;
        Cao aux;
        aux=inicio;
        try {
            if (aux.getNome().equals(nome)) {
                inicio = aux.getProximo();
                qtd--;
            } else {
                if (aux.getProximo().getNome().equals(nome)) {
                    aux.setProximo(aux.getProximo().getProximo());
                    qtd--;
                } else {
                    do {
                        aux = aux.getProximo();
                    } while (!aux.getProximo().getNome().equals(nome));
                    aux.setProximo(aux.getProximo().getProximo());
                    qtd--;
                }
            }
        }catch (Exception e){
            verif=false;
        }
        return verif;
    }

    public boolean removerPosicao(int p){
        boolean verif=true;
        Cao aux;
        aux=inicio;
        try {
            if (p > qtd) {
                verif = false;
            } else {
                if (p == 1) {
                    inicio = aux.getProximo();
                    qtd--;
                } else {
                    for (int i = 1; i < p - 1; i++) {
                        aux = aux.getProximo();
                    }
                    aux.setProximo(aux.getProximo().getProximo());
                    qtd--;
                }
            }
        }catch (Exception e){
            verif=false;
        }
        return verif;
    }

    public int indexOf(String nome){
        int n=0;
        Cao aux;
        aux=inicio;
        try {
            if (aux.getNome().equals(nome)) {
                n++;
            } else {
                n++;
                do {
                    aux = aux.getProximo();
                    n++;
                } while (!aux.getNome().equals(nome));
            }
        }catch (Exception e){
            n=-1;
        }
        return n;
    }

    public boolean isEmpty(){
        if (inicio==null){
            return true;
        }else {
            return false;
        }
    }
    public int size(){
        return qtd;
    }
}
