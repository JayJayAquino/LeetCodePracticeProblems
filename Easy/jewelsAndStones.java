// You're given strings J representing the types of stones that are jewels,
// and S representing the stones you have.
// Each character in S is a type of stone you have.
// You want to know how many of the stones you have are also jewels.
//
// The letters in J are guaranteed distinct,
// and all characters in J and S are letters.
// Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
// Example 1:
// Input: J = "aA", S = "aAAbbbb"
// Output: 3
//
// Example 2:
// Input: J = "z", S = "ZZ"
// Output: 0

import java.util.HashMap;

public class jewelsAndStones
{
  public static void main(String [] args)
  {
    String jewels = "aA";
    String stones = "aAAbba";

    //First solution has time complexity of n^2
    System.out.println(numOfJewels1(jewels, stones));


  }

  public static int numOfJewels1(String jewels, String stones)
  {
    int total = 0;

    for(int i = 0; i < jewels.length(); i++){
      for(int j = 0; j < stones.length(); j++){
        if(jewels.charAt(i) == stones.charAt(j)){
          total++;
        }
      }
    }

    return total;
  }
}
