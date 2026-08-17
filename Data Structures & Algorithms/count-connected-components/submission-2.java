class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> Graph = new ArrayList<>();
        for(int i=0;i<n;i++) Graph.add(new ArrayList<>());
        for(int[] edge : edges){
            int u = edge[0], v = edge[1];
            Graph.get(u).add(v);
            Graph.get(v).add(u);}
        int[] vis = new int[n];
        Arrays.fill(vis, -1);
        int count = 0;
        for(int i=0;i<n;i++){
            if(vis[i] == -1) count++;
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            vis[i] = 1;
            while(!q.isEmpty()){
            int node = q.remove();
            for(int nei : Graph.get(node)){
                if(vis[nei] == -1){
                    vis[nei] = 1;
                    q.add(nei);}}}}
        return count;

    }
}
