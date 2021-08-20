package FirstUniqueChar_387;

class Solution {
    public int firstUniqChar(String s) {
        int[] countArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            countArr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++){
            if (countArr[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }

    public static void main(String ar[]) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("aabb"));

    }


}