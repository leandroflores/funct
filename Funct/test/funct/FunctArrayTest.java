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
}