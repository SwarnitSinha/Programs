class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidate, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        combinationSumUtil(candidate,0,target,list);
        return res;
    }
    public void combinationSumUtil(int[] ar, int ind, int k,
                                ArrayList<Integer> list){
        
        //base condition
        
        if(ind==ar.length||k==0){
            if(k==0){
                res.add(new ArrayList(list));
            }
            return;
        }
        
        if(ar[ind]<=k){
            list.add(ar[ind]);
            combinationSumUtil(ar,ind,k-ar[ind],list);
            list.remove(new Integer(ar[ind]));
        }
        combinationSumUtil(ar,ind+1,k,list);
        
    }
}
