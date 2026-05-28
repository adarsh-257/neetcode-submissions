class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Integer> repeat= new HashMap<>();
        for (int a : nums){
            if(repeat.containsKey(a)){
                return true;
            }
            repeat.put(a,1);
        }
        return false;

        
    }
}