package capitulo3.listaB;

/**
 * <p><b>Capitulo 3</b> - Lista com Auto Referencia.</p>
 * <p>Classe <b>Lista</b>.</p>
 * <p>Classe responsavel por representar a <b>Lista</b> com <b>Auto Referencia</b>.</p>
 * @author Leandro
 * @since  12/11/2020
 */
public class Lista {
    private Celula primeiro;
    private Celula ultimo;
    private Celula posicao;
    
    /**
     * Metodo construtor padrao da Classe.
     */
    public Lista() {
        this.primeiro = new Celula();
        this.posicao  = this.primeiro;
        this.ultimo   = this.primeiro;
        this.primeiro.proximo = null;
    }
    
    /**
     * Metodo responsavel por retornar se a Lista esta Vazia.
     * @return Lista esta Vazia.
     */
    public boolean vazia() {
        return this.primeiro == this.ultimo;
    }
    
    /**
     * Metodo responsavel por inserir uma Celula na Lista.
     * @param objeto Objeto a ser inserido.
     */
    public void insere(Object objeto) {
        this.ultimo.proximo = new Celula(objeto);
                this.ultimo = this.ultimo.proximo;
        this.ultimo.proximo = null;
    }
    
    /**
     * Metodo responsavel por retornar a Primeira Celula da Lista.
     * @return Primeira Celula da Lista.
     */
    public Object primeiro() {
        this.posicao = this.primeiro;
        return this.proximo();
    }
    
    /**
     * Metodo responsavel por retornar a Proxima Celula da Lista.
     * @return Proxima Celula da Lista.
     */
    public Object proximo() {
        this.posicao = this.posicao.proximo;
        if (this.posicao == null)
            return null;
        return this.posicao.objeto;
    }
    
    /**
     * Metodo responsavel por Pesquisar uma Celula pela Chave na Lista.
     * @param  chave Chave da Celula.
     * @return Celula encontrada pela Chave.
     */
    public Object pesquisa(Object chave) {
        if (this.vazia() || chave == null)
            return null;
        Celula atual = this.primeiro;
        while (atual != null) {
            if (atual.objeto.equals(chave))
                return atual.objeto;
            atual = atual.getProximo();
        }
        return null;
    }
    
    
//    public Object remove(Object chave) throws Exception {
//        if (this.vazia() || (chave == null))
//            throw new Exception("Erro: Objeto nao encontrado!");
//        
//    }
    
    /**
     * Metodo responsavel por imprimir as Celulas da Lista.
     */
    public void imprime() {
        Celula atual = this.primeiro.proximo;
        while (atual != null) {
            System.out.println(atual.objeto);
            atual = atual.proximo;
        }
    }
}