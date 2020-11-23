package funct;

/**
 * <p>Classe de Biblioteca <b>FunctMatrix</b>.</p>
 * <p>Classe responsavel pelas operacoes envolvendo <b>Matrizes</b>.</p>
 * @author Leandro
 * @since  23/11/2020
 * @see    funct.FunctArray
 */
public class FunctMatrix {
    private final FunctArray funct;
    
    /**
     * Metodo construtor padrao da Classe.
     */
    public FunctMatrix() {
        funct = new FunctArray();
    }
    
    /**
     * Metodo responsavel por retornar o Total dos Elementos de uma Matriz.
     * @param  matrix Matriz.
     * @return Total dos Elementos de uma Matriz.
     */
    public Integer total(Integer[][] matrix) { 
        Integer total  = 0;
        for (Integer[] array : matrix)
                total += array.length;
        return  total;
    }
    
    /**
     * Metodo responsavel por retornar um Array com os Elementos de uma Matriz.
     * @param  matrix Matriz.
     * @return Array com os Elementos de uma Matriz.
     */
    public Integer[] elements(Integer[][] matrix) { 
        Integer array[] = new Integer[total(matrix)];
        Integer index   = 0;
        for (Integer[] current : matrix) {
            for (Integer element : current)
                array[index++] = element;
        }
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar se a Matriz e Vazia.
     * @param  matrix Matriz.
     * @return Matriz e vazia.
     */
    public boolean isEmpty(Integer[][] matrix) {
        return matrix.length == 0;
    }
    
    /**
     * Metodo responsavel por retornar se a Matriz e Quadrada.
     * @param  matrix Matriz.
     * @return Matriz e quadrada.
     */
    public boolean isSquare(Integer[][] matrix) {
        Integer length = matrix.length;
        for (Integer[] array : matrix) {
            if (array.length != length)
                return false;
        }
        return true;
    }
    
    /**
     * Metodo responsavel por retornar se a Matriz corresponde a um padrao M x N.
     * @param  matrix Matriz.
     * @return Matriz corresponde a M x N.
     */
    public boolean isMatrix(Integer[][] matrix) {
        if (matrix.length == 0)
            return false;
        Integer lenght = matrix[0].length;
        for (Integer[] array : matrix) {
            if (array.length != lenght) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Metodo responsavel por retornar o Maior Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Maior Elemento de uma Matriz.
     */
    public Integer max(Integer[][] matrix) { 
        if (matrix.length == 0)
            return null;
        Integer aux;
        Integer max = Integer.MIN_VALUE;
        for (Integer[] current : matrix) {
                aux = funct.max(current);
                max = aux > max ? aux : max;
        } 
        return  max;
    }
    
    /**
     * Metodo responsavel por retornar a Posicao do Maior Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Posicao do Maior Elemento de uma Matriz.
     */
    public String positionOfMax(Integer[][] matrix) { 
        if (matrix.length == 0)
            return null;
        String  pos = "";
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    pos = i + "." + j;
                }
            }
        }
        return  pos;
    }
    
    /**
     * Metodo responsavel por retornar o Menor Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Menor Elemento de uma Matriz.
     */
    public Integer min(Integer[][] matrix) { 
        if (matrix.length == 0)
            return null;
        Integer aux;
        Integer min = Integer.MAX_VALUE;
        for (Integer[] current : matrix) {
                aux = funct.min(current);
                min = aux < min ? aux : min;
        } 
        return  min;
    }
    
    /**
     * Metodo responsavel por retornar a Posicao do Menor Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Posicao do Menor Elemento de uma Matriz.
     */
    public String positionOfMin(Integer[][] matrix) { 
        if (matrix.length == 0)
            return null;
        String  pos = "";
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    pos = i + "." + j;
                }
            }
        }
        return  pos;
    }
    
    /**
     * Metodo responsavel por retornar a Soma dos Elementos de uma Matriz.
     * @param  matrix Matriz.
     * @return Soma dos Elementos de uma Matriz.
     */
    public Integer sum(Integer[][] matrix) { 
        Integer sum  = 0;
        for (Integer[] array : matrix)
                sum += funct.sum(array);
        return  sum;
    }
    
    /**
     * Metodo responsavel por retornar a Media Simples dos Elementos de uma Matriz.
     * @param  matrix Matriz.
     * @return Media Simples dos Elementos de uma Matriz.
     */
    public Double avg(Integer[][] matrix) {
        if (matrix.length == 0)
            return null;
        return new Double(sum(matrix)) / new Double(total(matrix));
    }
    
    /**
     * Metodo responsavel por incrementar um Valor nos Elementos de uma Matriz.
     * @param  matrix Matriz.
     * @param  value Valor para Incrementar.
     */
    public void increment(Integer[][] matrix, Integer value) {
        for (Integer[] array : matrix)
            funct.increment(array, value);
    }
    
    /**
     * Metodo responsavel por decrementar um Valor nos Elementos de uma Matriz.
     * @param  matrix Matriz.
     * @param  value Valor para Decrementar.
     */
    public void decrement(Integer[][] matrix, Integer value) {
        for (Integer[] array : matrix)
            funct.decrement(array, value);
    }
    
    /**
     * Metodo responsavel por retornar a Frequencia de um Elemento em uma Matriz.
     * @param  matrix Matriz.
     * @param  element Elemento.
     * @return Frequencia de um Elemento na Matriz.
     */
    public Integer frequency(Integer[][] matrix, Integer element) {
        Integer frequency = 0;
        for (Integer[] array : matrix)
                frequency += funct.frequency(array, element);
        return  frequency;
    }
    
    public static void main(String[] args) {
        Integer[][] matrix_0 = {};
        Integer[][] matrix_1 = {{0}};
        Integer[][] matrix_2 = {{1}, {5}};
        Integer[][] matrix_3 = {{1, 7}, {5}};
        Integer[][] matrix_4 = {{0, 0}, {0, 0}};
        
        System.out.println(new FunctMatrix().positionOfMin(matrix_3));
    }
}