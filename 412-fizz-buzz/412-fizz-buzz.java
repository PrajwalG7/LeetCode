class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<String>(); 
        //check till provided length n 
        for(int i = 1; i<=n; i++){
            // "FizzBuzz" if i is divisible by 3 and 5
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            }
            // "Fizz" if i is divisible by 3.
            else if(i % 3 == 0){
                list.add("Fizz"); 
            }
            // "Buzz" if i is divisible by 5.
            else if(i % 5 == 0){
                list.add("Buzz"); 
            }
            // i (as a string) if none of the above conditions are true.
            else{
                list.add(String.valueOf(i)); 
            }
        }
        return list; 
    }
}