class Solution {
    public int countServers(int[][] grid) {
        int rows = grid.length;
        int col = grid[0].length;

        int[] rowsCount = new int[rows];
        int[] colCount = new int[col];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    ++rowsCount[i];
                    ++colCount[j];
                }
            }
        }

        int server = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1 &&(rowsCount[i] > 1 || colCount[j] > 1) ){
                    server++;
                }
            }
        }

        return server;
    }
}