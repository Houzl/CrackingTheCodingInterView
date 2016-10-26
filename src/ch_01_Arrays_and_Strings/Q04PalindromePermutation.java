/**
 * 
 */
package ch_01_Arrays_and_Strings;

/**
 * @author houzl
 *
 */
public class Q04PalindromePermutation {
  
  public static boolean isPalindromePermutation(String str){
    int[] checker = new int[26];
    String strLower = str.toLowerCase();
    for (int i = 0; i < str.length(); i++){
      int j = strLower.charAt(i) - 'a';
      if (j >= 0 && j <26){
        checker[j]++;
      }
    }
    int count = 0;
    for(int i = 0; i < 26; i++){
      if (checker[i]%2 != 0) count++;
    }
    if (count > 1) return false;
    else return true;
  }

  /**
   * @param args
   * 
   */
  public static void main(String[] args) {
    //TestCase come from https://github.com/careercup/CtCI-6th-Edition/tree/master/Java
    String[] strings = {"Rats live on no evil star",
                        "A man, a plan, a canal, panama",
                        "Lleve",
                        "Tacotac",
                        "asda"};
    for (String s : strings) {
        System.out.println(s + " : " + isPalindromePermutation(s));
    }

  }

}
