package Aula16;

public class Main {
    public static void main(String[] args) {
       // Animal a= new Animal();
        Mamifero m= new Mamifero();
        Aves av= new Aves();
        Cachorro c= new Cachorro();

        c.comer();
        c.comer("Ração");
        c.latir();
    }
}
