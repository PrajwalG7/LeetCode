  class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int zero = 0;
        for(int i : arr) {
            set.add(i);
            if(i == 0) 
                zero++;
        }
        for(int i : arr) {
            if(i == 0 && zero > 1)  
                return true;
            else if(i != 0 && set.contains(2 * i)) 
                return true;
        }
        return false;
    }
}




 