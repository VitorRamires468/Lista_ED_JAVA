package questao7.principal;

import questao6.model.Cliente;
import questao7.model.Print;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Print print = new Print();
        int opcao = -1;
        while(opcao!=0){
            System.out.println("\t1 - Enviar documento \n\t2 -  Imprimir \n\t3 - Fila de impressão\n\t0 - Sair");
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Informe o documento: ");
                    var documento = leitura.next();
                    print.adicionarFilaImpressao(documento);
                    break;
                case 2:
                   print.imprimir();
                    break;
                case  3:
                    print.getDocumentos().forEach(System.out::println);
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }
    }
}
