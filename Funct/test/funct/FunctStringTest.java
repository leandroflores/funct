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
     * Metodo responsavel por testar o metodo getString(Character character, Integer size) : String.
     */
    @Test
    public void testGetString() {
        assertEquals(funct.getString(' ', -5),  "");
        assertEquals(funct.getString('a', 0),   "");
        assertEquals(funct.getString('C', 1),   "C");
        assertEquals(funct.getString('|', 5),   "|||||");
        assertEquals(funct.getString(' ', 6),   "      ");
        assertEquals(funct.getString('z', 10),  "zzzzzzzzzz");
    }
    
    /**
     * Metodo responsavel por testar o metodo getEspacos(int size) : String.
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
     * Metodo responsavel por testar o metodo toRight(String string, int size) : String.
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
     * Metodo responsavel por testar o metodo toLeft(String string, int size) : String.
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
     * Metodo responsavel por testar o metodo toCenter(String string, int size) : String.
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
    
    /**
     * Metodo responsavel por testar o metodo countChar(String string, char character) : Long.
     */
    @Test
    public void testCountChar() {
        assertEquals(funct.countChar("", ' '), new Long(0));
        assertEquals(funct.countChar("B", 'B'),  new Long(1));
        assertEquals(funct.countChar("  ", ' '), new Long(2));
        assertEquals(funct.countChar(" A A ", 'a'), new Long(0));
        assertEquals(funct.countChar("BBBBBC", 'B'),  new Long(5));
        assertEquals(funct.countChar("ddddddd", 'd'), new Long(7));
    }
    
    /**
     * Metodo responsavel por testar o metodo reverse(String string) : String.
     */
    @Test
    public void testReverse() {
        assertEquals(funct.reverse(""),  "");
        assertEquals(funct.reverse("0"), "0");
        assertEquals(funct.reverse("AbbA"), "AbbA");
        assertEquals(funct.reverse("CCAA"), "AACC");
        assertEquals(funct.reverse("reverse"), "esrever");
        assertEquals(funct.reverse("00aaa00"), "00aaa00");
    }
    
    /**
     * Metodo responsavel por testar o metodo initUpperCase(String string) : String.
     */
    @Test
    public void testInitUpperCase() {
        assertEquals(funct.initUpperCase(""),   "");
        assertEquals(funct.initUpperCase("a"),  "A");
        assertEquals(funct.initUpperCase("aA"), "Aa");
        assertEquals(funct.initUpperCase("STRING"),   "String");
        assertEquals(funct.initUpperCase("Str_Test"), "Str_test");
        assertEquals(funct.initUpperCase("Aaabbbcc"), "Aaabbbcc");
    }
    
    /**
     * Metodo responsavel por testar o metodo getInitUpperCase(String string) : String.
     */
    @Test
    public void testGetInitUpperCase() {
        assertEquals(funct.getInitUpperCase(""),   "");
        assertEquals(funct.getInitUpperCase("a"),  "A");
        assertEquals(funct.getInitUpperCase("a bc"),   "A Bc");
        assertEquals(funct.getInitUpperCase(" a bc "), "A Bc");
        assertEquals(funct.getInitUpperCase(" a_BC "),  "A_bc");
        assertEquals(funct.getInitUpperCase("a b c d"), "A B C D");
    }
    
    /**
     * Metodo responsavel por testar o metodo getNumeros(String string) : String.
     */
    @Test
    public void testGetNumeros() {
        assertEquals(funct.getNumeros(""),  "");
        assertEquals(funct.getNumeros("A"), "");
        assertEquals(funct.getNumeros(" 1.72 "),   "172");
        assertEquals(funct.getNumeros("R$ 10,20"),  "1020");
        assertEquals(funct.getNumeros("A3 .,72 0"), "3720");
        assertEquals(funct.getNumeros("Ajfbafnda"), "");
    }
    
    /**
     * Metodo responsavel por testar o metodo removeCharEspeciais(String string) : String.
     */
    @Test
    public void testRemoveCharEspeciais() {
        assertEquals(funct.removeCharEspeciais(""),    "");
        assertEquals(funct.removeCharEspeciais("Â1"),  "A1");
        assertEquals(funct.removeCharEspeciais("123"), "123");
        assertEquals(funct.removeCharEspeciais("normal"),  "normal");
        assertEquals(funct.removeCharEspeciais("áêíõüã"),  "aeioua");
        assertEquals(funct.removeCharEspeciais("ÂÇÊÍ01 "), "ACEI01 ");
    }
    
    /**
     * Metodo responsavel por testar o metodo removeCharEspeciais(String string) : String.
     */
    @Test
    public void testMd5() {
        assertEquals(funct.md5(""),  "d41d8cd98f00b204e9800998ecf8427e");
        assertEquals(funct.md5("A"), "7fc56270e7a70fa81a5935b72eacbe29");
        assertEquals(funct.md5("12345"), "827ccb0eea8a706c4c34a16891f84e7b");
        assertEquals(funct.md5("SENHA"), "85ee0fe4f155a9af2657d85054ad63ca");
        assertEquals(funct.md5("senha"), "e8d95a51f3af4a3b134bf6bb680a213a");
    }
}