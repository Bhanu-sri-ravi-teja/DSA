class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int temp = 1;
        for(int i=0; i<n-1; i++){
            if(nums[i] != temp){
                return false;
            }
            temp++;
        }
        if(nums[n-1] != --temp){
            return false;
        }
        return true;
    }
}