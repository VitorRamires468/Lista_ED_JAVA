package questao4.model;

import java.util.LinkedList;

public class EditorTexto {
    private LinkedList<String> gerenciador = new LinkedList<>();
    private int indiceAtual;

    public EditorTexto(){
        gerenciador.add("");
        indiceAtual = 0;
    }

    public void adicionar(String texto){
        String novoTexto = gerenciador.get(indiceAtual) + texto;
        while (gerenciador.size()>indiceAtual+1){
            gerenciador.removeLast();
        }
        gerenciador.add(novoTexto);
        indiceAtual++;
    }

    public  void desfazer(){
        if(indiceAtual>0){
            indiceAtual--;
        }else {
            System.out.println("Nã é possível!");
        }
    }

    public void refazer(){
        if(gerenciador.size()-1>indiceAtual){
            indiceAtual++;
        }else{
            System.out.println("Não foi possível");
        }
    }


    public  String obterTexto(){
        return  gerenciador.get(indiceAtual);
    }
}
