package ch_01_Arrays_and_Strings;

import java.util.HashSet;

import utility.Matrix;
/**
 * @author houzl
 *
 */
public class Q08ZeroMatrix {
  
  static void zeroMatrix(int[][] m){
    int row = m.length;
    int column = m[0].length;
    HashSet<Integer> zeroRow = new HashSet<Integer>();
    HashSet<Integer> zeroColumn = new HashSet<Integer>();
    for(int i = 0; i < row ; i++){
      for(int j = 0; j < column ; j++){
        if (m[i][j] == 0){
          zeroRow.add(i);
          zeroColumn.add(j);
        }
      }      
    }
    //Update 0 row
    for (int i: zeroRow){
      for(int j = 0; j < column ; j++)
        m[i][j] = 0;
    }
    //Update 0 column
    for (int j: zeroColumn){
      for(int i = 0; i < row ; i++)
        m[i][j] = 0;
    }
  }

  public static void main(String[] args) {
    int[][] m ={{1,2,0},{3,0,1},{5,6,1}};
    Matrix.printMatrix(m);
    zeroMatrix(m);
    Matrix.printMatrix(m);
  }

}
