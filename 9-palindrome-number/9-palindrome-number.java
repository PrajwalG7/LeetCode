class Solution {
    public boolean isPalindrome(int x) {
       if(x < 0){
            return false;
        }
        if(x < 10){
            return true;
        }
    
      int temp=x;
      int r,sum=0;
      
      while(x>0){    
       //getting remainder 
           r=x%10;
      sum=(sum*10)+r;    
      x=x/10;    
      }  
    
      if(temp==sum){
        return true;
      }
      return false;
          
    }
}