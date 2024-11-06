package questao1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Gerenciador {
    private List<Tarefa> tarefaList = new ArrayList<>();

    public  Gerenciador(){
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefaList.add(tarefa);
    }

    public void removerTarefa(String nome){
        Tarefa tarefaRemover = null;
        for (Tarefa tarefa : tarefaList){
            if(tarefa.getNomeTarefa().equalsIgnoreCase(nome)){
                tarefaRemover = tarefa;
            }
        }
        tarefaList.remove(tarefaRemover);
    }

    public void marcarConcluida(String nome){
        Tarefa tarefaRemover = null;
        for (Tarefa tarefa : tarefaList){
            if(tarefa.getNomeTarefa().equalsIgnoreCase(nome)){
                tarefaRemover = tarefa;
            }
        }
        if(tarefaRemover==null){
            System.out.println("Tarefa não encontrada");
        }else{
            tarefaRemover.setConcluida(true);
            System.out.println("Tarefa concluída!");
        }
    }

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }
}
