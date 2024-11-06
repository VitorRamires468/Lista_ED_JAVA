package questao6.model;

import java.util.LinkedList;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Queue;

public class Atendimento{
    private Queue<Cliente> clientes;

    public Atendimento(){
        clientes = new LinkedList<>();
    }

    public void adiconarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void chamaCliente(String nome){
        Cliente clieteNaFila = null;
        for (Cliente cliente:clientes){
            if(cliente.getNome().equalsIgnoreCase(nome)){
                clieteNaFila = cliente;
            }
        }
        if(clieteNaFila!=null){
            System.out.println("Cliente a ser atendido: "+clieteNaFila.getNome() + " - atendimento: "+clieteNaFila.getTipoAtendimento());
            clientes.remove();
        }else{
            System.out.println("Cleinte não encontrado.");
        }
    }

    public Queue<Cliente> getClientes() {
        return clientes;
    }
}
