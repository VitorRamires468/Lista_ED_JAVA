package questao7.model;

import java.util.LinkedList;
import java.util.Queue;

public class Print {
    private Queue<String> documentos = null;

    public Print(){
        documentos = new LinkedList<>();
    }

    public void adicionarFilaImpressao(String documento){
        documentos.add(documento);
    }

    public void imprimir(){
        if(documentos.size()>0){
            System.out.println("Documento impresso: "+documentos.poll());
        }else{
            System.out.println("Não há documentos para imprimir...");
        }
    }

    public Queue<String> getDocumentos() {
        return documentos;
    }
}
