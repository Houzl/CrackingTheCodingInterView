/**
 * 
 */
package ch_01_Arrays_and_Strings;

/**
 * @author houzl
 *
 */
public class Q05OneAway {
  
  public static boolean isOneAway(String s1, String s2){
    String sLong;
    String sShort;
    if (s1.length() > s2.length()){
      sLong = s1;
      sShort = s2;
    }
    else{
      sLong = s2;
      sShort = s1;
    }
    //two empty string
    if (sLong.length() == 0) return false;
    //Have 2 more chars different.
    if (sLong.length() - sShort.length() > 1) return false;
    //sShort is a substring of sLong
    if (sLong.substring(0, sLong.length() - 1).equals(sShort)) return true;

    int diffCount = 0;
    //pos of sLong
    int j = 0;
    for (int i = 0; i < sShort.length(); i++){
      if (sShort.charAt(i) != sLong.charAt(j)){
        diffCount++;
        //Maximum of difference is 1. if bigger, return false;
        if (diffCount > 1) return false;
        if (sShort.length() != sLong.length()) i--;
      }
      j++;
    }
    if (diffCount == 1) return true;
    //Same return false;
    else return false;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    String[][] tests = {{"a", "b", "true"}, 
                        {"", "d", "true"},
                        {"d", "de", "true"},
                        {"pale", "pse", "false"},
                        {"acdsfdsfadsf", "acdsgdsfadsf", "true"},
                        {"acdsfdsfadsf", "acdsfdfadsf", "true"},
                        {"acdsfdsfadsf", "acdsfdsfads", "true"},
                        {"acdsfdsfadsf", "cdsfdsfadsf", "true"},
                        {"adfdsfadsf", "acdfdsfdsf", "false"},
                        {"adfdsfadsf", "bdfdsfadsg", "false"},
                        {"adfdsfadsf", "affdsfads", "false"},
                        {"pale", "pkle", "true"},
                        {"pkle", "pable", "false"}};
    
    for (int i = 0; i < tests.length; i++) {
      String[] test = tests[i];
      String a = test[0];
      String b = test[1];
      boolean expected = test[2].equals("true");

      System.out.println(isOneAway(a, b) == expected);
    }
  }
}
