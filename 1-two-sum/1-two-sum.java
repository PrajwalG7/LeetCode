class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result_array[]= new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                      result_array[0]=i;
                    result_array[1]=j;
                    break;
                }
            }
        }
        return result_array;
        
    }
}