package SquareSortedArray_977;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SolutionTests {
    @Test
    public void testSquareSortedArray(){
        Solution solution = new Solution();
        assertArrayEquals(solution.sortedSquares(new int[] {-4,-1,0,3,10}), new int[] {0,1,9,16,100});
    }
}
