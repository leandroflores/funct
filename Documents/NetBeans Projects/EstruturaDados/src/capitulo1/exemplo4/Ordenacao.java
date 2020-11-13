package capitulo1.exemplo4;

/**
 * <p><b>Capitulo 1</b> - Exemplo 4.</p>
 * <p>Classe <b>Ordenacao</b>.</p>
 * <p>Classe responsavel por ordenar crescentemente os Valores de um Vetor.</p>
 * @author Leandro
 * @since  12/11/2020
 */
public class Ordenacao {
    
    /**
     * Metodo responsavel por retornar um Vetor com os Valores ordenados crescentemente.
     * @param  vetor Vetor de Inteiros.
     * @param  tamanho Tamanho do Vetor.
     */
    public static void ordena(Integer[] vetor, Integer tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[min])
                    min = j;
            }
            Integer  x = vetor[min];
            vetor[min] = vetor[i];
            vetor[i]   = x;
        }
    }
}