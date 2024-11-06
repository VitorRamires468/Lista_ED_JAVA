package questao1.model;

public class Tarefa {
    private String nomeTarefa;
    private String  dataDeEntrega;
    private Boolean concluida;

    public Tarefa(String nomeTarefa,String dataDeEntrega){
        this.nomeTarefa = nomeTarefa;
        this.dataDeEntrega = dataDeEntrega;
        this.concluida = false;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getDataDeEntrega() {
        return dataDeEntrega;
    }

    public void setDataDeEntrega(String dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "nomeTarefa='" + nomeTarefa + '\'' +
                ", dataDeEntrega='" + dataDeEntrega + '\'' +
                ", concluida=" + concluida;
    }
}
