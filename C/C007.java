class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        HashMap<Character, Character> isomorphic = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if (isomorphic.containsKey(sc[i])){
                if(isomorphic.get(sc[i]) != tc[i]){
                    return false;
                }
                else continue;
            }
            else {
                if (isomorphic.containsValue(tc[i])){
                    return false;
                }
                isomorphic.put(sc[i], tc[i]);
            }
        }
        return true;
    }
}