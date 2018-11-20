package Aula14v2;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner read= new Scanner(System.in);

  Lista lista= new Lista();


  int resp;
  do {
   System.out.println("*MENU*\n" +
           "1- Adicionar Contato\n" +
           "2- Editar Contato\n" +
           "3- Listar Agenda\n" +
           "4- Listar Contato\n" +
           "5- Remover Contato\n" +
           "6- Informações Gerais\n" +
           "0- Sair");
   System.out.print("Insira o Comando: ");
   resp=read.nextInt();
   switch (resp){
    case 1:
     System.out.println("ADICIONANDO CONTATO");
     Contato novo= new Contato();
     novo.ler();
     lista.addOrdem(novo);
     System.out.println("Contato Adicionado");
     break;

    case 2:
     System.out.println("EDITANDO CONTATO");
     System.out.print("Insira o nome do contato a ser editato: ");
     String nome= read.next();
     if (lista.editar(lista.posicao(nome))) {
      System.out.println("Contato Editado!");
     }else {
      System.out.println("Contato não Encontrado");
     }
     break;

    case 3:
     lista.mostrar();
     break;

    case 4:
     System.out.print("Insira o nome do contato a ser Listado: ");
     nome= read.next();
     lista.mostrarPosicao(lista.posicao(nome));
     break;

    case 5:
     System.out.print("Insira o nome do contato a ser Removido: ");
     nome= read.next();
     if (lista.delPos(lista.posicao(nome))) {
      System.out.println("Contato Removido");
     }else {
      System.out.println("Contato não Encontrado");
     }
     break;

    case 6:
     lista.infoGeral();
     break;

    case 0:
     System.out.println("Saindo do Sistema!");
     break;

    default:
     System.out.println("Comando não encontrado");
     break;
   }

  }while (resp!=0);
  // lista.editar(lista.posicao("2"));

//        lista.motrarPosicao(lista.posicao("2"));

//        lista.mostrar();
////
////        System.out.println(lista.posicao("1"));
////
////        lista.delPos(lista.posicao("2"));
////
////        System.out.println("--------------------------------");
////
//        lista.mostrar();
 }
}