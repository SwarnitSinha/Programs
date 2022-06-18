Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

A palindrome string is a string that reads the same backward as forward.

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]

Code : -

class Solution {

     public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        PalindromePart(s,list,ans);
        return ans;
    }

    public boolean isPalindrome(String s){
        int l =0,r = s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
    public void PalindromePart(String s, List<String> list, List<List<String>> ans){
        //base case
        if(s.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i =0;i<s.length();i++){
   
            String cur = s.substring(0,i+1);
            String restString = s.substring(i+1,s.length());
            
            if(isPalindrome(cur)){
                list.add(cur);
                PalindromePart(restString,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
   
}

"LOGIC : Here we are cheking all substring from the starting position that whether its a palindrome or not..
  If it's a palindrome then add that into the list and make a recursive call for REST OF THE STRING"
