package SearchInsertPosition_35;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int result = 0;

        while(low <= high){
            int mid = low + (high-low)/2;

            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                high = mid - 1;
                //result = high;
            }
            else{
                low = mid + 1;
                result = low;
            }
        }
        return result < 0 ? 0 : result;
    }
}
