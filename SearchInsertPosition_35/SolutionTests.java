package SearchInsertPosition_35;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTests {
    @Test
    public void testSearchInsertPosition(){
        Solution solution = new Solution();
        assertEquals(solution.searchInsert(new int[] {1, 3, 5, 6}, 4), 2);
        assertEquals(solution.searchInsert(new int[] {1, 3, 5, 6}, 1), 0);
        assertEquals(solution.searchInsert(new int[] {1, 3, 5, 6}, 6), 3);
        assertEquals(solution.searchInsert(new int[] {1, 3, 5, 6}, 7), 4);
    }
}
