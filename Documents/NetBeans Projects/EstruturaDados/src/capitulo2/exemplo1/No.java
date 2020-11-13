package capitulo2.exemplo1;

/**
 * <p><b>Capitulo 2</b> - Exemplo 1.</p>
 * <p>Classe <b>No</b>.</p>
 * <p>Classe responsavel por representar o <b>No</b> da <b>Arvore Binaria</b>.</p>
 * @author Leandro
 * @since  12/11/2020
 */
public class No {
    private Object registro;
    private No esquerda;
    private No direita;
    
    public No(Object objeto) {
        registro = objeto;
    }

    public Object getRegistro() {
        return registro;
    }

    public void setRegistro(Object registro) {
        this.registro = registro;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
    
    
}
