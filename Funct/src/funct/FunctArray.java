package funct;

import java.util.Arrays;
import java.util.Collections;

/**
 * <p>Classe de Biblioteca <b>FunctArray</b>.</p>
 * <p>Classe responsavel pelas operacoes envolvendo <b>Array</b> e <b>List</b>.</p>
 * @author Leandro
 * @since  20/11/2020
 * @see    java.util.Arrays
 * @see    java.util.List
 */
public class FunctArray {
    
    /**
     * Metodo responsavel por retornar o Maior Elemento de um Array.
     * @param  array Array.
     * @return Maior Elemento de um Array.
     */
    public Integer max(Integer[] array) { 
        if (array.length == 0)
            return null;
        Integer max = Integer.MIN_VALUE;
        for (Integer current : array)
                max = current > max ? current : max;
        return  max;
    }
    
    /**
     * Metodo responsavel por retornar a Posicao do Maior Elemento de um Array.
     * @param  array Array.
     * @return Posicao do Maior Elemento de um Array.
     */
    public Integer positionOfMax(Integer[] array) { 
        if (array.length == 0)
            return null;
        Integer max = Integer.MIN_VALUE;
        Integer pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                pos = i;
            }
        }
        return  pos;
    }
    
    /**
     * Metodo responsavel por retornar o Menor Elemento de um Array.
     * @param  array Array.
     * @return Menor Elemento de um Array.
     */
    public Integer min(Integer[] array) { 
        if (array.length == 0)
            return null;
        Integer min = Integer.MAX_VALUE;
        for (Integer current : array)
                min = current < min ? current : min;
        return  min;
    }
    
    /**
     * Metodo responsavel por retornar a Posicao do Menor Elemento de um Array.
     * @param  array Array.
     * @return Posicao do Menor Elemento de um Array.
     */
    public Integer positionOfMin(Integer[] array) { 
        if (array.length == 0)
            return null;
        Integer min = Integer.MAX_VALUE;
        Integer pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                pos = i;
            }
        }
        return  pos;
    }
    
    /**
     * Metodo responsavel por retornar a Soma dos Elementos de um Array.
     * @param  array Array.
     * @return Soma dos Elementos de um Array.
     */
    public Integer sum(Integer[] array) { 
        if (array.length == 0)
            return null;
        Integer sum  = 0;
        for (Integer current : array)
                sum += current;
        return  sum;
    }
    
    /**
     * Metodo responsavel por retornar a Media Simples dos Elementos de um Array.
     * @param  array Array.
     * @return Media Simples dos Elementos de um Array.
     */
    public Double avg(Integer[] array) {
        if (array.length == 0)
            return null;
        return new Double (sum(array)) / new Double(array.length);
    }
    
    /**
     * Metodo responsavel por incrementar um Valor nos Elementos de um Array.
     * @param  array Array.
     * @param  value Valor para Incrementar.
     */
    public void increment(Integer[] array, Integer value) {
        for (int i = 0; i < array.length; i++)
            array[i] += value;
    }
    
    /**
     * Metodo responsavel por decrementar um Valor nos Elementos de um Array.
     * @param  array Array.
     * @param  value Valor para Decrementar.
     */
    public void decrement(Integer[] array, Integer value) { 
        for (int i = 0; i < array.length; i++)
            array[i] -= value;
    }
    
    /**
     * Metodo responsavel por retornar a Frequencia de um Elemento no Array.
     * @param  array Array.
     * @param  element Elemento.
     * @return Frequencia de um Elemento no Array.
     */
    public Integer frequency(Integer[] array, Integer element) {
        Integer frequency = 0;
        for (Integer current : array) {
            if (current.equals(element))
                frequency++; 
        }
        return  frequency;
    }
    
    /**
     * Metodo responsavel por retornar o Indice de um Elemento no Array.
     * @param  array Array.
     * @param  element Elemento.
     * @return Indice de um Elemento no Array.
     */
    public Integer indexOf(Integer[] array, Integer element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element))
                return i; 
        }
        return -1;
    }
    
    /**
     * Metodo responsavel por retornar o Ultimo Indice de um Elemento no Array.
     * @param  array Array.
     * @param  element Elemento.
     * @return Ultimo Indice de um Elemento no Array.
     */
    public Integer lastIndexOf(Integer[] array, Integer element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals(element))
                return i; 
        }
        return -1;
    }
    
    /**
     * Metodo responsavel por adicionar um Elemento no Array.
     * @param array Array.
     * @param element Novo Elemento.
     */
    public void add(Integer[] array, Integer element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
    }
    
    /**
     * Metodo responsavel por remover um Elemento no Array.
     * @param  array Array.
     * @param  element Elemento a ser Removido.
     * @return Nova Array.
     */
    public Integer[] remove(Integer[] array, Integer element) {
        Integer new_[] = new Integer[array.length - frequency(array, element)];
        Integer index  = 0;
        for (Integer current : array) {
            if (current.equals(element))
                new_[index++] = current;
        }
        return  new_;
    }
    
    /**
     * Metodo responsavel por ordenar crescentemente os Elementos de um Array.
     * @param array Array.
     */
    public void sort(Integer[] array) {
        Arrays.sort(array);
    }
    
    /**
     * Metodo responsavel por ordenar decrescentemente os Elementos de um Array.
     * @param array Array.
     */
    public void reverse(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }
    
    /**
     * Metodo responsavel por retornar a Array em uma String.
     * @param  array Array.
     * @return Array em uma String.
     */
    public String getString(Integer[] array) {
        String  string  = "[";
        Integer lastPos = array.length - 1;
        for (int i = 0; i < lastPos; i++)
                string += array[i] + ", ";
        return  string +  array[lastPos] + "]";
    }
}