class MaxSumSubarrayOfSizeK{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        int wstart = 0;
        int wend = 0;
        long sum = 0, ans = 0;
        
        while(wend < N){
            sum += Arr.get(wend);
            if(wend-wstart+1 == K){
                ans = Math.max(ans, sum);
                sum -= Arr.get(wstart);
                wstart += 1;
            }
            wend++;
        }
        return ans;
    }
}