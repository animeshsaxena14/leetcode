package FirstLastPosSorted_34;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] indices = new int [2];
        indices[0] = findFirstOccurance(nums, target);
        indices[1] = findLastOccurance(nums, target);
        return indices;

    }

    public int findFirstOccurance (int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int midPoint = start + (end-start)/2;
            if (target > nums[midPoint]){
                start = midPoint + 1;
            }
            if (target <= nums[midPoint]){
                end = midPoint - 1;
            }
            if (target == nums[midPoint]) index = midPoint;

        }

        return index;
    }

    public int findLastOccurance (int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int midPoint = start + (end-start)/2;
            if (target >= nums[midPoint]){
                start = midPoint + 1;
            }
            if (target < nums[midPoint]){
                end = midPoint - 1;
            }
            if (target == nums[midPoint]) index = midPoint;

        }



        return index;

    }
}
