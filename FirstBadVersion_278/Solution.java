package FirstBadVersion_278;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */


public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int low = 1;
        int high = n;
        int result = 1;
        //1,2,3,4,5,6
        while (low <= high){
            int mid = low + (high-low)/2;

            if (isBadVersion(mid)){
                high = mid - 1;
                result = mid;
            }
            else{
                low = mid + 1;
            }
        }

        return result;
    }

    private boolean isBadVersion(int mid) {
        //returning a random value so that it compiles. THIS IS NOT THE CORRECT SOLUTION
        return false;
    }
}
