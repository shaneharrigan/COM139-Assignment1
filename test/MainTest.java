import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void array2DMax() {
        Main mn = new Main();
        int [][]test1 = {{1,3,6,8},{2,6,9,-1},{4,5,3,7}};
        int [][]test2 = {{-10},{-8},{-3}};
        int [][]test3 = {{100,120,150}};

        assertEquals(mn.array2DMax(test1),9);
        assertEquals(mn.array2DMax(test2),-3);
        assertEquals(mn.array2DMax(test3),150);
    }

    @org.junit.jupiter.api.Test
    void array2DMin() {
        Main mn = new Main();
        int [][]test1 = {{1,3,6,8},{2,6,9,-1},{4,5,3,7}};
        int [][]test2 = {{-10},{-8},{-3}};
        int [][]test3 = {{100,120,150}};

        assertEquals(mn.array2DMin(test1),-1);
        assertEquals(mn.array2DMin(test2),-10);
        assertEquals(mn.array2DMin(test3),100);
    }

    @org.junit.jupiter.api.Test
    void rowSum() {
        Main mn = new Main();
        int[][] test1 = {{-10},{-5},{-2}};
        int[][] test2 = {{10,5,2}};
        int[][] test3 = {{1,2,13,1},{-1,1,2,1},{4,9,2,1}};

        assertArrayEquals(mn.allRowSums(test1),new int[]{-10,-5,-2});
        assertArrayEquals(mn.allRowSums(test2),new int[]{17});
        assertArrayEquals(mn.allRowSums(test3),new int[]{17,3,16});
    }

    @org.junit.jupiter.api.Test
    void colSum() {
        Main mn = new Main();
        int [][]test1 = {{1,3,6,8},{2,6,9,-1},{4,5,3,7}};
        int [][]test2 = {{-10},{-8},{-3}};
        int [][]test3 = {{100,120,150}};

        assertEquals(mn.colSum(test1,1),14);
        assertEquals(mn.colSum(test2,0),-21);
        assertEquals(mn.colSum(test3,2),150);
    }

    @org.junit.jupiter.api.Test
    void allRowSums() {
        Main mn = new Main();
        int[][] test1 = {{-10},{-5},{-2}};
        int[][] test2 = {{10,5,2}};
        int[][] test3 = {{1,2,13,1},{-1,1,2,1},{4,9,2,1}};

        assertArrayEquals(mn.allRowSums(test1),new int[]{-10,-5,-2});
        assertArrayEquals(mn.allRowSums(test2),new int[]{17});
        assertArrayEquals(mn.allRowSums(test3),new int[]{17,3,16});
    }

    @org.junit.jupiter.api.Test
    void allColSums() {
        Main mn = new Main();
        int[][] test1 = {{-10},{-5},{-2}};
        int[][] test2 = {{10,5,2}};
        int[][] test3 = {{1,2,13,1},{-1,1,2,1},{4,9,2,1}};

        assertArrayEquals(mn.allColSums(test1),new int[]{-17});
        assertArrayEquals(mn.allColSums(test2),new int[]{10,5,2});
        assertArrayEquals(mn.allColSums(test3),new int[]{4,12,17,3});
    }

    @org.junit.jupiter.api.Test
    void isRowMagic() {
        Main mn = new Main();
        int[][] rowmagic ={{1,2,5,4},{-1,10,2,1},{5,6,2,-1}};
        int[][] colmagic ={{1,-1,4,10},{3,5,0,-6}};

        assertTrue(mn.isRowMagic(rowmagic));
        assertFalse(mn.isRowMagic(colmagic));
    }

    @org.junit.jupiter.api.Test
    void isColMagic() {
        Main mn = new Main();
        int[][] rowmagic ={{1,2,5,4},{-1,10,2,1},{5,6,2,-1}};
        int[][] colmagic ={{1,-1,4,10},{3,5,0,-6}};

        assertTrue(mn.isColMagic(colmagic));
        assertFalse(mn.isColMagic(rowmagic));
    }

    @org.junit.jupiter.api.Test
    void isRowEvenInc() {
        Main mn = new Main();
        int[][] inc ={{1,-2,5,-4},{-1,2,2,1},{5,6,2,-1}};
        int[][] dec ={{1,-1,4,10},{3,5,2,-6}};
        assertTrue(mn.isRowEvenInc(inc));
        assertFalse(mn.isRowEvenInc(dec));
    }

    @org.junit.jupiter.api.Test
    void isColOddDec() {
        Main mn = new Main();
        int[][] dec ={{1,1,2,-11},{-1,0,-3,1},{5,-1,-5,-1}};
        int[][] inc ={{1,-1,4,10},{3,5,0,-6}};

        assertTrue(mn.isColOddDec(dec));
        assertFalse(mn.isColOddDec(inc));
    }
}