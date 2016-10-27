package ch_01_Arrays_and_Strings;
/**
 * @author houzl
 *
 */
public class Q09StringRotation {
  static boolean isRotation(String s1, String s2){
    String s3 = s2 + s2;
    return isSubstring(s3, s1);
  }
  
  static boolean isSubstring(String s1, String s2){
    if (s1.indexOf(s2) == -1) return false;
    else return true;
  }
  
  public static void main(String[] args) {
    System.out.println(isRotation("waterbottle","erbottlewat"));

  }
}
