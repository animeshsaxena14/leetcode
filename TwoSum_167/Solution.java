package TwoSum_167;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; numbers[i] <= target/2; i++){
            int requiredTarget = target - numbers[i];

            //do a binary search on the remaining array for the requiredTarget
            int low = i + 1;
            int high = numbers.length - 1;

            while (low <= high){
                int mid = low + (high - low)/2;

                if (numbers[mid] == requiredTarget){
                    return new int [] {i+1, mid+1};
                }
                else if (numbers[mid] > requiredTarget){
                    high = mid - 1;
                }

                else{
                    low = mid + 1;
                }
            }
        }
        return null;
    }
}
