// https://leetcode.com/problems/sqrtx/
class Solution {
    public int mySqrt(int x) {
        int result = 0;
        double count = 0.0;
        double guess = x;
        if (x == 0) return 0;

        while (true){
            count++;
            if(count==200){
                result=Integer.parseInt(String.format("%.0f",Math.floor(guess)));
                break;
            }
            guess = (guess + (x/guess))/2;
        }

        return result;
    }
}