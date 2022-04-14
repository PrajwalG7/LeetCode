 class Solution {
public int reverse(int x) {
    boolean negative = false;
    
    if(x<0) {
        x = 0-x;
        negative = true;
    }
    
    double ans = 0;
    
    while(x>0) {
        int mod = x%10;
        ans = (ans*10) + mod;
        x = x/10;
    }
    
    //If reversing x causes the value to go outside the signed 32-bit integer range       // [-231, 231 - 1], then return 0.
    ans = (ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE) ? 0 : ans;
    
    return (int) (negative ? 0-ans : ans);
}
 }