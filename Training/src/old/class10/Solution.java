package old.class10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<Integer> allAnagrams(String sh, String lo) {
        List<Integer> result = new ArrayList<Integer>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : sh.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> current = new HashMap<Character, Integer>();
        current.putAll(map);

        char[] cs = lo.toCharArray();
        int start = 0;
        int end = 0;
        while (end < lo.length()) {
            if (end - start < sh.length() - 1) {
                Integer itg = current.get(cs[end]);
                if (itg == null) {
                    start = end + 1;
                    end = start;
                    current.clear();
                    current.putAll(map);
                    continue;
                } else {
                    if (itg == 1) {
                        current.remove(cs[end]);
                        end++;
                        continue;
                    }
                }
                current.put(cs[end], itg - 1);
                end++;
            } else if (end - start == sh.length() - 1) {
                if (current.size() == 0) {
                    result.add(start);
                }
                current.put(cs[start], current.getOrDefault(cs[start], 0) + 1);
                start++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.allAnagrams("aab", "ababacbbaac");
    }

}
