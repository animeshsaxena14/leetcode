package FirstLastPosSorted_34;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTests {

    @Test
    public void TestFirstLastPosSortedArray(){
        Solution solution = new Solution();
        assertArrayEquals(solution.searchRange(new int[] {5,7,7,8,8,10}, 8), new int []{3, 4});
        assertArrayEquals(solution.searchRange(new int[] {5,7,7,8,8,10}, 6), new int []{-1, -1});
        assertArrayEquals(solution.searchRange(new int[] {}, 6), new int []{-1, -1});
        assertArrayEquals(solution.searchRange(new int[] {8,8,8,8,8,8,8,8}, 8), new int []{0, 7});

    }


}
