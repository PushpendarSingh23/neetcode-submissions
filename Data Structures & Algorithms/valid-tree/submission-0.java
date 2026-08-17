class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n-1) return false;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);}
        boolean[] vis = new boolean[n];
        if(!dfs(0,-1,graph,vis)) return false;
        for(boolean node : vis){
            if(!node) return false;}
        return true;
    }
    public boolean dfs(int node,int parent,List<List<Integer>> graph, boolean[] vis){
        vis[node] = true;
        for(int nei : graph.get(node)){
            if(nei == parent) continue;
            if(vis[nei]) return false;
            if(!dfs(nei,node,graph,vis)) return false;}
            return true;
    }
}
