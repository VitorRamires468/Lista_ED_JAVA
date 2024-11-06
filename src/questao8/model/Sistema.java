package questao8.model;

import java.util.LinkedList;
import java.util.Queue;

public class Sistema {
    private Queue<Processo> filaProcessos= null;

    public  Sistema(){
        filaProcessos = new LinkedList<>();
    }

    public void adicionarProcesso(Processo processo){
        filaProcessos.add(processo);
    }

    public  void removerProcesso(){
        System.out.println("Processo removido: "+filaProcessos.poll());
    }

    public Queue<Processo> getFilaProcessos() {
        return filaProcessos;
    }
}
