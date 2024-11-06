package questao1.principal;

import questao1.model.Gerenciador;
import questao1.model.Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Gerenciador gerenciador = new Gerenciador();
        int opcao = -1;
        while (opcao!=0){
            System.out.println("\t1 - Inserir Tarefa\n\t2 - Remover Tarefa\n\t3 - Marcar tarefa como concluída\n\t4 - Listar tarefas\n\t0 -Sair");
            opcao = leitura.nextInt();
            switch (opcao){
                case 1:
                    leitura.nextLine();
                    System.out.println("Informe a tarefa: ");
                    var nome = leitura.nextLine();
                    System.out.println("Informe a data de entrega");
                    var data = leitura.nextLine();
                    gerenciador.adicionarTarefa(new Tarefa(nome,data));
                    break;
                case 2:
                    gerenciador.getTarefaList().forEach(System.out::println);
                    System.out.println("Informe qual tarefa você quer remover: ");
                    leitura.nextLine();
                    var nomeTarefaRemover = leitura.nextLine();
                    gerenciador.removerTarefa(nomeTarefaRemover);
                    break;
                case 3:
                    gerenciador.getTarefaList().forEach(System.out::println);
                    leitura.nextLine();
                    System.out.println("Informe a tarefa que deseja marcar como concluída: ");
                    var tarefa = leitura.nextLine();
                    gerenciador.marcarConcluida(tarefa);
                    break;
                case 4:
                    System.out.println("--------LISTA DE TAREFA--------");
                    gerenciador.getTarefaList().forEach(System.out::println);
                    System.out.println("--------LISTA DE TAREFA--------");
                    break;
                case 0:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Informe uma opção válida...");
                    break;
            }
        }
    }
}
