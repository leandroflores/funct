package funct;

/**
 * <p>Classe de Biblioteca <b>FunctString</b>.</p>
 * <p>Classe responsavel pelas operacoes envolvendo <b>String</b>.</p>
 * @author Leandro
 * @since  20/11/2020
 */
public class FunctString {
    
    /**
     * Metodo responsavel por retornar uma String contendo espacos.
     * @param  size Tamanho esperado.
     * @return String contendo espaços.
     */
    public String getEspacos(Integer size) {
        return size > 0 ? new String(new char[size]).replaceAll("\0", " ") : "";
    }
    
    /**
     * Metodo responsavel por retornar uma String alinhada a direita.
     * @param  string String inicial.
     * @param  size Tamanho desejado.
     * @return String alinhada a direita.
     */
    public String toRight(String string, int size) {
        if (string.length() > size) 
            return string;
        String right  = this.getEspacos(size - string.length());
               right += string;
        return right;
    }
}