/**
 * 
 */
package ch_01_Arrays_and_Strings;

/**
 * @author houzl
 *
 */
public class Q03URLify {
  
  public static String cURLify(String str, int trueLen){
    int len = str.length();
    if (len == trueLen) return str;
    //pos in result;
    char[] charArray = str.toCharArray();
    for (int i = trueLen - 1; i >= 0; i--){
      if (charArray[i] == ' '){
        charArray[--len] = '0';
        charArray[--len] = '2';
        charArray[--len] = '%';
      }
      else charArray[--len] = charArray[i];
    }
    return String.valueOf(charArray);
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    String str = "Mr John Smith    ";
    System.out.println(cURLify(str,13));
  }

}
