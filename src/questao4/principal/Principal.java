package questao4.principal;

import questao4.model.EditorTexto;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        EditorTexto editorTexto = new EditorTexto();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\t1 - Adicionar texto\n\t2 - Desfazer última ação\n\t3 - Refazer última ação\n\t4 - Mostrar texto");
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite uma nova linha: ");
                    var texto = leitura.nextLine();
                    editorTexto.adicionar(texto);
                    break;
                case 2:
                    System.out.println("Desfazendo...");
                    editorTexto.desfazer();
                    break;
                case 3:
                    System.out.println("Refazendo...");
                    editorTexto.refazer();
                    break;
                case 4:
                    System.out.println("TEXTO DIGITADO");
                    System.out.println(editorTexto.obterTexto());
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
