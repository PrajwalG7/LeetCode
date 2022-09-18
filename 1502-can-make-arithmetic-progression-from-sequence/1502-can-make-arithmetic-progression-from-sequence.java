class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        Arrays.sort(arr);
        int prev_diff=arr[1]-arr[0];
        int diff=prev_diff;
        
        for(int i=0;i<arr.length-1;i++){
            prev_diff=arr[i+1]-arr[i];
            if(prev_diff!=diff){
                return false;
            }
             
        }
        return true;
        
    }
}