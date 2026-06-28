class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n=heights[0].length;
        List<List<Integer>> res = new LinkedList<>();
        traverse(heights,res);
        return res;
    }
    public static void traverse(int[][] heights,List<List<Integer>> res){
        int m=heights.length,n=heights[0].length;

        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                int[] found = new int[2];
                dfs(i,j,heights,res,found,new boolean[m][n]);
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);
                if(found[0] ==1 && found[1] ==1) res.add(list);

            }
        }
    }
    public static void dfs(int x,int y,int[][] heights,List<List<Integer>> res ,int[] found,boolean[][] visited){
        visited[x][y] =true;
        int m =heights.length;
        int n =heights[0].length;
        if(found[0] ==1 && found[1] ==1) return;
        
        if(x==0 || y==0){
            found[0]=1;
        }
        if(x==m-1 || y == n-1){
            found[1]=1;
        }
        int[][] dirs = {{0,1},{0,-1},{-1,0},{1,0}};
        for(int[] d:dirs){
            int newX=x + d[0];
            int newY = y +d[1];
            if(newX >=0 && newX < m && newY>=0 && newY <n && heights[newX][newY] <= heights[x][y] && !visited[newX][newY] ){
                dfs(newX,newY,heights,res,found,visited);
            }
        }
        return;
    }
}
