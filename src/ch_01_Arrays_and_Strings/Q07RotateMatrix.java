/**
 * 
 */
package ch_01_Arrays_and_Strings;

import utility.Matrix;

/**
 * @author houzl
 *
 */
public class Q07RotateMatrix {
  
  static void rotateMatrix(int[][] m){
    int n = m.length;
    int offSet = 0;
    //from outside to inside
    for (int i = n; i >= 2; i -= 2){
      //Change n - 1 elements. 
      for (int j = 0; j < i - 1; j++){
        //left top corner.
        int tmp = m[offSet][offSet + j];
        //left bottom corner -> left top corner.
        //row = 
        m[offSet][offSet + j] = m[i + offSet - 1 - j][offSet];
        //right bottom corner -> left bottom corner
        m[i + offSet - 1 - j][offSet] = m[i + offSet - 1][i + offSet - 1 -j];
        //right top -> right bottom corner
        m[i + offSet - 1][i + offSet - 1 -j] = m[offSet + j][i + offSet - 1];
        //left top corner -> right top 
        m[offSet + j][i + offSet - 1] = tmp;
      }
      offSet++; 
    }
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    int[][] m ={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
                };
    
    int[][] m2 ={{1,2,3},
                {4,5,6},
                {7,8,9}
                };
    
    Matrix.printMatrix(m);
    rotateMatrix(m);
    Matrix.printMatrix(m);
    
    Matrix.printMatrix(m2);
    rotateMatrix(m2);
    Matrix.printMatrix(m2);
  }
}
