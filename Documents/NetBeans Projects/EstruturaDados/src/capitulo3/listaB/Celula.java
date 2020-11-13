package capitulo3.listaB;

/**
 * <p><b>Capitulo 3</b> - Lista com Auto Referencia.</p>
 * <p>Classe <b>Celula</b>.</p>
 * <p>Classe responsavel por representar a <b>Celula</b> da <b>Lista</b>.</p>
 * @author Leandro
 * @since  12/11/2020
 */
public class Celula {
    protected Object objeto;
    protected Celula proximo;
    
    /**
     * Metodo construtor padrao da Classe.
     */
    public Celula() {
        this.objeto  = null;
        this.proximo = null;
    }
    
    /**
     * Metodo construtor alternativo da Classe.
     * @param objeto Objeto da Celula.
     */
    public Celula(Object objeto) {
        this.objeto  = objeto;
        this.proximo = null;
    }

    /**
     * Metodo responsavel por retornar o Objeto da Celula.
     * @return Objeto da Celula.
     */
    public Object getObjeto() {
        return this.objeto;
    }

    /**
     * Metodo responsavel por definir o Objeto da Celula.
     * @param objeto Objeto da Celula.
     */
    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    /**
     * Metodo responsavel por retornar o Ponteiro Proximo da Celula.
     * @return Ponteiro Proximo da Celula.
     */
    public Celula getProximo() {
        return this.proximo;
    }

    /**
     * Metodo responsavel por definir o Ponteiro Proximo da Celula.
     * @param proximo Ponteiro Proximo da Celula.
     */
    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public String toString() {
        return this.objeto.toString();
    }
}