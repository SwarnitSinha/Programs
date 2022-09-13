Return the minimum number of groups you need to make.
Two intervals intersect if there is at least one common number between them. For example, the intervals [1, 5] and [5, 8] intersect.

Input: intervals = [[5,10],[6,8],[1,5],[2,3],[1,10]]
Output: 3
Explanation: We can divide the intervals into the following groups:
- Group 1: [1, 5], [6, 8].
- Group 2: [2, 3], [5, 10].
- Group 3: [1, 10].
It can be proven that it is not possible to divide the intervals into fewer than 3 groups.
  
  
  "GREEDY - SAME AS MEETING ROOM 2"
  
  class Solution {
    public int minGroups(int[][] inter) {
        
        int[] begin = new int[inter.length], end = new int[inter.length];
        
        for(int i =0;i<inter.length;i++){
            begin[i] = inter[i][0];
            end[i] = inter[i][1];
        }
        Arrays.sort(begin);
        Arrays.sort(end);
        
        int j = 0;
        for(int i = 0 ;i<inter.length;i++){
            if(begin[i]>end[j]) j++;
        }
        return inter.length-j;
    }
}


LOGIC -> TOTAL MEETING -  MEETINGS THAT CAN BE HELD TOGETHER
