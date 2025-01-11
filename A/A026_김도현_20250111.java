class Solution {
    public boolean solution(int x) {
        String k = String.valueOf(x);
        int n = 0;
        for(char c: k.toCharArray()){
            n += Integer.parseInt(String.valueOf(c));
        }
        return x % n == 0;
    }
}