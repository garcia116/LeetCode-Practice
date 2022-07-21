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
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        s1.toString();
        s2.toString();
        
        return (s1.compareTo(s2) == 0) ? true : false;
    }
}