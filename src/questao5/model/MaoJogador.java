package questao5.model;

import java.util.LinkedList;

public class MaoJogador {
    private LinkedList<Carta> cartas = null;
    private  int indiceAtual;

    public MaoJogador(){
        cartas = new LinkedList<>();
        indiceAtual = 0;
    }

    public void adicionarCartaInicio(Carta carta){
        cartas.addFirst(carta);
    }

    public void adicionarCartaFim(Carta carta){
        cartas.addLast(carta);
    }

    public void removerCartaInicio(){
        cartas.removeFirst();
    }

    public void removerCartaFim(){
        cartas.removeLast();
    }

    public void reorganizarCartas(Carta carta, int posicao){
       if(cartas.contains(carta)){
           int posicaoOrigem = cartas.indexOf(carta);
           Carta cartaOrigem = cartas.get(posicaoOrigem);
           if(posicao>0 && posicao<=cartas.size()){
               Carta cartaTrocar = cartas.get(posicao-1);
               for (int i = 0; i<cartas.size();i++){
                   if(i==posicao-1){
                       cartas.set(i,cartaOrigem);
                   } else if (i==posicaoOrigem) {
                       cartas.set(i,cartaTrocar);
                   }

               }
           }else{
               System.out.println("Informe uma posição válida!");
           }
       }else{
           System.out.println("informe uma carta válida...");
       }
    }

    public void mostrarCartas(){
        int posicoes = 1;
        for (Carta carta : cartas){
            System.out.println(posicoes+" - "+ carta.toString());
            posicoes++;
        }
    }

}
