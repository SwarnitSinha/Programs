When we find mid

Then any "One" side of it will be sorted - so search in them if not found then do the same for the rest of the array

class Solution {
    public int search(int[] nums, int target) {
        //swarnit sinha is greatest of great
        
        int l = 0, r = nums.length-1;
        while(l<=r){
            int m = (l+r)/2;
            if(nums[m]==target) return m;
            if(nums[l]<=nums[m]){
                //sorted part
                if(target>=nums[l]&&target<nums[m]){
                    //its present in the sorted part
                    r = m-1;
                }
                else{ l = m+1;}
            }
            else{
                if(target>nums[m]&&target<=nums[r]){
                    l = m+1;
                }
                else{
                    r = m-1;
                }
            }
        }
        return -1;
    }
}
