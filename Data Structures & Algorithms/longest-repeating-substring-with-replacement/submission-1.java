class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxC = 0;
        int best = 0;
        int[] freq = new int[26];
        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right)  - 'A']++;
            maxC = Math.max(maxC, freq[s.charAt(right)  - 'A']);

            if(right - left + 1 - maxC > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            } 

            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
