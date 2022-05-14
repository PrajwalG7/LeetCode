class Solution {
    public int heightChecker(int[] heights) {
       
        int new_heights[]=new int[heights.length];
        int count=0;
        for(int i=0;i<heights.length;i++){
            new_heights[i]=heights[i];
        }
          Arrays.sort(heights);
        for(int j=0;j<heights.length;j++){
            if(heights[j]!=new_heights[j]){
                count++;
            }
        }
        return count;
    }
}