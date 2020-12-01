package funct;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * <p>Classe de Testes <b>FunctArrayTest</b>.</p>
 * <p>Classe responsavel por Testar os metodos da Classe <b>FunctArray</b>.</p>
 * @author Leandro
 * @since  30/11/2020
 * @see    funct.FunctArray
 */
public class FunctArrayTest {
    private final FunctArray funct;
    
    /**
     * Metodo construtor padrao da Classe.
     */
    public FunctArrayTest() {
        funct = new FunctArray();
    }

    /**
     * Metodo responsavel por testar o metodo max(Integer[] array) : Integer.
     */
    @Test
    public void testMax() {
        assertEquals(funct.max(new Integer[]{}), null);
        assertEquals(funct.max(new Integer[]{0}),  new Integer(0));
        assertEquals(funct.max(new Integer[]{-7}), new Integer(-7));
        assertEquals(funct.max(new Integer[]{-1, 0, -2}), new Integer(0));
        assertEquals(funct.max(new Integer[]{-1, 0, 12}), new Integer(12));
    }
    
    /**
     * Metodo responsavel por testar o metodo positionOfMax(Integer[] array) : Integer.
     */
    @Test
    public void testPositionOfMax() {
        assertEquals(funct.positionOfMax(new Integer[]{}), null);
        assertEquals(funct.positionOfMax(new Integer[]{0}),  new Integer(0));
        assertEquals(funct.positionOfMax(new Integer[]{-7}), new Integer(0));
        assertEquals(funct.positionOfMax(new Integer[]{-1, 0, -2}), new Integer(1));
        assertEquals(funct.positionOfMax(new Integer[]{-1, 0, 12}), new Integer(2));
    }
    
    /**
     * Metodo responsavel por testar o metodo min(Integer[] array) : Integer.
     */
    @Test
    public void testMin() {
        assertEquals(funct.min(new Integer[]{}), null);
        assertEquals(funct.min(new Integer[]{12}), new Integer(12));
        assertEquals(funct.min(new Integer[]{-9}), new Integer(-9));
        assertEquals(funct.min(new Integer[]{1, 0, 3}),  new Integer(0));
        assertEquals(funct.min(new Integer[]{1, 0, -2}), new Integer(-2));
    }
    
    /**
     * Metodo responsavel por testar o metodo positionOfMin(Integer[] array) : Integer.
     */
    @Test
    public void testPositionOfMin() {
        assertEquals(funct.positionOfMin(new Integer[]{}), null);
        assertEquals(funct.positionOfMin(new Integer[]{1}),  new Integer(0));
        assertEquals(funct.positionOfMin(new Integer[]{-3}), new Integer(0));
        assertEquals(funct.positionOfMin(new Integer[]{0, 1, -2}), new Integer(2));
        assertEquals(funct.positionOfMin(new Integer[]{1, 0, 12}), new Integer(1));
    }
    
    /**
     * Metodo responsavel por testar o metodo sum(Integer[] array) : Integer.
     */
    @Test
    public void testSum() {
        assertEquals(funct.sum(new Integer[]{}), new Integer(0));
        assertEquals(funct.sum(new Integer[]{-3}), new Integer(-3));
        assertEquals(funct.sum(new Integer[]{1, -1}), new Integer(0));
        assertEquals(funct.sum(new Integer[]{0, 1, -2}), new Integer(-1));
        assertEquals(funct.sum(new Integer[]{5, 0, 12}), new Integer(17));
    }
    
    /**
     * Metodo responsavel por testar o metodo avg(Integer[] array) : Double.
     */
    @Test
    public void testAvg() {
        assertEquals(funct.avg(new Integer[]{}), null);
        assertEquals(funct.avg(new Integer[]{-3}), new Double(-3));
        assertEquals(funct.avg(new Integer[]{1, -1}),  new Double(0));
        assertEquals(funct.avg(new Integer[]{-3, -2}), new Double(-2.5));
        assertEquals(funct.avg(new Integer[]{6, 0, 12}),  new Double(6));
    }
    
    /**
     * Metodo responsavel por testar o metodo increment(Integer[] array, Integer value) : void.
     */
    @Test
    public void testIncrement() {
        assertArrayEquals(getIncrementCase0(), new Integer[0]);
        assertArrayEquals(getIncrementCase1(), new Integer[]{9});
        assertArrayEquals(getIncrementCase2(), new Integer[]{-2, 3});
        assertArrayEquals(getIncrementCase3(), new Integer[]{5, 6, 9});
    }
    
    /**
     * Metodo responsavel por retornar o Caso Base para o Teste do metodo increment(Integer[] array, Integer value) : void.
     * @return Caso Base para o Teste do metodo increment.
     */
    private Integer[] getIncrementCase0() {
        Integer array[] = new Integer[0];
                funct.increment(array, 1);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 1 para o Teste do metodo increment(Integer[] array, Integer value) : void.
     * @return Caso 1 para o Teste do metodo increment.
     */
    private Integer[] getIncrementCase1() {
        Integer array[] = new Integer[]{9};
                funct.increment(array, 0);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 2 para o Teste do metodo increment(Integer[] array, Integer value) : void.
     * @return Caso 2 para o Teste do metodo increment.
     */
    private Integer[] getIncrementCase2() {
        Integer array[] = new Integer[]{0, 5};
                funct.increment(array, -2);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 3 para o Teste do metodo increment(Integer[] array, Integer value) : void.
     * @return Caso 3 para o Teste do metodo increment.
     */
    private Integer[] getIncrementCase3() {
        Integer array[] = new Integer[]{0, 1, 4};
                funct.increment(array, 5);
        return  array;
    }
    
    /**
     * Metodo responsavel por testar o metodo decrement(Integer[] array, Integer value) : void.
     */
    @Test
    public void testDecrement() {
        assertArrayEquals(getDecrementCase0(), new Integer[0]);
        assertArrayEquals(getDecrementCase1(), new Integer[]{1});
        assertArrayEquals(getDecrementCase2(), new Integer[]{2, 5});
        assertArrayEquals(getDecrementCase3(), new Integer[]{-3, 0, 3});
    }
    
    /**
     * Metodo responsavel por retornar o Caso Base para o Teste do metodo decrement(Integer[] array, Integer value) : void.
     * @return Caso Base para o Teste do metodo decrement.
     */
    private Integer[] getDecrementCase0() {
        Integer array[] = new Integer[0];
                funct.decrement(array, 1);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 1 para o Teste do metodo decrement(Integer[] array, Integer value) : void.
     * @return Caso 1 para o Teste do metodo decrement.
     */
    private Integer[] getDecrementCase1() {
        Integer array[] = new Integer[]{1};
                funct.decrement(array, 0);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 2 para o Teste do metodo decrement(Integer[] array, Integer value) : void.
     * @return Caso 2 para o Teste do metodo decrement.
     */
    private Integer[] getDecrementCase2() {
        Integer array[] = new Integer[]{0, 3};
                funct.decrement(array, -2);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 3 para o Teste do metodo decrement(Integer[] array, Integer value) : void.
     * @return Caso 3 para o Teste do metodo decrement.
     */
    private Integer[] getDecrementCase3() {
        Integer array[] = new Integer[]{2, 5, 8};
                funct.decrement(array, 5);
        return  array;
    }
    
    /**
     * Metodo responsavel por testar o metodo frequency(Integer[] array, Integer element) : Integer.
     */
    @Test
    public void testFrequency() {
        assertEquals(funct.frequency(new Integer[]{}, 2),   new Integer(0));
        assertEquals(funct.frequency(new Integer[]{-3}, 3), new Integer(0));
        assertEquals(funct.frequency(new Integer[]{1, 1}, 1),   new Integer(2));
        assertEquals(funct.frequency(new Integer[]{-1, -1}, 1), new Integer(0));
        assertEquals(funct.frequency(new Integer[]{2, 0, -2}, 2), new Integer(1));
    }
    
    /**
     * Metodo responsavel por testar o metodo indexOf(Integer[] array, Integer element) : Integer.
     */
    @Test
    public void testIndexOf() {
        assertEquals(funct.indexOf(new Integer[]{}, 2),   new Integer(-1));
        assertEquals(funct.indexOf(new Integer[]{-3}, 3), new Integer(-1));
        assertEquals(funct.indexOf(new Integer[]{-1, -1}, 1),  new Integer(-1));
        assertEquals(funct.indexOf(new Integer[]{0, 1, 1}, 1), new Integer(1));
        assertEquals(funct.indexOf(new Integer[]{2, 0, -2}, -2), new Integer(2));
    }
    
    /**
     * Metodo responsavel por testar o metodo lastIndexOf(Integer[] array, Integer element) : Integer.
     */
    @Test
    public void testLastIndexOf() {
        assertEquals(funct.lastIndexOf(new Integer[]{}, 2),   new Integer(-1));
        assertEquals(funct.lastIndexOf(new Integer[]{-3}, 3), new Integer(-1));
        assertEquals(funct.lastIndexOf(new Integer[]{-1, -1}, 1),   new Integer(-1));
        assertEquals(funct.lastIndexOf(new Integer[]{0, 1, 1}, 1),  new Integer(2));
        assertEquals(funct.lastIndexOf(new Integer[]{0, 1, 1}, 0),  new Integer(0));
        assertEquals(funct.lastIndexOf(new Integer[]{0, 1, 2}, 1),  new Integer(1));
        assertEquals(funct.lastIndexOf(new Integer[]{2, 0, -2}, 2), new Integer(0));
    }
    
    /**
     * Metodo responsavel por testar o metodo add(Integer[] array, Integer value) : void.
     */
    @Test
    public void testAdd() {
        assertArrayEquals(funct.add(new Integer[]{}, -1), new Integer[]{-1});
        assertArrayEquals(funct.add(new Integer[]{0}, 1), new Integer[]{0, 1});
        assertArrayEquals(funct.add(new Integer[]{-1, 0}, 1), new Integer[]{-1, 0, 1});
    }
    
    /**
     * Metodo responsavel por testar o metodo remove(Integer[] array, Integer element) : Integer[].
     */
    @Test
    public void testRemove() {
        assertArrayEquals(funct.remove(new Integer[]{}, -1), new Integer[]{});
        assertArrayEquals(funct.remove(new Integer[]{0}, 0), new Integer[]{});
        assertArrayEquals(funct.remove(new Integer[]{0, 1}, 1), new Integer[]{0});
        assertArrayEquals(funct.remove(new Integer[]{0, 1, 0}, 0),   new Integer[]{1});
        assertArrayEquals(funct.remove(new Integer[]{-1, 0, 0}, -1), new Integer[]{0, 0});
        assertArrayEquals(funct.remove(new Integer[]{2, 2, 2}, -2),  new Integer[]{2, 2, 2});
    }
    
    /**
     * Metodo responsavel por testar o metodo reverse(Integer[] array) : Integer[].
     */
    @Test
    public void testReverse() {
        assertArrayEquals(funct.reverse(new Integer[]{}),  new Integer[]{});
        assertArrayEquals(funct.reverse(new Integer[]{1}), new Integer[]{1});
        assertArrayEquals(funct.reverse(new Integer[]{0, 1}), new Integer[]{1, 0});
        assertArrayEquals(funct.reverse(new Integer[]{1, 2, 3}), new Integer[]{3, 2, 1});
        assertArrayEquals(funct.reverse(new Integer[]{1, 0, 1}), new Integer[]{1, 0, 1});
    }
    
    /**
     * Metodo responsavel por testar o metodo sort(Integer[] array) : void.
     */
    @Test
    public void testSort() {
        assertArrayEquals(getSortCase0(), new Integer[]{});
        assertArrayEquals(getSortCase1(), new Integer[]{1});
        assertArrayEquals(getSortCase2(), new Integer[]{1, 2});
        assertArrayEquals(getSortCase3(), new Integer[]{0, 1, 2, 3});
        assertArrayEquals(getSortCase4(), new Integer[]{1, 3, 5, 7});
    }
    
    /**
     * Metodo responsavel por retornar o Caso Base para o Teste do metodo sort(Integer[] array) : void.
     * @return Caso Base para o Teste do metodo sort.
     */
    private Integer[] getSortCase0() {
        Integer array[] = new Integer[0];
                funct.sort(array);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 1 para o Teste do metodo sort(Integer[] array) : void.
     * @return Caso 1 para o Teste do metodo sort.
     */
    private Integer[] getSortCase1() {
        Integer array[] = new Integer[]{1};
                funct.sort(array);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 2 para o Teste do metodo sort(Integer[] array) : void.
     * @return Caso 2 para o Teste do metodo sort.
     */
    private Integer[] getSortCase2() {
        Integer array[] = new Integer[]{1, 2};
                funct.sort(array);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 3 para o Teste do metodo sort(Integer[] array) : void.
     * @return Caso 3 para o Teste do metodo sort.
     */
    private Integer[] getSortCase3() {
        Integer array[] = new Integer[]{3, 0, 2, 1};
                funct.sort(array);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 4 para o Teste do metodo sort(Integer[] array) : void.
     * @return Caso 4 para o Teste do metodo sort.
     */
    private Integer[] getSortCase4() {
        Integer array[] = new Integer[]{7, 5, 3, 1};
                funct.sort(array);
        return  array;
    }
    
    /**
     * Metodo responsavel por testar o metodo sortDesc(Integer[] array) : void.
     */
    @Test
    public void testSortDesc() {
        assertArrayEquals(getSortDescCase0(), new Integer[]{});
        assertArrayEquals(getSortDescCase1(), new Integer[]{3});
        assertArrayEquals(getSortDescCase2(), new Integer[]{2, 1});
        assertArrayEquals(getSortDescCase3(), new Integer[]{3, 2, 1, 0});
        assertArrayEquals(getSortDescCase4(), new Integer[]{7, 5, 3, 1});
    }
    
    /**
     * Metodo responsavel por retornar o Caso Base para o Teste do metodo sortDesc(Integer[] array) : void.
     * @return Caso Base para o Teste do metodo sortDesc.
     */
    private Integer[] getSortDescCase0() {
        Integer array[] = new Integer[0];
                funct.sortDesc(array);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 1 para o Teste do metodo sortDesc(Integer[] array) : void.
     * @return Caso 1 para o Teste do metodo sortDesc.
     */
    private Integer[] getSortDescCase1() {
        Integer array[] = new Integer[]{3};
                funct.sortDesc(array);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 2 para o Teste do metodo sortDesc(Integer[] array) : void.
     * @return Caso 2 para o Teste do metodo sortDesc.
     */
    private Integer[] getSortDescCase2() {
        Integer array[] = new Integer[]{2, 1};
                funct.sortDesc(array);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 3 para o Teste do metodo sortDesc(Integer[] array) : void.
     * @return Caso 3 para o Teste do metodo sortDesc.
     */
    private Integer[] getSortDescCase3() {
        Integer array[] = new Integer[]{3, 0, 2, 1};
                funct.sortDesc(array);
        return  array;
    }
    
    /**
     * Metodo responsavel por retornar o Caso 4 para o Teste do metodo sortDesc(Integer[] array) : void.
     * @return Caso 4 para o Teste do metodo sortDesc.
     */
    private Integer[] getSortDescCase4() {
        Integer array[] = new Integer[]{1, 3, 5, 7};
                funct.sortDesc(array);
        return  array;
    }
    
    /**
     * Metodo responsavel por testar o metodo getString(Integer[] array) : String.
     */
    @Test
    public void testGetString() {
        assertEquals(funct.getString(new Integer[]{}),  "[]");
        assertEquals(funct.getString(new Integer[]{0}), "[0]");
        assertEquals(funct.getString(new Integer[]{-1, 3, 4}),  "[-1, 3, 4]");
        assertEquals(funct.getString(new Integer[]{-1, 0, -1}), "[-1, 0, -1]");
    }
}