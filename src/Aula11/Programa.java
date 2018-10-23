package Aula11;

public class Programa {
    public static void main(String[] args) {
        Lista lista= new Lista();
        Cao cao= new Cao();

        String resp="";

        do {
            System.out.println(
                    "---Menu do Programa---\n" +
                            "1- Adicionar cão ao fim da lista\n" +
                            "2- Adicionar cão na posição indicada\n" +
                            "3- Remover cão pelo nome\n" +
                            "4- Remover cão por posição\n" +
                            "5- Verificar a posição que o cão está na lista\n" +
                            "6- Verificar se a lista está vazia\n" +
                            "7- Verificar o tamanho da Lista\n" +
                            "8- Mostra todos os cães da lista\n" +
                            "0- Sair do programa");
            System.out.println("-------------------");
            System.out.print("Comando: ");
            resp=cao.read.next();
            System.out.println("-------------------");
            switch (resp){
                case "1":
                    Cao aux1= cao.ler();
                    if (lista.indexOf(aux1.getNome())==-1){
                        lista.adicionar(aux1);
                        System.out.println("Cão adicionado!");
                    }else {
                        System.out.println("Cão já adicionado!");
                    }
                    break;

                case "2":
                    Cao aux2= cao.ler();
                    if (lista.indexOf(aux2.getNome())==-1){
                        System.out.print("Posição: ");
                        int a=cao.read.nextInt();
                        if (lista.addPosicao(aux2, a)){
                            System.out.println("Cão adicionado!");
                        }else {
                            System.out.println("Posição não é válida");
                        }
                    }else {
                        System.out.println("Cão já adicionado!");
                    }
                    break;

                case "3":
                    System.out.print("Insira o nome do cão a ser removido: ");
                    String nome=cao.read.next();
                    if (lista.remover(nome)){
                        System.out.println("Cão Removido!");
                    }else {
                        System.out.println("Cão não encontrado!");
                    }
                    break;

                case "4":
                    System.out.print("Insira a posição do cão: ");
                    int p=cao.read.nextInt();
                    if (lista.removerPosicao(p)){
                        System.out.println("Cão Removido!");
                    }else {
                        System.out.println("Cão não encontrado!");
                    }
                    break;

                case "5":
                    System.out.print("Insira o nome do cão: ");
                    String n=cao.read.next();
                    if (lista.indexOf(n)==-1){
                        System.out.println("Cão não encontrado!");
                    }else {
                        System.out.println("Cão na posição: "+lista.indexOf(n));
                    }
                    break;

                case "6":
                    if (lista.isEmpty()){
                        System.out.println("A lista está vazia!");
                    }else {
                        System.out.println("A lista tem conteúdo!");
                    }
                    break;

                case "7":
                    System.out.println(lista.size());
                    break;

                case "8":
                    lista.listar();
                    break;

                case "0":
                    break;

                default:
                    System.out.println("Comando não encontrado!");
            }
        }while (!resp.equals("0"));

        System.out.println("Você saiu do Programa");
    }
}