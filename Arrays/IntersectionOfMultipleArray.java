class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
          for (int [] num : nums){
            for( int val : num){
              map.put(val,map.getOrDefault(val,0)+1);
            }

          }
          List<Integer> result = new ArrayList<>();
          for(int val : map.keySet()){
            if (map.get(val) == nums.length){
                result.add(val);
            }
          }
          Collections.sort(result);
          return result;
    }
}
