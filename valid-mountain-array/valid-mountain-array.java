class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int peak = Integer.MIN_VALUE;
        int peakIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(peak < arr[i]){
                peak = arr[i];
                peakIndex = i;
            }
        }
        if(peakIndex == arr.length-1 || peakIndex == 0){   
            return false;
        }
        for(int i = 1; i <= peakIndex; i++){
            if(arr[i - 1] >= arr[i]){
                return false;
            }
        }
        for(int i = peakIndex + 1; i < arr.length; i++){
            if(arr[i - 1] <= arr[i]){
                return false;
            }
        }
        return true;
    }
}