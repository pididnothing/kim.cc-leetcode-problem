class Solution {
    long sumofn(int n){
        return (long) n * ((long)n + 1) / 2;
    }
    
    public int[] lexSmallestNegatedPerm(int n, long target) {
        int i = n;
        long sum = sumofn(n);
        if(target>sum) return new int[]{};
        if(target*-1>sum) return new int[]{};
        int[] res = new int[n];
        while(i>=1){
            // System.out.println(sum);
            if(sum-2*i>=target){
                res[i-1] = -i;
                sum-=2*i;
            }else{
                res[i-1] = i;
            }
            i--;
        }
        if(sum==target){
            Arrays.sort(res);
            return res;
        }
        return new int[]{};
    }
}
