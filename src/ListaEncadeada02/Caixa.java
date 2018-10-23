package ListaEncadeada02;

public class Caixa {
    public int elemento;
    public Caixa proximo;

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    public int getElemento() {
        return this.elemento;
    }
    public void setProximo(Caixa proximo) {
        this.proximo = proximo;
    }
    public Caixa getProximo(){
        return this.proximo;
    }
}
