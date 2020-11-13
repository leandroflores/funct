package capitulo1.exemplo3;

/**
 * <p><b>Capitulo 1</b> - Exemplo 3.</p>
 * <p>Classe <b>MaxMin</b>.</p>
 * <p>Classe responsavel por retornar o Maior e o Menor Elemento de um Vetor.</p>
 * @author Leandro
 * @since  12/11/2020
 */
public class MaxMin {
    
    /**
     * Metodo responsavel por retornar o Maior e Menor Elemento de um Vetor.
     * @param  vetor Vetor de Inteiros.
     * @param  tamanho Tamanho do Vetor.
     * @return Maior e Menor Elemento do Vetor.
     */
    public static Integer[] getMaxMin(Integer[] vetor, Integer tamanho) {
        vetor[tamanho] = ((tamanho % 2) > 0) ? vetor[tamanho - 1] : vetor[tamanho];
        Integer  index = ((tamanho % 2) > 0) ? tamanho  : tamanho - 1;
        Integer  max   = vetor[0] > vetor[1] ? vetor[0] : vetor[1];
        Integer  min   = vetor[0] < vetor[1] ? vetor[0] : vetor[1];
        Integer  i     = 2;
        while (i < index) {
            if (vetor[i] > vetor[i + 2]) {
                max = vetor[i]     > max ? vetor[i] : max;
                min = vetor[i + 1] < min ? vetor[i] : min;
            }else {
                min = vetor[i]     < min ? vetor[i]     : min;
                max = vetor[i + 1] > max ? vetor[i + 1] : max;
            }
            i += 2;
        }
        return new Integer[]{max, min};
    }
}