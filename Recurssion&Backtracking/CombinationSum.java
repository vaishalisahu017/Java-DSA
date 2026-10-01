class Solution {
        List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    //List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, 0, new ArrayList<>(), target);
        return res;
    }

    void backtrack(int[] candidates, int idx, List<Integer> diary, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(diary));
            return;
        }
        if (idx == candidates.length || target < 0) {
            return;
        }

    diary.add(candidates[idx]);
        backtrack(candidates, idx, diary, target - candidates[idx]);
        diary.remove(diary.size() - 1);
        backtrack(candidates, idx + 1, diary, target);
    }
}
    
