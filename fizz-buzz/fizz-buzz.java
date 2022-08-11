class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=1; i <= n; i++){
            String word="";
            if(i % 3 == 0){
                word += "Fizz";
            }
            if(i % 5 == 0){
                word += "Buzz";
            }
            if(word.equals("")){
                word = String.valueOf(i);
            }
            result.add(word);
            
        }
        return result;
    }
}