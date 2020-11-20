package funct;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * <p>Classe de Testes <b>FunctStringTest</b>.</p>
 * <p>Classe responsavel por Testar os metodos da Classe <b>FunctString</b>.</p>
 * @author Leandro
 * @since  20/11/2020
 * @see    funct.FunctString
 */
public class FunctStringTest {
    private final FunctString funct;
    
    /**
     * Metodo construtor padrao da Classe.
     */
    public FunctStringTest() {
        funct = new FunctString();
    }

    /**
     * Metodo responsavel por testar o metodo getEspacos(int size).
     */
    @Test
    public void testGetEspacos() {
        assertEquals(funct.getEspacos(-5),  "");
        assertEquals(funct.getEspacos(-1),  "");
        assertEquals(funct.getEspacos(0),   "");
        assertEquals(funct.getEspacos(1),   " ");
        assertEquals(funct.getEspacos(5),   "     ");
        assertEquals(funct.getEspacos(10),  "          ");
        assertEquals(funct.getEspacos(20),  "                    ");
    }
    
    /**
     * Metodo responsavel por testar o metodo toRight(String string, int size).
     */
    @Test
    public void testToRigth() {
        assertEquals(funct.toRight("Test", -1),  "T");
        //assertEquals(funct.getEspacos(-1),  "");
    }
}
