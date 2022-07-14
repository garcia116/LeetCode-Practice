class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum;
        int digit = 0;
        while(set.add(n)){
            sum = 0;
            while(n > 0){
                digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if(sum == 1){
                return true;
            } else {
                n = sum;
            }
        }
        return false;
    }
}