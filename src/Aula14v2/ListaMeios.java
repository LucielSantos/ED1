package Aula14v2;

public class ListaMeios {
    Meios inicio;
    Meios fim;
    int qtd;

    public void addMeios(Meios meios){
        if (this.inicio==null){
            this.inicio=meios;
            this.fim=meios;
            qtd++;
        }else {
            this.fim.setProximo(meios);
            this.fim=meios;
            qtd++;
        }
    }

    public void mostrar(){
        Meios aux= this.inicio;
        for (int i = 0; i<qtd; i++){
            System.out.println(aux.toString());
            aux=aux.getProximo();
        }
    }
}