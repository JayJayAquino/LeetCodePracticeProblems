// Given a string, find the first non-repeating character in it and return it's index.
// If it doesn't exist, return -1.

import java.util.HashMap;

public class firstUniqueChar {
    public static void main(String [] Args) {
        String s1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!";
        String s2 = "loveleetcode";

        //first solution
        System.out.println(findUniqueChar1(s1));
        System.out.println(findUniqueChar1(s2));

        //second solution
        System.out.println(findUniqueChar2(s1));
        System.out.println(findUniqueChar2(s2));

    }

    // First solution
    public static int findUniqueChar1(String word) {
        int result_index = -1;
        boolean duplicate;
        boolean foundUnique = false;

        for(int i = 0; i < word.length(); i++){

            duplicate = false;

            for(int j = 0; j < word.length(); j++){

                // if duplicate is found
                if(j != i && word.charAt(i) == word.charAt(j)){
                    duplicate = true;   
                }

            }

            if(!duplicate && !foundUnique) {
                result_index = i;
                foundUnique = true;
            }

        }

        return result_index;
    }

    // Second solution
    public static int findUniqueChar2(String s){
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();

        // build the hashmap
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for(int i = 0; i < n; i++) {
            if(count.get(s.charAt(i)) == 1) return i; 
        }
        
        return -1;
    }
}