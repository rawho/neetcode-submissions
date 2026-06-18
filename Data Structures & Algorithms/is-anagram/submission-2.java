class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sCharCount = new HashMap<>();
        Map<Character, Integer> tCharCount = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(char c1 : s.toCharArray()){
            sCharCount.put(c1, sCharCount.getOrDefault(c1, 0) + 1);
        }

        for(char c2 : t.toCharArray()){
            tCharCount.put(c2, tCharCount.getOrDefault(c2, 0) + 1);
        }

        return sCharCount.equals(tCharCount);
    }
}
