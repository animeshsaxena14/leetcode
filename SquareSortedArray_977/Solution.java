package SquareSortedArray_977;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        int [] resultArr = new int [nums.length];
        int resultArrCounter = resultArr.length-1;
        while (startIndex <= endIndex){
            int startVal = Math.abs(nums[startIndex]);
            int endVal = Math.abs(nums[endIndex]);
            if (startVal >= endVal){
                resultArr[resultArrCounter--] = startVal * startVal;
                startIndex++;
            }
            else{
                resultArr[resultArrCounter--] = endVal * endVal;
                endIndex--;
            }
        }
        return resultArr;
    }
}
