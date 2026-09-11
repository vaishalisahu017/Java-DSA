class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size();
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                 if (map.get(ch) == 0) {
                    count--;
                }
            }
            if (j - i + 1 < p.length()) {
                j++;
            }
            else if (j - i + 1 == p.length()) {

                if (count == 0) {
                    ans.add(i);
                }
                char left = s.charAt(i);
                if (map.containsKey(left)) {

                    if (map.get(left) == 0) {
                        count++;
                    }
                    map.put(left, map.get(left) + 1);
                }

                i++;
                j++;
            }
        }

        return ans;
    }
}
