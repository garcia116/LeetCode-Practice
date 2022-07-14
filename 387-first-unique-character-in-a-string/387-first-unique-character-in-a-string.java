class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                count++;
                map.put(c, count);
            }
            else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
        for(int i=0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
              return i;  
            } 
        }
        return -1;
    }
}