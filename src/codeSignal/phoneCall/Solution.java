package codeSignal.phoneCall;

public class Solution {
    char firstNotRepeatingCharacter(String s) {
        for (int i=0; i < s.length(); i ++){
            if(s.charAt(i) != '_'){
                for (int j = i+1; j< s.length(); j++){
                    if (s.charAt(i) == s.charAt(j)){
                        s = s.replaceAll(String.valueOf(s.charAt(i)), "_");
                        break;
                    }
                    if (j == s.length()-1)
                        return s.charAt(i);
                }
            }
        }
        return '_';
    }

}
