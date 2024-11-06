package questao3.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<String> textos = new ArrayList<>();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\t1 - Adicionar texto\n\t2 - Remover última ação\n\t3 - Mostar texto");
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite uma nova linha: ");
                    var linha = leitura.nextLine();
                    textos.add(linha);
                    break;
                case 2:
                    System.out.println("Desfazendo...");
                    if(textos.size()>0){
                        textos.remove(textos.size()-1);
                    }else{
                        System.out.println("Impossível realizar a operação!");
                    }
                    break;
                case 3:
                    System.out.println("TEXTO DIGITADO");
                    textos.forEach(System.out::println);
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
