package Aula14v2;

public class ListaMeios {
    Meios inicio;
    Meios fim;
    int qtd;

    /*public void add(Meios meios){
        if (this.inicio==null){
            this.inicio=meios;
            this.fim=meios;
            qtd++;
        }else {
            this.fim.setProximo(meios);
            this.fim=meios;
            qtd++;
        }
    }*/

    public boolean add(Meios meio){
        if (this.inicio==null){
            this.inicio=meio;
            this.fim=meio;
        }else {
            this.fim.proximo=meio;
            this.fim=meio;
        }
        qtd++;
        return true;
    }

    public void listar(){
        Meios aux= this.inicio;
        for (int i = 0; i<qtd; i++){
            System.out.println(aux.toString());
            aux=aux.getProximo();
        }
    }
}