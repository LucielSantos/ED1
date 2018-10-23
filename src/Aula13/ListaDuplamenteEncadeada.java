package Aula13;

public class ListaDuplamenteEncadeada {
    Elemento inicio;
    Elemento fim;
    int qtd;


    public boolean add(Elemento e){
        if(this.inicio==null){
            this.inicio=e;
            this.fim=e;
            this.qtd++;
            return true;
        }else {
            //Elemento aux=this.inicio;
            e.proximo=this.inicio;
            this.inicio.anterior=e;
            this.inicio=e;
            this.qtd++;
            return true;
        }
    }

    public boolean addFim(Elemento e){
        if (this.inicio==null){
            return this.add(e);
        }else {
//            this.fim.proximo=e;
//            e.anterior=this.fim;
//            this.fim=e;
//            qtd++;
            Elemento aux=this.fim;
            e.anterior=aux;
            aux.proximo=e;
            this.fim=e;
            qtd++;
            return true;
        }
    }

    public boolean addPosicao(Elemento e, int p){
        if (inicio==null || p<=0){
            return this.add(e);

        }else if (p>=this.qtd) {
            return addFim(e);

        }else {
            Elemento aux = inicio;
            for (int i = 0; i < p; i++) {
                aux = aux.proximo;
            }
            e.anterior=aux.anterior;
            aux.anterior.proximo=e;
            e.proximo=aux;
            aux.anterior=e;
            this.qtd++;
            return true;
        }
    }

    public void mostrar(){
        if (inicio==null){
            System.out.println("Lista Vazia!");
        }else {
            Elemento aux= inicio;
            while (aux!=null){
                System.out.println(aux.toString());
                aux=aux.proximo;
            }
        }
    }
}
