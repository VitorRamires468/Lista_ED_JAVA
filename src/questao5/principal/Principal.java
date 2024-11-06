package questao5.principal;

import questao5.model.Carta;
import questao5.model.MaoJogador;

import java.util.Scanner;

public class Principal {
    static Scanner leitura = new Scanner(System.in);
    public static void main(String[] args) {
        MaoJogador maoJogador = new MaoJogador();
        int opcao = -1;
        while(opcao!=0){
            System.out.println("\t1 - Adiconar inicio  \n\t2 -  Adicionar fim \n\t3 - Remover inicio\n\t4 - Remover fim\n\t5 - Reorganizar\n\t6 - Mostar cartas\n\t0 - Sair");
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 1:
                    maoJogador.adicionarCartaInicio(criaCarta());
                    break;
                case 2:
                    maoJogador.adicionarCartaFim(criaCarta());
                    break;
                case  3:
                    maoJogador.removerCartaInicio();
                    break;
                case 4:
                    maoJogador.removerCartaFim();
                    break;
                case 5:
                    maoJogador.mostrarCartas();
                    System.out.println("Seleciona a posiçao que quer mover carta: ");
                    var posicao = leitura.nextInt();
                    leitura.nextLine();
                    maoJogador.reorganizarCartas(criaCarta(),posicao);
                    break;
                case 6:
                    maoJogador.mostrarCartas();
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }
    }

    public static Carta criaCarta(){
        System.out.println("Informe o valor da carta: ");
        var valor = leitura.nextLine();
        System.out.println("Informe o naipe: ");
        var naipe = leitura.nextLine();
        return new Carta(valor,naipe);
    }
}
