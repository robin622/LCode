package secondsemester.classes.dp2;
public class Solution {

  public int largestSquareOfMatches(int[][] matrix) {
    if(matrix.length < 2 || matrix[0].length < 2) {
      return 0;
    }
    //TopToDown
    int[][] topToDown = new int[matrix.length][matrix[0].length];
    //LeftToRight
    int[][] leftToRight = new int[matrix.length][matrix[0].length];
    for(int i = matrix.length - 1; i >=0; i--) {
      for(int j = matrix[0].length - 1; j >=0; j--) {
        if(matrix[i][j] == 0) {
          topToDown[i][j] = 0;
          leftToRight[i][j] = 0;
        } else {
          if(matrix[i][j] == 1 || matrix[i][j] == 3) {
            if(j + 1 >= matrix[0].length) {
              leftToRight[i][j] = 1;
            } else {
              leftToRight[i][j] = leftToRight[i][j+1] + 1;
            }
          }
          if (matrix[i][j] == 2 || matrix[i][j] == 3) {
            if(i + 1 >= matrix.length) {
              topToDown[i][j] = 1;
            } else {
              topToDown[i][j] = topToDown[i+1][j] + 1;
            }
          }
        }
      }
    }
    int max = 0;
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[0].length; j++) {
        if(matrix[i][j] !=0) {
          max = Math.max(max, getMaxSqure(i, j, topToDown, leftToRight));
        }
      }
    }
    return max;
  }

  private int getMaxSqure(int x, int y, int[][] topToDown, int[][] leftToRight) {
    int min = Math.min(topToDown[x][y], leftToRight[x][y]);
    for(int i = min; i >0; i--) {
      if(y+i < topToDown[0].length && topToDown[x][y + i] >= i && 
              x+i < leftToRight.length && leftToRight[x + i][y] >= i) {
        return i;
      }
    }
    return 0;
  }
  
  public static void main(String[] args) {
    Solution s = new Solution();
    int[][] matrix = new int[][]{{3,1,2,2}, {2,3,2,0}, {1,1,0,3}, {3,3,0,1}, {0,0,2,1}, {1,3,2,0},
            {1,0,2,2}, {1,2,2,3}};
    System.out.println(s.largestSquareOfMatches(matrix));
  }
}
