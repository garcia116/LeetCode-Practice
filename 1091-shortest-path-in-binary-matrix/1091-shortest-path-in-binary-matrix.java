class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return -1;
        }
    
        int row = grid.length;
        int col = grid[0].length;

        if(grid[0][0] == 1 || grid[row - 1][col - 1] == 1){
            return -1;
        }
        
        int[][] dirs = {{-1,-1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
                
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0,1});
        
        while(!queue.isEmpty()){
            
            int[] curPos = queue.poll();
            int distance = curPos[2];
            
            if(curPos[0] == row - 1 && curPos[1] == col - 1){
                return distance;
            }
            
            for(int[] dir: dirs){
                int nextX = curPos[0] + dir[0];
                int nextY = curPos[1] + dir[1];

                if(nextX >= 0 && nextX < row && nextY >= 0 && nextY < col && grid[nextX][nextY] == 0){
                    queue.offer(new int[]{nextX, nextY, distance + 1});
                    grid[nextX][nextY] = 1;
                }
                
            }
            
        }
        
        return -1;
    }
}