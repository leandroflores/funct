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
        if (matrix.length == 0)
            return true;
        for (Integer[] array : matrix) {
            if (array.length > 0)
                return false;
        }
        return true;
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
        if (isEmpty(matrix))
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
    if (isEmpty(matrix))
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
     * Metodo responsavel por retornar o Indice da Linha do Maior Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Indice da Linha do Maior Elemento de uma Matriz.
     */
    public Integer getLineIndexMax(Integer[][] matrix) {
        String position = positionOfMax(matrix);
        if (position != null)
            return Integer.parseInt(position.substring(0, position.indexOf(".")));
        return -1;
    }
    
    /**
     * Metodo responsavel por retornar a Linha do Maior Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Linha do Maior Elemento de uma Matriz.
     */
    public Integer[] getLineMax(Integer[][] matrix) {
        Integer index = getLineIndexMax(matrix);
        return  index > -1 ? matrix[index] : null;
    }
    
    /**
     * Metodo responsavel por retornar o Indice da Coluna do Maior Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Indice da Linha do Maior Elemento de uma Matriz.
     */
    public Integer getColumnIndexMax(Integer[][] matrix) {
        String position = positionOfMax(matrix);
        if (position != null)
            return Integer.parseInt(position.substring(position.indexOf(".") + 1));
        return -1;
    }
    
    /**
     * Metodo responsavel por retornar a Coluna do Maior Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Coluna do Maior Elemento de uma Matriz.
     */
    public Integer[] getColumnMax(Integer[][] matrix) {
        Integer index = getColumnIndexMax(matrix);
        return  index > -1 ? getColumn(matrix, index) : null;
    }
    
    /**
     * Metodo responsavel por retornar o Menor Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Menor Elemento de uma Matriz.
     */
    public Integer min(Integer[][] matrix) { 
        if (isEmpty(matrix))
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
        if (isEmpty(matrix))
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
     * Metodo responsavel por retornar o Indice da Linha do Menor Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Indice da Linha do Menor Elemento de uma Matriz.
     */
    public Integer getLineIndexMin(Integer[][] matrix) {
        String position = positionOfMin(matrix);
        if (position != null)
            return Integer.parseInt(position.substring(0, position.indexOf(".")));
        return -1;
    }
    
    /**
     * Metodo responsavel por retornar a Linha do Menor Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Linha do Menor Elemento de uma Matriz.
     */
    public Integer[] getLineMin(Integer[][] matrix) {
        Integer index = getLineIndexMin(matrix);
        return  index > -1 ? matrix[index] : null;
    }
    
    /**
     * Metodo responsavel por retornar o Indice da Coluna do Menor Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Indice da Linha do Menor Elemento de uma Matriz.
     */
    public Integer getColumnIndexMin(Integer[][] matrix) {
        String position = positionOfMin(matrix);
        if (position != null)
            return Integer.parseInt(position.substring(position.indexOf(".") + 1));
        return -1;
    }
    
    /**
     * Metodo responsavel por retornar a Coluna do Menor Elemento de uma Matriz.
     * @param  matrix Matriz.
     * @return Coluna do Menor Elemento de uma Matriz.
     */
    public Integer[] getColumnMin(Integer[][] matrix) {
        Integer index = getColumnIndexMin(matrix);
        return  index > -1 ? getColumn(matrix, index) : null;
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
        if (isEmpty(matrix))
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
        Integer frequency  = 0;
        for (Integer[] array : matrix)
                frequency += funct.frequency(array, element);
        return  frequency;
    }
    
    /**
     * Metodo responsavel por retornar a Diagonal Principal de uma Matriz.
     * @param  matrix Matriz.
     * @return Diagonal Principal da Matriz.
     */
    public Integer[] getPrincipalDiagonal(Integer[][] matrix) {
        if (!isSquare(matrix))
            return null;
        Integer[] diagonal = new Integer[matrix.length];
        for (int i = 0; i < matrix.length; i++) 
                  diagonal[i] = matrix[i][i];
        return    diagonal;
    }
    
    /**
     * Metodo responsavel por retornar a Diagonal Secundaria de uma Matriz.
     * @param  matrix Matriz.
     * @return Diagonal Secundaria da Matriz.
     */
    public Integer[] getSecondaryDiagonal(Integer[][] matrix) {
        if (!isSquare(matrix))
            return null;
        Integer[] diagonal = new Integer[matrix.length];
        Integer   column   = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++)
                  diagonal[i] = matrix[i][column--];
        return    diagonal;
    }
    
    /**
     * Metodo responsavel por retornar a Transposta de uma Matriz.
     * @param  matrix Matriz.
     * @return Transposta da Matriz.
     */
    public Integer[][] getTranspose(Integer[][] matrix) {
        if (matrix == null || !isMatrix(matrix))
            return null;
        Integer[][] transpose = new Integer[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return  transpose;
    }
    
    /**
     * Metodo responsavel por retornar a Coluna de uma Matriz.
     * @param  matrix Matriz.
     * @param  index Indice da Coluna.
     * @return Coluna da Matriz.
     */
    public Integer[] getColumn(Integer[][] matrix, Integer index) {
        if (matrix == null || matrix.length == 0)
            return null;
        Integer column[]  = new Integer[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            try {
                column[i] = matrix[i][index];
            }catch (Exception exception) {
                return null;
            }
        }
        return  column;
    }
    
    /**
     * Metodo responsavel por retornar o Valor da Determinante de uma Matriz.
     * @param  matrix Matriz.
     * @return Valor da Determinante de uma Matriz.
     */
    public Integer getDeterminant(Integer[][] matrix) {
        if (isEmpty(matrix) || !isSquare(matrix))
            return null;
        Integer size = matrix.length - 1;
        Integer aux[][][] = new Integer[size + 1][][];
                aux[size] = matrix;
        for (int i = 0; i < size; i++)
            aux[i] = new Integer[i + 1][i + 1];
        return getDeterminant(aux, size);
    }
    
    /**
     * Metodo responsavel por retornar o Valor da Determinante de uma Matriz.
     * @param  aux  Matriz Auxiliar.
     * @param  size Tamanho da Matriz.
     * @return Valor da Determinante de uma Matriz.
     */
    private Integer getDeterminant(Integer[][][] aux, Integer size) {
        if (size == 0)
            return aux[0][0][0];
        Integer signal = 1;
        Integer determinant;
        
        for (int i = 0; i < size; i++)
            System.arraycopy(aux[size][i], 0, aux[size - 1][i], 0, size);
        
        determinant = aux[size][size][size] * getDeterminant(aux, size - 1);
        
        for (int i = size - 1; i >= 0; i--) {
            System.arraycopy(aux[size][i + 1], 0, aux[size - 1][i], 0, size);
            signal       = -signal;
            determinant +=  signal * aux[size][i][size] * getDeterminant(aux, size - 1);
        }
        return determinant;
    }
    
    /**
     * Metodo responsavel por retornar a Matriz em uma String.
     * @param  matrix Matriz.
     * @return Matriz em uma String.
     */
    public String getString(Integer[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return "[]";
        String string  = "[" + funct.getString(matrix[0]);
        for (int i = 1; i < matrix.length; i++)
               string += ",\n " + funct.getString(matrix[i]);
        return string + "]";
    }
}