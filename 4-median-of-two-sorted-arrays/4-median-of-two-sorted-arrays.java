class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1= nums1.length;
        int a2= nums2.length;
        int c1= a1+a2;
        double median =0.0;
        int[] c= new int[c1];
        
        //storing nums1 source array to destination c array
        for (int i=0;i<a1;i++){
            c[i]=nums1[i];
        }
        //concatenating and storing nums2 source array to destination c array
        for(int i=0;i<a2;i++){
            c[a1+i]=nums2[i];
        }
        
        //sorting the destination array
        Arrays.sort(c);
        
        if((a1+a2)%2==0){
             median=(double)((c[((a1+a2-1)/2)])+(c[((a1+a2)/2)]))/2;
             return median;
        }
        else{
             median=(c[(a1+a2)/2]);
             return median;
        }
        
    }
}




 