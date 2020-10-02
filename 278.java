//278


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        long lower = 1;
        long higher = n;

       int mid = 2;
        long sum = 0;

        if(isBadVersion(1)) return 1;
        if(!isBadVersion(n)) return n;

        while(mid > 1 && mid < n){
            sum = lower + higher;
            mid = (int)((sum)/2);
            System.out.println(mid);
            if(isBadVersion(mid) == true){
                if(isBadVersion(mid-1) ==false){
                    return mid;
                }else{

                    lower =lower;
                    higher = mid-1;
                       System.out.println(lower + " " +higher);
                }

            }else if(isBadVersion(mid) == false){
                if(isBadVersion((mid+1)) == true){
                    return mid+1;
                }else{
                    lower = mid+1;
                    higher = higher;
                       System.out.println(lower + " " +higher);
                }

            }

        }

        return mid;
    }
}
