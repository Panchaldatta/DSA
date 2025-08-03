class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        if (words == null || words.length == 0) return res;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 0) {
                for (String key : map.keySet()) {
                    if (isPalidrome(key))   addResult(res, i, map.get(key));
                }
                continue;
            }
            for (int j = 0; j < words[i].length(); j++) {
                String s1 = words[i].substring(0, j);
                String s2 = words[i].substring(j);
                if (isPalidrome(s1)) {
                    String reversed = new StringBuilder(s2).reverse().toString();
                    if (map.containsKey(reversed)) {
                        addResult(res, map.get(reversed), i);
                    }
                }
                if (isPalidrome(s2)) {
                    String reversed = new StringBuilder(s1).reverse().toString();
                    if (map.containsKey(reversed)) {
                        addResult(res, i, map.get(reversed));
                    }
                }
            }
        }
        return res;
    } 
    public void addResult(List<List<Integer>> res, int i, int j) {
        ArrayList<Integer> temp = new ArrayList<>();
        if (i == j) return;
        temp.add(i);
        temp.add(j);
        res.add(temp);
    }
    public boolean isPalidrome(String s) {
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
