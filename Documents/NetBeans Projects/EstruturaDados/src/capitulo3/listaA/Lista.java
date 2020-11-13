package capitulo3.listaA;

/**
 * <p><b>Capitulo 1</b> - Lista.</p>
 * <p>Classe <b>Lista</b>.</p>
 * <p>Classe responsavel por retornar uma Lista de Elementos.</p>
 * @author Leandro
 * @since  22/10/2020
 */
public class Lista {
    private Object  objetos[];
    private Integer primeiro;
    private Integer ultimo;
    private Integer posicao;
    
    /**
     * Metodo construtor padrao da Classe.
     * @param tamanho Tamanho da Lista.
     */
    public Lista(Integer tamanho) {
        this.objetos  = new Object[tamanho];
        this.posicao  = -1;
        this.primeiro = 0;
        this.ultimo   = this.primeiro;
    }
    
    /**
     * Metodo responsavel por retornar se a Lista esta vazia.
     * @return Lista esta Vazia.
     */
    public boolean vazia() {
        return this.primeiro.equals(this.ultimo);
    }
    
    /**
     * Metodo responsavel por adicionar um Novo Objeto na Lista.
     * @param objeto Novo Objeto.
     * @throws java.lang.Exception 
     */
    public void insere(Object objeto) throws Exception {
        if (this.ultimo >= this.objetos.length)
            throw new Exception("Erro 1: A lista esta cheia!");
        else {
            this.objetos[this.ultimo] = objeto;
            this.ultimo++;
        }
    }
    
    /**
     * Metodo responsavel por retornar o Indice do Objeto na Lista.
     * @param  objeto Objeto a ser Pesquiso.
     * @return Indice do Objeto pesquisado.
     */
    private Integer getIndice(Object objeto) {
        if (this.vazia() || objeto == null)
            return -1;
        for (int i = 0; i < this.ultimo; i++) {
            if (this.objetos[i].equals(objeto))
                return i;
        }
        return -1;
    } 
    
    /**
     * Metodo responsavel por retornar o Objeto Pesquisado na Lista.
     * @param  objeto Objeto a ser Pesquisa.
     * @return Objeto pesquisado.
     */
    public Object pesquisa(Object objeto) {
        Integer indice = this.getIndice(objeto);
        if (indice == -1)
            return null;
        return this.objetos[indice];
    }
    
    /**
     * Metodo responsavel por retornar o Proximo Objeto da Lista.
     * @return Proximo Objeto da Lista.
     */
    public Object getProximo() {
        this.posicao++;
        if (this.posicao >= this.ultimo)
            return null;
        return this.objetos[this.posicao];
    }
    
    /**
     * Metodo responsavel por remover um Elemento da Lista.
     * @param  chave Chave do Elemento.
     * @return Objeto removido.
     * @throws Exception Erro ao buscar Elemento.
     */
    public Object remove(Object chave) throws Exception {
        Integer index  = this.getIndice(chave);
        if (this.vazia() || chave == null)
            throw new Exception("Erro: Lista esta vazia!");
        if (index >= this.ultimo)
            return null;
        Object  objeto = this.objetos[index];
        this.ultimo   -= 1;
        for (int i = index; i < this.ultimo; i++)
            this.objetos[i] = this.objetos[i + 1];
        return  objeto;
    }
    
    /**
     * Metodo responsavel por imprimir os Objetos da Lista.
     */
    public void imprime() {
        for (int i = this.primeiro; i < this.ultimo; i++)
            System.out.println(this.objetos[i].toString() + " ");
    }
}