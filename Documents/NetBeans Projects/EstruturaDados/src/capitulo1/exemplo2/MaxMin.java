package capitulo1.exemplo2;

/**
 * <p><b>Capitulo 1</b> - Exemplo 2.</p>
 * <p>Classe <b>MaxMin</b>.</p>
 * <p>Classe responsavel por retornar o Maior e o Menor Elemento de um Vetor.</p>
 * @author Leandro
 * @since  22/10/2020
 */
public class MaxMin {
    
    /**
     * Metodo responsavel por retornar o Maior e Menor Elemento de um Vetor.
     * @param  vetor Vetor de Inteiros.
     * @param  tamanho Tamanho do Vetor.
     * @return Maior e Menor Elemento do Vetor.
     */
    public static Integer[] getMaxMin(Integer[] vetor, Integer tamanho) {
        Integer max = vetor[0];
        Integer min = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            min = vetor[i] < min ? vetor[i] : min; 
            max = vetor[i] > max ? vetor[i] : max;
        }
        return new Integer[]{max, min};
    }
}
