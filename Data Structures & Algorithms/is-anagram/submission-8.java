class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();
        for (char a: s1){
            first.put(a, first.getOrDefault(a,0)+1);
        }
        for (char b: t1){
            second.put(b, second.getOrDefault(b,0)+1);
        }

        return first.equals(second);
        

    }
}
