//1572
class Solution {
    public int diagonalSum(int[][] mat) {

        int r = mat.length;
        int c = mat[0].length;
        System.out.println(c);
        long count = 0;

        for(int i = 0; i < r ; i++){
            System.out.println(i);
            count += mat[i][i];
            count += mat[i][c - i-1];

        }

        if(r % 2 != 0) count -= mat[r/2][c/2];

        return (int)count;

    }
}
