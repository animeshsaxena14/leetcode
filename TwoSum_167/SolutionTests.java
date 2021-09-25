package TwoSum_167;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SolutionTests {
    @Test
    public void testTwoSum(){
        Solution solution = new Solution();
        assertArrayEquals(solution.twoSum(new int[] {2,7,11,15}, 9), new int [] {1, 2});

    }
}
