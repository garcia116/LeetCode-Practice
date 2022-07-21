class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        for(String a : word1){
            s1.append(a);
        }
        for(String b : word2){
            s2.append(b);
        }
        return (s1.toString().compareTo(s2.toString()) == 0) ? true : false;
    }
}