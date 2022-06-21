"MEMOIZATION APPROACH - TOP - UP"

class Solution {
    
    public int calculateUsingDp(int n , int[] dpArray){
        if(n==0)return 0;
        if(n<=2)return 1;
        if(dpArray[n]!=0)return dpArray[n];
        
        dpArray[n-1] =calculateUsingDp(n-1,dpArray);
        dpArray[n-2] = calculateUsingDp(n-2,dpArray);
        
        return dpArray[n-1]+dpArray[n-2];
    }
    
    public int fib(int n) {
        int[] dp = new int[n+1];
        return calculateUsingDp(n,dp);
    }
    
}

"TABULATION APPROACH - BOTTOM UP"
  
  //return modulo of 10^9+7
  class Solution {
    static long nthFibonacci(long n){
        //bottom up approach    - TABULATION
		long x = 0,y=1;
		if(n<2)return n;
		long ans=0;
		for(long i =2;i<=n;i++){
			ans = (x+y)%1000000007;
			x = y;
			y = ans;
		}
		return ans;
    }
}
