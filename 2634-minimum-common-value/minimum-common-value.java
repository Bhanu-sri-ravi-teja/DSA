class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i : nums1){
            for(int j=0; j<nums2.length; j++){
                if(i == nums2[j]){
                    return i;
                }else if(i < nums2[j]){
                    break;
                }
            }
        }
        return -1;
    }
}