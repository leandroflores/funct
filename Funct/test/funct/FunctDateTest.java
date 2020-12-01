package funct;

import java.sql.Time;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * <p>Classe de Testes <b>FunctDateTest</b>.</p>
 * <p>Classe responsavel por Testar os metodos da Classe <b>FunctDate</b>.</p>
 * @author Leandro
 * @since  20/11/2020
 * @see    funct.FunctDate
 */
public class FunctDateTest {
    private final FunctDate funct;
    
    /**
     * Metodo construtor padrao da Classe.
     */
    public FunctDateTest() {
        funct = new FunctDate();
    }

    /**
     * Metodo responsavel por testar o metodo getCurrentDate() : Date.
     */
    @Test
    public void testGetCurrentDate() {
        assertEquals(funct.getCurrentDate(), new Date());
    }
    
    /**
     * Metodo responsavel por testar o metodo getCurrentTime() : Time.
     */
    @Test
    public void testGetCurrentTime() {
        assertEquals(funct.getCurrentTime(), new Time(new Date().getTime()));
    }
}
