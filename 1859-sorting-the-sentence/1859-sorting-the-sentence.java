class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] orderedWords = new String[words.length];
        
        for(String w : words){
            int index = (w.charAt(w.length()-1) - '0') -1;
       //     System.out.println(w.charAt(w.length()-1));
            orderedWords[index] = w.substring(0, w.length() - 1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(String w : orderedWords){
            sb.append(w+" ");
        }
        
        return sb.toString().trim();
    }
}