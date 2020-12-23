//350
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());

        List<Integer> l2 = new ArrayList<>();

        for(int n : nums2){
            for(int i = 0 ; i < l1.size(); i++){
                if(l1.get(i) == n){
                    l1.remove(i);
                    l2.add(n);
                    break;
                }
            }
        }
        return l2.stream().mapToInt(x -> (int)(x)).toArray();
    }



}
