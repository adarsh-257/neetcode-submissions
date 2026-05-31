class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =0;
        int right = Arrays.stream(piles).max().getAsInt();
        int result = right;

        while(left<=right){
            int middle = left+(right-left)/2;
            int time =0;
            for (int c: piles){
                time += Math.ceil((double)c / middle);
            }
            if(time <=h){
                result = middle;
                right = middle - 1;

            }
            else{
                left = middle+1;
            }

        }
        return result;


    }
}
