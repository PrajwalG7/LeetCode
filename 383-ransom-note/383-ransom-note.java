 class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[30];
        
        if(magazine.length() < ransomNote.length()){
            return false;
        }
        for(int i = 0; i < magazine.length(); i++){
            arr[magazine.charAt(i) - 'a']++;
            
        } 
        for(int i = 0; i < ransomNote.length(); i++){
            if(arr[ransomNote.charAt(i) - 'a'] == 0){
                return false;
            }
            arr[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
 