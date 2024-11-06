package questao2.principal;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<String> urlList = new ArrayList<>();
        int opcao = -1;
        int size = 0;
        while (opcao != 0) {
            System.out.println("\t1 - Adicionar url\n\t2 - Remover url's antigas\n\t3 - Listar url's");
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("URL: ");
                    var url = leitura.nextLine();
                    if(size==5){
                        System.out.println("Lista cheia! Remova uma url.");
                    }else{
                        System.out.println("URL adicionado!");
                        urlList.add(url);
                        size++;
                    }
                    break;
                case 2:
                    System.out.println("URL removida!");
                    urlList.remove(size-1);
                    size--;
                    break;
                case 3:
                    urlList.forEach(System.out::println);
                    break;
                case  0:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }
    }
}
