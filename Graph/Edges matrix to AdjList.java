 Given no. of nodes -> n = 7
 edges = [[0,1],[1,2],[3,1],[4,0],[0,5],[5,6]]      "Connection of nodes"
   
   "WE HAVE TO MAKE GRAPH (AdjLIST)"
   
   
         ' AdjLIST is ArrayList of ArrayList'
          
  private ArrayList<ArrayList<Integer>> buildGraph(int[][] edges, int n) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<Integer>());

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        return graph;
}
