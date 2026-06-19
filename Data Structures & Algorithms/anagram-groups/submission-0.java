class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(Character c : s.toCharArray()){
                count[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for(int i : count){
                key.append(i);
                key.append("#");
            }

            map.computeIfAbsent(key.toString(), k->new ArrayList<>()).add(s);

        }

        List<List<String>> result = new ArrayList<>();
        map.forEach((k, v) -> {
            result.add(v);
        });

        return result;
    }
}
