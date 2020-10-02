//303

class NumArray {

    int[] arra;
    int size;

    public NumArray(int[] nums) {
        this.arra = nums;
        this.size = nums.length;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
            if(i < 0 || j > size){
                return -1;
            }

        for(int u = i; u <=j; u ++){

            sum += arra[u];
        }

        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
