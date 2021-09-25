package RotateArray_189;

class Solution {
    public void rotate(int[] nums, int k) {

        int effK = k % nums.length;
        if (effK == 0) return;
        int startPointer = 0;
        int [] result = new int [nums.length];
        int startIndex = (nums.length - effK);
        for (int i = 0; i <= nums.length - 1; i++){
            result[i] = nums[startIndex++];
            if (startIndex > nums.length - 1){
                startIndex = 0;
            }
        }
        for (int j = 0; j < nums.length; j++){
            nums[j] = result[j];
        }


    }
}
