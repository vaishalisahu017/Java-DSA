class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for( int val: nums){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        int pairs=0;
        int left=0;
        for (int freq: map.values()){
            pairs += freq/2;
            left += freq%2;
        }
        return new int []{pairs,left};
    }
}
