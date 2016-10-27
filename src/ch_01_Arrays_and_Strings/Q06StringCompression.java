/**
 * 
 */
package ch_01_Arrays_and_Strings;

/**
 * @author houzl
 *
 */
public class Q06StringCompression {
  
  public static String stringCompression(String str){
    //The best case for 2 char is equal.
    if (str.length() <= 2) return str;
    StringBuilder sb = new StringBuilder();
    int count = 1;
    char preChar = ' ';
    for(int i = 0; i < str.length(); i++){
      if (preChar == str.charAt(i)){
        count++;
      }
      else{
        if (preChar != ' '){
          sb.append(preChar);
          sb.append(count);
        }
        preChar = str.charAt(i);
        count = 1;
      }
    }
    sb.append(preChar);
    sb.append(count);
    String r = sb.toString();
    if (r.length() < str.length()) return r;
    else return str;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(stringCompression(""));
    System.out.println(stringCompression("ab"));
    System.out.println(stringCompression("aa"));
    System.out.println(stringCompression("a"));
    System.out.println(stringCompression("abcdefg"));
    System.out.println(stringCompression("aabcccccaaa"));

  }

}
