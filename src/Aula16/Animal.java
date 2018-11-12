package Aula16;

public class Animal {
    public String nome;
    public float peso;
    public float altura;


    public Animal(String n){
        this.nome=n;

    }

    public void comer(){
        System.out.println("Animal comer");
    }

    public void movimenta(){
        System.out.println("Animal movimentou-se");
    }
}
