package Aula14v2;

public class Lista {
    Contato inicio;
    Contato fim;
    int qtd;

    public void add(Contato contato){
        if (this.inicio==null){
            this.inicio=contato;
            this.fim=contato;
            qtd++;
        }else {
            contato.setAnterior(this.fim);
            this.fim.setProximo(contato);
            this.fim=contato;
            qtd++;
        }
    }

    public void mostrar(){
        Contato aux= this.inicio;
        for (int i = 0; i<qtd; i++){
            System.out.println(aux.toString());
            aux=aux.getProximo();
        }
    }

    public int posicao(String nome){
        Contato aux = inicio;
        int i=0;
        while (aux.getNome().compareToIgnoreCase(nome)<0 && i<qtd-1){
            aux=aux.getProximo();
            i++;
        }
        if (aux.getNome().compareToIgnoreCase(nome) == 0) {
            return i;
        }else {
            return -1;
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
            return true;
        }else {
            Contato aux = inicio.proximo;
            this.inicio = aux;
            aux.anterior = null;
            qtd--;
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
            if (aux.getNome()==inicio.getNome()){
                inicio=inicio.getProximo();
                qtd--;
            }else {
                aux.proximo.anterior=aux.anterior;
                aux.anterior.proximo=aux.getProximo();
                qtd--;
            }
            return true;
        }
    }
}
