class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer>answer=new ArrayList<>();
    int n=matrix.length;
    int m=matrix[0].length;
      int start_Row=0;
      int end_Row=n-1;
      int start_col=0;
      int end_col=m-1;
      while(start_Row<=end_Row&&start_col<=end_col)
      {
        for(int j=start_col;j<=end_col;j++)
        {
             answer.add(matrix[start_Row][j]);
        }
        for(int i=start_Row+1;i<=end_Row;i++)
        {
            answer.add(matrix[i][end_col]);

        }
        for(int j=end_col-1;j>=start_col;j--)
        {
            if(start_Row==end_Row)
            {
               break;
            }
            answer.add(matrix[end_Row][j]);
        }
        for(int i=end_Row-1;i>=start_Row+1;i--)
        {
            if(start_col==end_col)
            {
                break;
            }
            answer.add(matrix[i][start_col]);
        }
        start_col++;
         start_Row++;
         end_col--;
         end_Row--;
      } 
      return  answer;

   }

      }