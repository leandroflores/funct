package capitulo1.exemplo1;

/**
 * <p><b>Capitulo 1</b> - Exemplo 1.</p>
 * <p>Classe <b>Max</b>.</p>
 * <p>Classe responsavel por retornar o Maior Elemento de um Vetor.</p>
 * @author Leandro
 * @since  22/10/2020
 */
public class Max {
    
    /**
     * Metodo responsavel por retornar o Maior Elemento de um Vetor.
     * @param  vetor Vetor de Inteiros.
     * @param  tamanho Tamanho do Vetor.
     * @return Maior Elemento do Vetor.
     */
    public Integer max(Integer[] vetor, Integer tamanho) {
        Integer maior = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maior)
                maior = vetor[i];
        }
        return  maior;
    }
}