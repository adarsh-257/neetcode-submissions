class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length * matrix[matrix.length-1].length -1;

        while (l<=r){
            int m = l+(r-l)/2;
            int row = m/ matrix[matrix.length-1].length;
            int c = m% matrix[matrix.length-1].length;

            if(matrix[row][c] ==  target){
                return true;
            }
            else if(matrix[row][c] < target){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return false;
    }
}
