package questao6.principal;

import questao6.model.Atendimento;
import questao6.model.Cliente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Atendimento atendimento = new Atendimento();
        int opcao = -1;
        while(opcao!=0){
            System.out.println("\t1 - Adiconar cliente a fila de espera \n\t2 -  Chamar cliente\n\t3 - Fila de Clientes\n\t0 - Sair");
            opcao = leitura.nextInt();
            leitura.nextLine();
           switch (opcao){
                case 1:
                    System.out.println("Informa nome: ");
                    var nome = leitura.nextLine();
                    System.out.println("Informe o tipo de atendimento: ");
                    var tipoAtendimento = leitura.nextLine();
                    atendimento.adiconarCliente(new Cliente(nome,tipoAtendimento));
                    break;
               case 2:
                   System.out.println("Próximo Cliente: ");
                   atendimento.chamaCliente(atendimento.getClientes().peek().getNome());
                   break;
               case  3:
                   atendimento.getClientes().forEach(System.out::println);
                   break;
               default:
                   System.out.println("Informe uma opção válida!");
                   break;
            }
        }
    }
}
