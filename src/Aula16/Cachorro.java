package Aula16;

public class Cachorro extends Mamifero{

    public void comer() {
        super.comer();
        System.out.println("cachorro comendo");
    }
    public void comer(String algumaCoisa) {
        System.out.println("cachorro comendo"+algumaCoisa);
    }
    public void latir(){
        System.out.println("au au");
    }
}
