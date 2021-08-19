package FirstUniqueChar_387;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTests {

    @Test
    public void testFirstUniqueChar(){
        Solution solution = new Solution();
        assertEquals(solution.firstUniqChar("aaaab"), 4);
        assertEquals(solution.firstUniqChar("oracle"), 0);
        assertEquals(solution.firstUniqChar("google"), 4);
        assertEquals(solution.firstUniqChar("leetcode"), 0);
        assertEquals(solution.firstUniqChar("l"), 0);
    }

}
