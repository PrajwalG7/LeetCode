 class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        
        //concept of swapping of two given values using a temporary container
        while (start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            //incrementing start and end for each iteration
            start++;
			 end--;
			 }
		 }
 }