package ListaEncadeada02;

public class Funcoes {
    public Caixa inicio;

    public void inicializar(){
        inicio=null;
    }
    public void inserir(int elemento){
        Caixa nova = new Caixa();
        nova.setElemento(elemento);
        nova.setProximo(null);
        if (inicio==null){
            this.inicio=nova;
        }else{
            Caixa aux= new Caixa();
            aux=this.inicio;
            while (aux.getProximo()!= null){
                aux=aux.getProximo();
            }
            aux.setProximo(nova);
        }
    }
    public void exibir(){
        if (inicio==null){
            System.out.println("Lista Vazia");
        }else {
            Caixa aux=inicio;
            while (aux != null){
                System.out.println("Elemento: "+aux.getElemento());
                aux=aux.getProximo();
            }
        }
    }
    public void removerInicio(){
        if (inicio!=null) {
            inicio = inicio.getProximo();
        }else {
            System.out.println("Lista vazia");
        }
    }

    public void removerMeio(int resp){
        Caixa aux;
        aux=inicio;
        boolean verif= false;
        while (verif==false){
            if (aux.getProximo() != null) {
                if (aux.getProximo().elemento == resp) {
                    aux.setProximo(aux.getProximo().proximo);
                    verif = true;
                }else {
                    aux = aux.getProximo();
                }
            }else{
                    System.out.println("Não Encontrado");
                    verif=true;
                }
        }
    }
}
