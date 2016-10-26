/**
 * @author houzl
 */
package ch_01_Arrays_and_Strings;

public class Q01IsUnique {

  public static boolean isUnique(String str) {
    boolean r = true;
    for(int i = 0; i < str.length(); i++){
      if (str.indexOf(str.charAt(i), i + 1) != -1){
        r = false;
        break;
      }
    }
    return r;
  }
  
  public static void main(String[] args) {
    String[] words = {"abcde", "apple", "apPle"};
    for (String word : words) {
        System.out.println(word + ": " + isUnique(word));
    }
  }
}
