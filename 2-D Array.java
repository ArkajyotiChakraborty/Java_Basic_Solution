class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int m = grid[0].length; // columun
        int n = grid.length;  // rows
        int i=n-1;
        int j = 0;
      while(i>=0&&j<m)
      {
          if(grid[i][j]<0)
          {
              count+=m-j;
              i--;
          }else
          {
              j++;
          }
      }
        return count;
    }
}
