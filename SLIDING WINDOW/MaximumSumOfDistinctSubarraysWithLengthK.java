class MaximumSumOfDistinctSubarraysWithLengthK{
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long ans = 0;
        int wend = 0;
        int wstart = 0;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        
        //SLIDING WINDOW
        while(wend < n){
            sum += nums[wend];
            if(set.contains(nums[wend])){
                sum = nums[wend];
                wstart = wend;
            }else{
                set.add(nums[wend]);
            }
            
            //WINDOW HIT
            if(wend-wstart+1 == k){
                ans = Math.max(ans, sum);
                sum -= nums[wstart];
                set.remove(nums[wstart]);
                wstart++;
            }
            wend++;
        }
        return ans;
    }
}