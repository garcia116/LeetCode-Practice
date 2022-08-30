class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequencies = new int[26];
        for(char c : tasks){
            frequencies[c-'A']++;
        }
        Arrays.sort(frequencies);
        int max_freq = frequencies[25] - 1;
        int idle_spaces = max_freq * n;
        
        for(int i=24; i>=0; i--){
            idle_spaces -= Math.min(max_freq, frequencies[i]);
        }
        idle_spaces = Math.max(0, idle_spaces);
        return tasks.length + idle_spaces;
    }
}