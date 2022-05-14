class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for(int i:nums){ 
            if(i!=0){
                nums[p]=i;
                p++;
            }
        } 
        while(p<nums.length){
            nums[p]=0;
            p++;
        }
    }
}
 