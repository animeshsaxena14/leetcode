package MoveZeros_283;

class Solution {
    public void moveZeroes(int[] nums) {
        int resultIndex = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[resultIndex++] = nums[i];
            }

        }

        for (int i = resultIndex; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
