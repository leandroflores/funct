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
        assertEquals(funct.toRight("String", -1), "String");
        assertEquals(funct.toRight("String", 1),  "String");
        assertEquals(funct.toRight("String", 6),  "String");
        assertEquals(funct.toRight("String", 7),  " String");
        assertEquals(funct.toRight("String", 10), "    String");
    }
    
    /**
     * Metodo responsavel por testar o metodo toLeft(String string, int size).
     */
    @Test
    public void testToLeft() {
        assertEquals(funct.toLeft("String", -1), "String");
        assertEquals(funct.toLeft("String", 1),  "String");
        assertEquals(funct.toLeft("String", 6),  "String");
        assertEquals(funct.toLeft("String", 7),  "String ");
        assertEquals(funct.toLeft("String", 10), "String    ");
    }
    
    /**
     * Metodo responsavel por testar o metodo toCenter(String string, int size).
     */
    @Test
    public void testToCenter() {
        assertEquals(funct.toCenter("String", -1), "String");
        assertEquals(funct.toCenter("String", 1),  "String");
        assertEquals(funct.toCenter("String", 6),  "String");
        assertEquals(funct.toCenter("String", 7),  "String ");
        assertEquals(funct.toCenter("String", 10), "  String  ");
        assertEquals(funct.toCenter("Strin",  10), "  Strin   ");
    }
}