import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String w : strs) {
            char[] c = w.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            
            if (map.containsKey(key)) {
            		map.get(key).add(w);
        }
        else{
        	ArrayList <String> str = new ArrayList<>();
        	str.add(w);
        	map.put(key,str);
        }

        return new ArrayList<>(map.values());
    }

}
