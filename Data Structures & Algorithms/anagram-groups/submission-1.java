class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            map.putIfAbsent(String.valueOf(arr), new ArrayList<>());
            map.get(String.valueOf(arr)).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
