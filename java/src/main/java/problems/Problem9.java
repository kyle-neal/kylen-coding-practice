/*
 Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines, 
write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.   

Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
 */
package main.java.problems;

import java.util.HashMap;

public class Problem9 extends Problem {
    public void solve() {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            if (h.containsKey(c)) {
                int oldValue = h.get(c);
                h.replace(c, oldValue, oldValue + 1);
            } else {
                h.put(c, 1);
            }
        }
        for (char c : ransomNote.toCharArray()) {
            if (!h.containsKey(c) || h.get(c) == 0) return false;
            else {
                int oldValue = h.get(c);
                h.replace(c, oldValue, oldValue - 1);
            }
        }
        return true;
    }
}
