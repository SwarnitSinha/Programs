91. Decode Ways\

 "11106" can be mapped into:

"AAJF" with the grouping (1 1 10 6)
"KJF" with the grouping (11 10 6)
  
  Example 1:

Input: s = "12"
Output: 2
Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
Example 2:

Input: s = "226"
Output: 3
Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
  
  "CODE"
  
  class Solution {
    
    public int decodingUtil(int ind,String s,int[] dp){
        if(ind == s.length())return 1;
        if(ind>s.length())return 0;
        
        if(s.charAt(ind)=='0')return 0;
        //take 1 or take 2
        
        if(dp[ind]!=-1) return dp[ind];
        
        int take1 = decodingUtil(ind+1,s,dp);
        int take2 = 0;
        
        if(ind<(s.length()-1)){
            // System.out.println((int)(s.charAt(ind)-'0'));
            int temp = ((s.charAt(ind) - '0'))*10 + (s.charAt(ind+1)-'0');
                // System.out.println("temp : "+temp);
            if(temp<=26){
                take2 = decodingUtil(ind+2,s,dp);
            }
            
        }
        // System.out.println(take1+" "+take2);
        return dp[ind] = take1+take2;
        
    }
    
    //dp - slightly different than take not-take problem
    public int numDecodings(String s) {
        //no. of ways to decode
        int[] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        int num = decodingUtil(0,s,dp);
        return num;
        
    }
}
