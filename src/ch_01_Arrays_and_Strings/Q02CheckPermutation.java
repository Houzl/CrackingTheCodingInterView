/**
 * @author houzl
 */
package ch_01_Arrays_and_Strings;

import java.util.HashMap;

public class Q02CheckPermutation {
  
  public static boolean isPermutation(String s1, String s2){
    boolean r = true;
    String s1t = s1.trim();
    String s2t = s2.trim();
    if (s1t.length() != s2t.length()) return false;
    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    for (int i = 0; i < s1t.length(); i++){
      if (hm.get(s1t.charAt(i)) == null) hm.put(s1t.charAt(i), 1);
      else hm.put(s1t.charAt(i), hm.get(s1t.charAt(i)) + 1);
      if (hm.get(s2t.charAt(i)) == null) hm.put(s2t.charAt(i), -1);
      else hm.put(s2t.charAt(i), hm.get(s2t.charAt(i)) - 1);
    }
    for (int val : hm.values()){
      if (val != 0) r = false;
      break;
    }
    return r;
  }

  public static void main(String[] args) {
    //TestCase come from https://github.com/careercup/CtCI-6th-Edition/tree/master/Java
    String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
    for (String[] pair : pairs) {
        String word1 = pair[0];
        String word2 = pair[1];
        boolean anagram = isPermutation(word1, word2);
        System.out.println(word1 + ", " + word2 + ": " + anagram);
    }
 }
}
