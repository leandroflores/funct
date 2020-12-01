package funct;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * <p>Classe de Testes <b>FunctMatrixTest</b>.</p>
 * <p>Classe responsavel por Testar os metodos da Classe <b>FunctMatrix</b>.</p>
 * @author Leandro
 * @since  01/12/2020
 * @see    funct.FunctMatrix
 */
public class FunctMatrixTest {
    private final FunctMatrix funct;
    
    /**
     * Metodo construtor padrao da Classe.
     */
    public FunctMatrixTest() {
        funct = new FunctMatrix();
    }

    /**
     * Metodo responsavel por testar o metodo total(Integer[][] matrix) : Integer.
     */
    @Test
    public void testTotal() {
        assertEquals(funct.total(new Integer[][]{}), new Integer(0));
        assertEquals(funct.total(new Integer[][]{{-1}}), new Integer(1));
        assertEquals(funct.total(new Integer[][]{{-1}, {0, 3}}), new Integer(3));
        assertEquals(funct.total(new Integer[][]{{-1, 0}, {0, 1}}),  new Integer(4));
        assertEquals(funct.total(new Integer[][]{{-1, 0, 0, 1, 4}}), new Integer(5));
    }
    
    /**
     * Metodo responsavel por testar o metodo elements(Integer[][] matrix) : Integer[].
     */
    @Test
    public void testElements() {
        assertArrayEquals(funct.elements(new Integer[][]{}), new Integer[]{});
        assertArrayEquals(funct.elements(new Integer[][]{{-1}}), new Integer[]{-1});
        assertArrayEquals(funct.elements(new Integer[][]{{-1, 0}}),   new Integer[]{-1, 0});
        assertArrayEquals(funct.elements(new Integer[][]{{-1}, {0}}), new Integer[]{-1, 0});
        assertArrayEquals(funct.elements(new Integer[][]{{1, 2}, {3, 4, 5}}), new Integer[]{1, 2, 3, 4, 5});
    }
    
    /**
     * Metodo responsavel por testar o metodo isEmpty(Integer[][] matrix) : Boolean.
     */
    @Test
    public void testIsEmpty() {
        assertTrue(funct.isEmpty(new Integer[][]{}));
        assertTrue(funct.isEmpty(new Integer[][]{{}}));
        assertFalse(funct.isEmpty(new Integer[][]{{1}}));
        assertTrue(funct.isEmpty(new Integer[][]{{}, {}, {}}));
        assertFalse(funct.isEmpty(new Integer[][]{{}, {0}, {}}));
    }
    
    /**
     * Metodo responsavel por testar o metodo isSquare(Integer[][] matrix) : Boolean.
     */
    @Test
    public void testIsSquare() {
        assertTrue(funct.isSquare(new Integer[][]{}));
        assertFalse(funct.isSquare(new Integer[][]{{}}));
        assertTrue(funct.isSquare(new Integer[][]{{0}}));
        assertFalse(funct.isSquare(new Integer[][]{{1}, {0}}));
        assertFalse(funct.isSquare(new Integer[][]{{1}, {0, -1}}));
        assertTrue(funct.isSquare(new Integer[][]{{1, 2}, {0, -1}}));
        assertFalse(funct.isSquare(new Integer[][]{{1, 2, 3}, {0}}));
    }
    
    /**
     * Metodo responsavel por testar o metodo isMatrix(Integer[][] matrix) : Boolean.
     */
    @Test
    public void testIsMatrix() {
        assertFalse(funct.isMatrix(new Integer[][]{}));
        assertTrue(funct.isMatrix(new Integer[][]{{1}}));
        assertFalse(funct.isMatrix(new Integer[][]{{}, {0}}));
        assertTrue(funct.isMatrix(new Integer[][]{{1, 2, 3}, {0, 3, 6}}));
        assertFalse(funct.isMatrix(new Integer[][]{{1, 2}, {0, 3}, {6}}));
        assertFalse(funct.isMatrix(new Integer[][]{{1}, {0, 3}, {6}}));
        assertTrue(funct.isMatrix(new Integer[][]{{1, 0, 3, 6}}));
    }
    
    /**
     * Metodo responsavel por testar o metodo max(Integer[][] matrix) : Integer.
     */
    @Test
    public void testMax() {
        assertEquals(funct.max(new Integer[][]{}),   null);
        assertEquals(funct.max(new Integer[][]{{}}), null);
        assertEquals(funct.max(new Integer[][]{{-5}}), new Integer(-5));
        assertEquals(funct.max(new Integer[][]{{-5}, {-2}}),  new Integer(-2));
        assertEquals(funct.max(new Integer[][]{{-5, 0, -2}}), new Integer(0));
        assertEquals(funct.max(new Integer[][]{{1, 0}, {3, -2}}), new Integer(3));
    }
    
    /**
     * Metodo responsavel por testar o metodo positionOfMax(Integer[][] matrix) : String.
     */
    @Test
    public void testPositionOfMax() {
        assertEquals(funct.positionOfMax(new Integer[][]{}),   null);
        assertEquals(funct.positionOfMax(new Integer[][]{{}}), null);
        assertEquals(funct.positionOfMax(new Integer[][]{{-3}}), "0.0");
        assertEquals(funct.positionOfMax(new Integer[][]{{-5}, {-2}}),  "1.0");
        assertEquals(funct.positionOfMax(new Integer[][]{{-5, 0, -2}}), "0.1");
        assertEquals(funct.positionOfMax(new Integer[][]{{1, 0}, {-2, 3}}), "1.1");
    }
    
    /**
     * Metodo responsavel por testar o metodo getLineIndexMax(Integer[][] matrix) : Integer.
     */
    @Test
    public void testGetLineIndexMax() {
        assertEquals(funct.getLineIndexMax(new Integer[][]{}), new Integer(-1));
        assertEquals(funct.getLineIndexMax(new Integer[][]{{-5}}), new Integer(0));
        assertEquals(funct.getLineIndexMax(new Integer[][]{{}, {}, {}}),    new Integer(-1));
        assertEquals(funct.getLineIndexMax(new Integer[][]{{0, 1, 2, 3}}),  new Integer(0));
        assertEquals(funct.getLineIndexMax(new Integer[][]{{0}, {5}, {7}}), new Integer(2));
    }
    
    /**
     * Metodo responsavel por testar o metodo getLineMax(Integer[][] matrix) : Integer[].
     */
    @Test
    public void testGetLineMax() {
        assertArrayEquals(funct.getLineMax(new Integer[][]{}), null);
        assertArrayEquals(funct.getLineMax(new Integer[][]{{}}), null);
        assertArrayEquals(funct.getLineMax(new Integer[][]{{}, {}}), null);
        assertArrayEquals(funct.getLineMax(new Integer[][]{{-5}}),   new Integer[]{-5});
        assertArrayEquals(funct.getLineMax(new Integer[][]{{-1, 0, -3}}), new Integer[]{-1, 0, -3});
        assertArrayEquals(funct.getLineMax(new Integer[][]{{-1}, {0}, {-3}, {7, 0}}), new Integer[]{7, 0});
    }
    
    /**
     * Metodo responsavel por testar o metodo getColumnIndexMax(Integer[][] matrix) : Integer.
     */
    @Test
    public void testGetColumnIndexMax() {
        assertEquals(funct.getColumnIndexMax(new Integer[][]{}), new Integer(-1));
        assertEquals(funct.getColumnIndexMax(new Integer[][]{{}}), new Integer(-1));
        assertEquals(funct.getColumnIndexMax(new Integer[][]{{-4}}), new Integer(0));
        assertEquals(funct.getColumnIndexMax(new Integer[][]{{-4}, {1}}), new Integer(0));
        assertEquals(funct.getColumnIndexMax(new Integer[][]{{0, 3}, {1, 2}}), new Integer(1));
    }
    
    /**
     * Metodo responsavel por testar o metodo getColumnMax(Integer[][] matrix) : Integer[].
     */
    @Test
    public void testGetColumnMax() {
        assertArrayEquals(funct.getColumnMax(new Integer[][]{}), null);
        assertArrayEquals(funct.getColumnMax(new Integer[][]{{}, {}}), null);
        assertArrayEquals(funct.getColumnMax(new Integer[][]{{1}, {0}}), new Integer[]{1, 0});
        assertArrayEquals(funct.getColumnMax(new Integer[][]{{-7}, {0}, {9}}),  new Integer[]{-7, 0, 9});
        assertArrayEquals(funct.getColumnMax(new Integer[][]{{1, -3}, {0, 3}}), new Integer[]{-3, 3});
    }
    
    /**
     * Metodo responsavel por testar o metodo min(Integer[][] matrix) : Integer.
     */
    @Test
    public void testMin() {
        assertEquals(funct.min(new Integer[][]{}),   null);
        assertEquals(funct.min(new Integer[][]{{}}), null);
        assertEquals(funct.min(new Integer[][]{{10}}), new Integer(10));
        assertEquals(funct.min(new Integer[][]{{0}, {-7}}), new Integer(-7));
        assertEquals(funct.min(new Integer[][]{{5, 2, 7}}), new Integer(2));
        assertEquals(funct.min(new Integer[][]{{1, 0}, {3, -2}}), new Integer(-2));
    }
    
    /**
     * Metodo responsavel por testar o metodo positionOfMin(Integer[][] matrix) : String.
     */
    @Test
    public void testPositionOfMin() {
        assertEquals(funct.positionOfMin(new Integer[][]{}),   null);
        assertEquals(funct.positionOfMin(new Integer[][]{{}}), null);
        assertEquals(funct.positionOfMin(new Integer[][]{{5}}), "0.0");
        assertEquals(funct.positionOfMin(new Integer[][]{{1}, {0}}), "1.0");
        assertEquals(funct.positionOfMin(new Integer[][]{{3, 2, 1, 0}}), "0.3");
        assertEquals(funct.positionOfMin(new Integer[][]{{1, 0}, {2, -3}}), "1.1");
    }
    
    /**
     * Metodo responsavel por testar o metodo getLineIndexMin(Integer[][] matrix) : Integer.
     */
    @Test
    public void testGetLineIndexMin() {
        assertEquals(funct.getLineIndexMin(new Integer[][]{}), new Integer(-1));
        assertEquals(funct.getLineIndexMin(new Integer[][]{{15}}), new Integer(0));
        assertEquals(funct.getLineIndexMin(new Integer[][]{{}, {}, {}}),    new Integer(-1));
        assertEquals(funct.getLineIndexMin(new Integer[][]{{7, 6, 9, 8}}),  new Integer(0));
        assertEquals(funct.getLineIndexMin(new Integer[][]{{9}, {8}, {2}}), new Integer(2));
    }
    
    /**
     * Metodo responsavel por testar o metodo getLineMin(Integer[][] matrix) : Integer[].
     */
    @Test
    public void testGetLineMin() {
        assertArrayEquals(funct.getLineMin(new Integer[][]{}), null);
        assertArrayEquals(funct.getLineMin(new Integer[][]{{}}), null);
        assertArrayEquals(funct.getLineMin(new Integer[][]{{}, {}}), null);
        assertArrayEquals(funct.getLineMin(new Integer[][]{{25}}),   new Integer[]{25});
        assertArrayEquals(funct.getLineMin(new Integer[][]{{1, 0, -3}}), new Integer[]{1, 0, -3});
        assertArrayEquals(funct.getLineMin(new Integer[][]{{-1}, {0}, {-3, 9}, {7, 0}}), new Integer[]{-3, 9});
    }
    
    /**
     * Metodo responsavel por testar o metodo getColumnIndexMin(Integer[][] matrix) : Integer.
     */
    @Test
    public void testGetColumnIndexMin() {
        assertEquals(funct.getColumnIndexMin(new Integer[][]{}), new Integer(-1));
        assertEquals(funct.getColumnIndexMin(new Integer[][]{{}}), new Integer(-1));
        assertEquals(funct.getColumnIndexMin(new Integer[][]{{42}}), new Integer(0));
        assertEquals(funct.getColumnIndexMin(new Integer[][]{{4}, {1}}), new Integer(0));
        assertEquals(funct.getColumnIndexMin(new Integer[][]{{0, 3}, {1, -2}}), new Integer(1));
    }
    
    /**
     * Metodo responsavel por testar o metodo getColumnMin(Integer[][] matrix) : Integer[].
     */
    @Test
    public void testGetColumnMin() {
        assertArrayEquals(funct.getColumnMin(new Integer[][]{}), null);
        assertArrayEquals(funct.getColumnMin(new Integer[][]{{}, {}}), null);
        assertArrayEquals(funct.getColumnMin(new Integer[][]{{-1}, {0}}), new Integer[]{-1, 0});
        assertArrayEquals(funct.getColumnMin(new Integer[][]{{-7}, {0}, {9}}),  new Integer[]{-7, 0, 9});
        assertArrayEquals(funct.getColumnMin(new Integer[][]{{-1, 3}, {0, 3}}), new Integer[]{-1, 0});
    }
    
    /**
     * Metodo responsavel por testar o metodo sum(Integer[][] matrix) : Integer.
     */
    @Test
    public void testSum() {
        assertEquals(funct.sum(new Integer[][]{}), new Integer(0));
        assertEquals(funct.sum(new Integer[][]{{}}), new Integer(0));
        assertEquals(funct.sum(new Integer[][]{{-1}, {}}), new Integer(-1));
        assertEquals(funct.sum(new Integer[][]{{-1}, {0}, {1, 2}}), new Integer(2));
        assertEquals(funct.sum(new Integer[][]{{-1, 0, 1, 2, 0, -2}}), new Integer(0));
        assertEquals(funct.sum(new Integer[][]{{1, 2, 3}, {4, 5, 6}}), new Integer(21));
    }
    
    /**
     * Metodo responsavel por testar o metodo avg(Integer[][] matrix) : Double.
     */
    @Test
    public void testAvg() {
        assertEquals(funct.avg(new Integer[][]{}), null);
        assertEquals(funct.avg(new Integer[][]{{}}), null);
        assertEquals(funct.avg(new Integer[][]{{-1}, {}}), new Double(-1));
        assertEquals(funct.avg(new Integer[][]{{-1}, {0}, {1, 2}}), new Double(0.5));
        assertEquals(funct.avg(new Integer[][]{{-1, 0, 1, 2, 0, -2}}), new Double(0.0));
        assertEquals(funct.avg(new Integer[][]{{1, 2}, {4, 5}}), new Double(3));
    }
    
    /**
     * Metodo responsavel por testar o metodo frequency(Integer[][] matrix, Integer element) : Integer.
     */
    @Test
    public void testFrequency() {
        assertEquals(funct.frequency(new Integer[][]{}, 1), new Integer(0));
        assertEquals(funct.frequency(new Integer[][]{{}, {}}, 0), new Integer(0));
        assertEquals(funct.frequency(new Integer[][]{{1}, {2}}, 0), new Integer(0));
        assertEquals(funct.frequency(new Integer[][]{{1, 2}, {2, 0}}, 2), new Integer(2));
        assertEquals(funct.frequency(new Integer[][]{{1, 1}, {-1, 0}}, -1),  new Integer(1));
        assertEquals(funct.frequency(new Integer[][]{{1, 1}, {1, 1, 1}}, 1), new Integer(5));
    }
    
    /**
     * Metodo responsavel por testar o metodo getDeterminant(Integer[][] matrix) : Integer.
     */
    @Test
    public void testGetDeterminant() {
        assertEquals(funct.getDeterminant(new Integer[][]{}), null);
        assertEquals(funct.getDeterminant(new Integer[][]{{-8}}), new Integer(-8));
        assertEquals(funct.getDeterminant(new Integer[][]{{1}, {0}}), null);
        assertEquals(funct.getDeterminant(new Integer[][]{{1, 2}, {3, 1}}), new Integer(-5));
        assertEquals(funct.getDeterminant(new Integer[][]{{2, 2}, {3, 4}}), new Integer(2));
    }
    
    /**
     * Metodo responsavel por testar o metodo getString(Integer[][] matrix) : String.
     */
    @Test
    public void testGetString() {
        assertEquals(funct.getString(new Integer[][]{}),  "[]");
        assertEquals(funct.getString(new Integer[][]{{0}}), "[[0]]");
        assertEquals(funct.getString(new Integer[][]{{-1}, {3, 4}}), "[[-1],\n [3, 4]]");
        assertEquals(funct.getString(new Integer[][]{{0, 1}, {1, 0}}), "[[0, 1],\n [1, 0]]");
        assertEquals(funct.getString(new Integer[][]{{0}, {1}, {2}, {}}), "[[0],\n [1],\n [2],\n []]");
    }
}