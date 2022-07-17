Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
  
  
Example 2:

Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
  
  
Example 3:

Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.
 

//MAIN LOGIC
  
  
class Solution{
  
  public int lcsUtil(int n,int m , String s1, String s2,int[][] dp){
        //base case
        if(n<0||m<0){
            return 0;
        }
        if(dp[n][m]!=-1) return dp[n][m];
        
        if(s1.charAt(n)==s2.charAt(m)){          
            return 1+lcsUtil(n-1,m-1,s1,s2,dp);     [" IF BOTH HAVE SAME CHAR THEN SEE IN THE BOTH STRING OTHER THEN THE CHAR " ]
        }
        
        int seq1 = lcsUtil(n-1,m,s1,s2,dp);         [" REMOVE THE CHAR FROM 1ST STRING AND THEN CHECK "]
        int seq2 = lcsUtil(n,m-1,s1,s2,dp);         [" REMOVE THE CHAR FROM 2ND STRING AND THEN CHECK "]
        
        return dp[n][m] = Math.max(seq1,seq2)+count;
    
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                
                dp[i][j] = -1;
                
            }
        }
        
        return lcsUtil(text1.length()-1,text2.length()-1,text1,text2,dp);
    }
}
