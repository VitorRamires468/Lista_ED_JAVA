package questao6.model;

public class Cliente {
    private String nome;
    private String tipoAtendimento;

    public Cliente(String nome, String tipoAtendimento){
       this.nome = nome;
       this.tipoAtendimento = tipoAtendimento;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", tipoAtendimento='" + tipoAtendimento ;
    }
}
