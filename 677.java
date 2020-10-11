//677
class MapSum {

    HashMap<String, Integer> hm;

    /** Initialize your data structure here. */
    public MapSum() {

        hm = new HashMap<>();

    }

    public void insert(String key, int val) {

        hm.put(key, val);

    }

    public int sum(String prefix) {

        int count = 0;

        for(String s : hm.keySet()){
            if(s.indexOf(prefix, 0) == 0) count += hm.get(s);
        }

        return count;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
