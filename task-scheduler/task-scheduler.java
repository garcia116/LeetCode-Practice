class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(char c : tasks){
            count[c-'A']++;
        }  
        Arrays.sort(count);
        int max_count = count[25] - 1;
        int idle_spaces =  max_count * n;
        
        for(int i=24; i>=0; i--){
            idle_spaces -= Math.min(max_count, count[i]);
        }
        idle_spaces = Math.max(0, idle_spaces);
        return idle_spaces + tasks.length;
        
    }
}