//A115 maximum-number-of-balloons
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<String, Integer> a = new HashMap<String, Integer>() {{
            put("a", 0);
            put("b", 0);
            put("o", 0);
            put("l", 0);
            put("n", 0);
        }};
        float oCheck = 0;
        float lCheck = 0;
        for (char c : text.toCharArray()){
            if (c == 'a' || c == 'b' ||  c == 'n'){
                a.put(c + "", a.get(c + "") + 1);
            }else if (c == 'o'){
                oCheck += 1;
                if ((oCheck % 2) == 0) a.put(c + "", a.get(c + "") + 1);
            }else if (c == 'l'){
                lCheck += 1;
                if ((lCheck % 2) == 0) a.put(c + "", a.get(c + "") + 1);
            }
        }
        return Collections.min(a.values());
    }
}