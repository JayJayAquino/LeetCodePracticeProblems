// Given a 32-bit signed integer, reverse digits of an integer.
// Ex 1
// Input: 123
// Output: 321
// Ex 2
// Input: -123
// Output: -321
// Ex 3
// Input: 120
// Output: 21
//

import java.util.Stack;


public class leetCode1
{
  public static void main(String [] args)
  {
    int i = -1230;
    System.out.println(reverseInt(i));
  }

  public static int reverseInt(int i)
  {
    int new_i = 0;

    if(i > 0){
      while(i > 0){
        new_i *= 10;
        new_i += i % 10;
        i = i/10;
      }
    }else{
      while(i < 0){
        new_i *= 10;
        new_i += i % 10;
        i = i/10;
      }
    }

    return new_i;
  }
}
