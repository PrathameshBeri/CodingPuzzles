//832

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length / 2; j++){
                int temp = 0;
                temp = A[i][j] ;
                A[i][j] = A[i][A[1].length - j - 1] ;
                A[i][A[1].length - j - 1] = temp;

            }
        }

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){

                if(A[i][j] == 0) A[i][j] = 1;
                else A[i][j] = 0;

            }
        }

        return A;

    }
}
