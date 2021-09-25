package BinarySearch_704;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTests {
    @Test
    public void testBinarySearch(){
        Solution solution = new Solution();
        assertEquals(solution.search(new int[] {1, 2, 3, 4, 5}, 3), 2);
        assertEquals(solution.search(new int[] {1, 2, 3, 4, 5}, 6), -1);
        assertEquals(solution.search(new int[] {1, 2, 3, 4, 5}, 1), 0);
        assertEquals(solution.search(new int[] {1, 2, 3, 4, 5}, 5), 4);
    }

}
