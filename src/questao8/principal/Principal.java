package questao8.principal;

import questao8.model.Processo;
import questao8.model.Sistema;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Sistema sistema = new Sistema();
        int opcao = -1;
        while(opcao!=0){
            System.out.println("\t1 - Adicionar processo \n\t2 -  Remover processo \n\t3 - Fila de processos\n\t0 - Sair");
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Informe o processo: ");
                    var processo = leitura.nextLine();
                    sistema.adicionarProcesso(new Processo(processo));
                    break;
                case 2:
                    sistema.removerProcesso();;
                    break;
                case  3:
                    sistema.getFilaProcessos().forEach(p -> System.out.println(p.getNomeProcesso()));
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }
    }
}
