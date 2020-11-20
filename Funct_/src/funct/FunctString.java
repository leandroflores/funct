package funct;

import java.util.StringTokenizer;

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
     * @param  string Cadeia de caracteres inicial.
     * @param  size Tamanho desejado.
     * @return String alinhada a direita.
     */
    public String toRight(String string, Integer size) {
        if (string.length() > size) 
            return string;
        return this.getEspacos(size - string.length()) + string;
    }
    
    /**
     * Metodo responsavel por retornar uma String alinhada a esquerda.
     * @param  string Cadeia de caracteres inicial.
     * @param  size Tamanho desejado.
     * @return String alinhada a esquerda.
     */
    public String toLeft(String string, Integer size) {
        if (string.length() > size) 
            return string;
        return string + this.getEspacos(size - string.length());
    }
    
    /**
     * Metodo responsavel por retornar uma String centralizada.
     * @param  string Cadeia de caracteres inicial.
     * @param  size Tamanho desejado.
     * @return String centralizada.
     */
    public String toCenter(String string, Integer size) {
        if (string.length() > size) 
            return string;
        Integer diff   = size - string.length();
        String  spaces = this.getEspacos(diff / 2);
        String  extra  = diff % 2 == 0 ? "" : " ";
        return  spaces + string + spaces + extra;
    }
    
    /**
     * Metodo responsavel por retornar o numero de vezes que um char aparece em uma String.
     * @param  string String a ser percorrida.
     * @param  character Caracter a ser contado.
     * @return Quantidade de Char na String.
     */
    public Long countChar(String string, char character) {
        return string.codePoints().filter(current -> current == character).count();
    }
    
    public static void main(String[] args) {
        System.out.println(new FunctString().countChar("  A  A ", 'A'));
    }
}