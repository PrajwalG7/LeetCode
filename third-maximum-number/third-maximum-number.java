class Solution {
    public int thirdMax(int[] arr) {
        TreeSet<Integer>ts = new TreeSet<>();
        for(int val:arr) 
            ts.add(val);
        
        if(ts.size()>=3)
        {
            ts.pollLast();
            ts.pollLast();
        }
        
        return ts.last();
    }
}