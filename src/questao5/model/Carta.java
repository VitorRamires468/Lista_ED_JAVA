package questao5.model;

import java.util.Objects;

public class Carta {
    private  String valor;
    private String naipe;

    public Carta(String valor, String naipe){
        this.valor = valor;
        this.naipe = naipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(valor, carta.valor) && Objects.equals(naipe, carta.naipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, naipe);
    }

    @Override
    public String toString() {
        return "valor='" + valor + '\'' +
                ", naipe='" + naipe;
    }
}
