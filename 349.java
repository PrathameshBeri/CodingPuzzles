//349

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 =  new HashSet<>();
        Arrays.stream(nums1).forEach(x -> s1.add(x));
        Arrays.stream(nums2).forEach(y -> s2.add(y));
        s1.retainAll(s2);

        int size = s1.size();
        int[] sizear = new int[size];
        int count = 0;
        for(Integer k : s1){
            sizear[count] = k;
            count++;
        }

        return sizear;

    }
}
