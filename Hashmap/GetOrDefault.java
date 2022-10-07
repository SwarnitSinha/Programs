class Solution {
	public int minSetSize(int[] arr) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
    
  }
  
}
WORKS IN TREEMAP AS WELL

if(map.containsKey(start)){
    map.put(start,map.get(start)+1);
}					   	"OR"      map.put(start, map.getOrDefault(start,0)+1);
else{
    map.put(start,1);
}



if(map.containsKey(end)){
    map.put(end,map.get(end)-1);
}						"OR"	map.put(end, map.getOrDefault(end,0)-1);
else{
    map.put(end,-1);
}
       
        
