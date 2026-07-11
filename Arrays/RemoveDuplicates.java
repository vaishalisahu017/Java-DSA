class Solution {
        public int removeDuplicates(int[] nums) {
    if(nums.length == 0)
        return 0;
    int first= 0;
    for(int end = 1; end < nums.length; end++) {
        if(nums[end] != nums[first]) {
            first++;
            nums[first] = nums[end];
        }
    }
    return first + 1;
}

    }
